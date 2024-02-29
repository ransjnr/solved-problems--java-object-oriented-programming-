public class AMBike implements Bicycle {
    private int cadence;
    private int speed;
    private int gear;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void printStates() {
        System.out.println("Cadence: " + cadence + ", Speed: " + speed + ", Gear: " + gear);
    }


}

