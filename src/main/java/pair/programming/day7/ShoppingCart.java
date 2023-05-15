package pair.programming.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {
    private List <Item> items = new ArrayList<>();

    public ShoppingCart() {

    }

    public List getItems() {
        return items;
    }

    public void addItems(Item item) {
        items.add(item);
    }

    public void removeItems(Item item) {
        items.remove(item);
    }

    public double computeTotalPrice() {
        double price = 0;
        for(int i=0; i<this.getItems().size();i++){
            List <Item> tempItem = this.getItems();
            price += tempItem.get(i).getPrice();
        }

        return price;
    }

}
