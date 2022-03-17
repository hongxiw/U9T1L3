public class Taxi extends Car {

    private double fareCollected;

    public Taxi(String license, double toll, int passengers, boolean electric, double fareCollected) {
        super(license, toll, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi() {
        System.out.println("License: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric: " + isElectric());
        System.out.println("Discount: " + isDiscountApplied());
        System.out.println("Fare Collected: " + fareCollected);
    }

}
