package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void CarIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Corolla", 2020);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void CarHas4Wheels() {
        Car car = new Car("Toyota", "Corolla", 2020);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void MotorcycleHas2Wheels() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "Travel", 2011);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void CarSpeedDuringTestDrive() {
        Car car = new Car("Toyota", "Corolla", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void MotorcycleSpeedDuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "Travel", 2011);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void CarSpeedAfterPark() {
        Car car = new Car("Toyota", "Corolla", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void MotorcycleSpeedAfterPark() {
        Motorcycle motorcycle = new Motorcycle("Jawa", "Travel", 2011);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}