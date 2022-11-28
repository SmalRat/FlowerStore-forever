package ua.edu.ucu.apps.FlowerStore.groups.specs;

import ua.edu.ucu.apps.web.flower.Flower;
import ua.edu.ucu.apps.web.flowerBucket.groups.FlowerPack;
import java.util.HashMap;

public class FlowerBucketSpecs {
    private HashMap<Flower, Integer> flowersInBucket = new HashMap<>();

    public FlowerBucketSpecs() {

    }

    public double getPrice() {
        double price = 0;
        for (Flower flower : flowersInBucket.keySet()) {
            price = price + flowersInBucket.get(flower) * flower.getPrice();
        }
        return price;
    }

    public void add(FlowerPack flowerPack) {
        Flower flowerType = flowerPack.getFlower();
        int flowerQuantity = flowersInBucket.getOrDefault(flowerType, 0);
        flowerQuantity += flowerPack.getAmount();
        flowersInBucket.put(flowerType, flowerQuantity);
    }

    private HashMap<Flower, Integer> getSpecsMapCopy() {
        return (HashMap<Flower, Integer>) flowersInBucket.clone();
    }

    public boolean equal(ua.edu.ucu.apps.web.flowerBucket.specs.FlowerBucketSpecs specs) {
        System.out.println(specs.getSpecsMapCopy());
        System.out.println("-------");
        System.out.println(this.getSpecsMapCopy());
        return (this.getSpecsMapCopy().equals(specs.getSpecsMapCopy()));
    }
}
