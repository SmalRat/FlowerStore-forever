package ua.edu.ucu.apps.web.items;

public class BasketDecorator extends ItemDecorator{
    private final Item item;

    private static final String modifier = ",(in basket)";

    public BasketDecorator(Item item){
        this.item = item;
    }
    @Override
    public String getDescription() {
        return item.getDescription() + modifier;
    }

    public double price() {
        return item.price();
    }
}
