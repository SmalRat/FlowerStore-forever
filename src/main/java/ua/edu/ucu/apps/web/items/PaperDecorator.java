package ua.edu.ucu.apps.web.items;

public class PaperDecorator extends ItemDecorator{
    private final Item item;

    private static final String modifier = ",(in paper)";

    public PaperDecorator(Item item){
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
