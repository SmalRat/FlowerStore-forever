package ua.edu.ucu.apps.FlowerStore.flowers;

import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flower.FlowerColor;

public class Chamomile extends Flower {
    public Chamomile(){
        super();
    }
    public Chamomile(FlowerColor color, int price, int sepalLength) {
        super(color, price, sepalLength);
    }
}
