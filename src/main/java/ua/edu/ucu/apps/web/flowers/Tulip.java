package ua.edu.ucu.apps.web.flowers;

import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flower.FlowerColor;

public class Tulip extends Flower {
    private final String name = "Tulip";
    public Tulip(){
        super();
    }
    public Tulip(FlowerColor color, int price, int sepalLength) {
        super(color, price, sepalLength);
    }
}
