package pair.programming.day7;

public class Customer extends Person{
    private ShoppingCart cart;
    public Customer(String name) {
        super(name);
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public void addToCart(Item item){
        this.cart.addItems(item);
    }

    public void removeFromCart(Item item){
        this.cart.removeItems(item);
    }

}
