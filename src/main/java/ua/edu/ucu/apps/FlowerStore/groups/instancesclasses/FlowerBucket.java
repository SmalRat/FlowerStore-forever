package ua.edu.ucu.apps.FlowerStore.groups.instancesclasses;

import ua.edu.ucu.apps.web.flowerBucket.specs.FlowerBucketSpecs;
import ua.edu.ucu.apps.web.flowerBucket.groups.FlowerPack;

import java.util.ArrayList;
import java.util.List;

public final class FlowerBucket {
    /**
     * Specifications of this bucket.
     * Linter... just be quiet..
     *
     */
    private final FlowerBucketSpecs specs = new FlowerBucketSpecs();

    /**
     * List of the packs inside bucket.
     */
    private final List<ua.edu.ucu.apps.web.flowerBucket.groups.FlowerPack> flowerPacks = new ArrayList<>();


    /**
     * Adds a pack of flowers to this bucket.
     * @param flowerPack flowerPacks to add.
     */
    public void add(final ua.edu.ucu.apps.web.flowerBucket.groups.FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
        specs.add(flowerPack);
    }


    /**
     * Returns the copy of flower packs inside this bucket.
     * @return returns an array
     */
    public ArrayList<ua.edu.ucu.apps.web.flowerBucket.groups.FlowerPack> getFlowerPacks() {
        return new ArrayList<FlowerPack>(flowerPacks);
    }


    /**
     * Returns true/false - whether this bucket matches pattern.
     * @param otherSpecs other specification.
     * @return returns boolean.
     */
    public boolean matches(final FlowerBucketSpecs otherSpecs) {
        return (this.specs.equal(otherSpecs));
    }


    /**
     * Returns the price of the bucket.
     * @return just something.
     */
    public double getPrice() {
        return specs.getPrice();
    }

}
