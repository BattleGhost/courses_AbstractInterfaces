package org.example.car;

public class Engine implements CarEngine {
    private int power;
    private int volume;
    private String powerSystem;
    private String manufacturer;
    private double noiseLevel;

    public Engine() {
    }

    public Engine(int power, int volume, String powerSystem, String manufacturer, double noiseLevel) {
        this.power = power;
        this.volume = volume;
        this.powerSystem = powerSystem;
        this.manufacturer = manufacturer;
        this.noiseLevel = noiseLevel;
    }

    @Override
    public int power() {
        return power;
    }

    @Override
    public int volume() {
        return volume;
    }

    @Override
    public String powerSystem() {
        return powerSystem;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getPowerSystem() {
        return powerSystem;
    }

    public void setPowerSystem(String powerSystem) {
        this.powerSystem = powerSystem;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(double noiseLevel) {
        this.noiseLevel = noiseLevel;
    }
}
