package org.example.car;

public class Accumulator implements CarAccumulator {
    private int capacity;
    private String formFactor;
    private double height;
    private double width;
    private double depth;
    private String manufacturer;

    public Accumulator() {
    }

    public Accumulator(int capacity, String formFactor, double height, double width, double depth, String manufacturer) {
        this.capacity = capacity;
        this.formFactor = formFactor;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.manufacturer = manufacturer;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public double height() {
        return height;
    }

    @Override
    public double width() {
        return width;
    }

    @Override
    public double depth() {
        return depth;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
