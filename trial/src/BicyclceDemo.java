class BicyclceDemo {
    public static void main(String[] args) {
        
        //AMBike objects
        AMBike bike1 = new AMBike();
        AMBike bike2 = new AMBike();

        //invoking methods on those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
