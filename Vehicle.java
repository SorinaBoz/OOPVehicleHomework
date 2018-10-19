public abstract class Vehicle {
    private int speed;
    private int gear;

    public abstract void changeGear(int newGear);
    public abstract void speedUp(int increment);
    public abstract void applyBreaks(int decrement);
    public abstract void printState();



}
