package com.havefunwith.CLI.car;

/**
 * Default class only accessed within this package.
 */
class CarDAO {

    private static Car[] cars;
    private static int nextAvailableSlot = 0;
    private static final int CAPACITY = 5;

    static {
        cars = new Car[CAPACITY];
    }

    public void saveCar(Car car) {
        cars[nextAvailableSlot] = car;
        nextAvailableSlot++;
    }

    public Car[] getAllCars() {
        return cars;
    }
}
