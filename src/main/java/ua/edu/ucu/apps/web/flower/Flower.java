package ua.edu.ucu.apps.web.flower;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
public class Flower {
    private final String name = "Flower";
    /**
     * Flower class
     */
    private double sepalLength;
    /**
     * Sepal length
     */
    private FlowerColor color;

    /**
     * Color of the flower
     */
    private double price;
    /**
     * The price of flower
     */
    /*@Getter
    private FlowerType flowerType;
    /**
     * Type of flower
     */
    public final String getColor() {
        /**
         * returns color (string)
         */
        return color.toString();
    }
    public Flower(){

    }
    public Flower(FlowerColor color, int price, int sepalLength){
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }
    @Override
    public String toString(){
        return name;
    }
}
