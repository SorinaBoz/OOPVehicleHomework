public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.changeGear(2);
        truck.speedUp(4);
        truck.applyBreaks(1);
        truck.printState();

        Bus bus = new Bus();
        bus.changeGear(1);
        bus.speedUp(4);
        bus.applyBreaks(3);
        bus.printState();

    }
}
