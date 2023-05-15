package pair.programming.day7;


import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Customer jane = new Customer("Jane");
        Cashier john = new Cashier("John", LocalTime.of(8,0,0),LocalTime.of(10,0,0));
        Store store = new Store(jane,john);
        store.shop();
    }

}
