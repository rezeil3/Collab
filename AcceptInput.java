import java.util.Scanner;

public class AcceptInput {
    static int currentStock = 0;
    static int total;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean addMore = true;
        while (addMore) {
            System.out.println("Current Stock: " + total);
            System.out.print("Add Stock: ");
            String input = scanner.nextLine();
            int addStock = Integer.parseInt(input);
            total = getStock(currentStock, addStock);
            currentStock = total;
            System.out.println("Total Stock: " + total);

            System.out.print("Do you want to add more numbers? (yes/no): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                addMore = false;
            }
        }




            scanner.close();
    }
    public static int getStock(int current, int value) {
        return current + value;
    }
}

