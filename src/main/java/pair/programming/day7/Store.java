package pair.programming.day7;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Store {
    private Customer customer;
    private Cashier cashier;
    private List <Item> storeItems = new ArrayList<>();

    public Store(Customer customer, Cashier cashier) {
        this.customer = customer;
        this.cashier = cashier;
    }

    public static boolean isRan = false;

    public void shop(){

        System.out.println("------------------------------------------------------------------------ ");
        System.out.println("Press [1] Add item | [2] Remove item | [3] Checkout | [0] Exit");
        System.out.println("------------------------------------------------------------------------ ");
        int option = 0;
        try{
            Scanner scn = new Scanner(System.in);
            option = scn.nextInt();
        }catch (Exception e){
            System.out.println("Invalid Input! Please input number between 0-3");
            shop();
        }


        //ADD ITEM - OPTION 1
        if (option == 1){
            System.out.println("Store Items");
            System.out.println("------------------------------------------------------------------------ ");

            try{
                readStoreItemsFromFile("store-items.csv");
            }catch (IOException e){
                System.out.println("Error IO ex");
            }

            int addIndex = 0;
            System.out.println("------------------------------------------------------------------------ ");
            System.out.println("[0] - [6] to select items");
            System.out.print("Select item to add: ");
            try{
                Scanner scn = new Scanner(System.in);
                addIndex = scn.nextInt();
                if(!isRan){
                    customer.setCart(new ShoppingCart());
                    isRan = true;
                }else{}

                if(addIndex >= 0 && addIndex <=6) customer.addToCart(storeItems.get(addIndex));

                System.out.println("------------------------------------------------------------------------ ");
                System.out.println("Cart Items");
                System.out.println("------------------------------------------------------------------------ ");
                for(int i = 0; i<customer.getCart().getItems().size();i++ ){
                    List <Item> tempItem = customer.getCart().getItems();
                    System.out.print("["+ i + "] " + tempItem.get(i).getName());
                    System.out.println("          "+ tempItem.get(i).getPrice());
                }
            }catch (Exception e){
                System.out.println("Invalid Input! Please input number between 0-6");
                shop();
            }
            shop();
        }


        //REMOVE ITEM - OPTION 2
        else if (option == 2) {
            int removeIndex = 0;
            try{
                if(customer.getCart().getItems().isEmpty()){
                    System.out.println("\nCart is empty. No items to remove.");
                    shop();
                }else{
                    System.out.println("------------------------------------------------------------------------ ");
                    System.out.println("Cart Items");
                    System.out.println("------------------------------------------------------------------------ ");

                    for(int i = 0; i<customer.getCart().getItems().size();i++ ){
                        List <Item> tempItem = customer.getCart().getItems();
                        System.out.print("["+ i + "] " + tempItem.get(i).getName());
                        System.out.println("          "+ tempItem.get(i).getPrice());
                    }

                    System.out.print("Select item to remove: ");
                    try{
                        Scanner scn = new Scanner(System.in);
                        removeIndex = scn.nextInt();
                    }catch (Exception e){
                        System.out.println("Invalid Input!");
                        shop();
                    }
                    try{
                        customer.removeFromCart((Item) customer.getCart().getItems().get(removeIndex));
                        System.out.println("------------------------------------------------------------------------ ");
                        System.out.println("Cart Items");
                        System.out.println("------------------------------------------------------------------------ ");

                        for(int i = 0; i<customer.getCart().getItems().size();i++ ){
                            List <Item> tempItem = customer.getCart().getItems();
                            System.out.print("["+ i + "] " + tempItem.get(i).getName());
                            System.out.println("          "+ tempItem.get(i).getPrice());
                        }
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("Invalid Input! Please input number between 0-" + (customer.getCart().getItems().size()-1));
                        shop();
                    }
                }
            }catch (NullPointerException e){
                System.out.println("\nCart is empty. No items to remove.");
                shop();
            }
            shop();
        }


        //CHECKOUT - OPTION 3
        else if (option == 3) {
            try{
                if(customer.getCart().getItems().isEmpty()) {
                    System.out.println("Cart is empty. No items to checkout.");
                    shop();
                }else if(customer.getCart()!= null){
                    try {
                        saveReceiptToFile("receipt.txt");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    printReceipt();
                    isRan = false;
                }else{
                    System.out.println("Cart is empty. No items to checkout.");
                    shop();
                }
            }catch (NullPointerException e){
                System.out.println("Cart is empty. No items to checkout.");
                shop();
            }
        }


        //EXIT - DEFAULT
        else {
            //bye
        }
    }


    public void readStoreItemsFromFile(String filename) throws IOException {
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader("store-items.csv"));
        int i = 0;
        while ((line = br.readLine()) != null){
            String[] temp =  line.split(",");
            String index = "["+i+"]";
            storeItems.add(i, new Item(temp[0],Double.parseDouble(temp[1])));
            System.out.printf("%-10s %-20s %20.2f %n",index,storeItems.get(i).getName(),storeItems.get(i).getPrice());
            i++;
        }
    }

    public void printReceipt(){
        System.out.println("------------------------------------------------------------------------ ");
        System.out.println("                             RECEIPT ");
        System.out.println("------------------------------------------------------------------------ ");
        System.out.println("Cashier: " + cashier.getName() + "    Shift: " + cashier.getStartOfShift() + " - " +  cashier.getEndOfShift());
        System.out.println("Date: " + LocalDate.now());
        System.out.println("------------------------------------------------------------------------ ");
        System.out.println("Items: ");
        System.out.println("    Item name               Qty              Price        Total Price ");



        Set <Item> tempSet = new LinkedHashSet<Item>(customer.getCart().getItems());
        List<Item> tempList = new ArrayList<Item>(tempSet);
        int qty = 0;

        for(int i=0; i<tempList.size();i++){
            qty= Collections.frequency(customer.getCart().getItems(), customer.getCart().getItems().get(i));
            System.out.printf("%-20s %10d %20.2f %15.2f %n", tempList.get(i).getName(), qty, tempList.get(i).getPrice(),tempList.get(i).getPrice(),(tempList.get(i).getPrice() * qty));
        }
        double total = customer.getCart().computeTotalPrice();
        System.out.println("------------------------------------------------------------------------ ");
        System.out.printf("%-10s %10.2f %n","Total:", total);
        System.out.println("------------------------------------------------------------------------ ");
    }

    public void saveReceiptToFile(String filename) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
        bw.write("------------------------------------------------------------------------ " +"\n");
        bw.write("                             RECEIPT " +"\n");
        bw.write("------------------------------------------------------------------------ " +"\n");
        bw.write("Cashier: " + cashier.getName() + "    Shift: " + cashier.getStartOfShift() + " - " +  cashier.getEndOfShift() +"\n");
        bw.write("Date: " + LocalDate.now() +"\n");
        bw.write("------------------------------------------------------------------------ " +"\n");
        bw.write("Items: " +"\n");
        bw.write("    Item name             Qty          Price        Total Price " +"\n");

        Set <Item> tempSet = new LinkedHashSet<Item>(customer.getCart().getItems());
        List<Item> tempList = new ArrayList<Item>(tempSet);
        int qty = 0;

        for(int i=0; i<tempList.size();i++){
            qty= Collections.frequency(customer.getCart().getItems(), customer.getCart().getItems().get(i));
        }

        for(int i=0; i<tempList.size();i++){
            bw.write("    " + tempList.get(i).getName()
                    + "         " + qty
                    + "         " + tempList.get(i).getPrice()
                    + "         " + (tempList.get(i).getPrice() * qty)+"\n");
        }

        bw.write("------------------------------------------------------------------------ " +"\n");
        bw.write("TOTAL: ");
        double total = customer.getCart().computeTotalPrice();
        bw.write(total +"\n");
        bw.write("------------------------------------------------------------------------ " +"\n");
        bw.close();
    }
}
