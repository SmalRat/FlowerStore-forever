package ua.edu.ucu.apps.web.items;

public class RibbonDecorator extends ItemDecorator{
    private final Item item;

    private static final String modifier = ",(with paper)";

    public RibbonDecorator(Item item){
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
