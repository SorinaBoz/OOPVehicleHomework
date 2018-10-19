public class Bus extends Vehicle {
    public int gear = 0;
    public int speed = 0;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;

    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;

    }

    @Override
    public void applyBreaks(int decrement) {
        speed = speed - decrement;

    }

    @Override
    public void printState() {
        System.out.println("Bus state: gear: " + gear + " speed: " + speed);

    }
}
