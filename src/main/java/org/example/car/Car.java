package org.example.car;

public class Car {
    private HumanDriver driver;
    private CarEngine engine;
    private CarAccumulator accumulator;

    public Car(HumanDriver driver, CarEngine engine, CarAccumulator accumulator) {
        this.driver = driver;
        this.engine = engine;
        this.accumulator = accumulator;
    }

    public HumanDriver getDriver() {
        return driver;
    }

    public void setDriver(HumanDriver driver) {
        this.driver = driver;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }

    public CarAccumulator getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(CarAccumulator accumulator) {
        this.accumulator = accumulator;
    }

    public void drive() {
        System.out.println(driver + " driving a car.");
    }
}
