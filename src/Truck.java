public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public boolean validateLicensePlate() {
        if (hasTrailer) {
            String license = getLicensePlate();
            if (axles > 4) {
                return license.indexOf("MX") == license.length() - 2;
            } else {
                return license.indexOf("LX") == license.length() - 2;
            }
        } else {
            return true;
        }
    }

    public void printTruck() {
        System.out.println("License: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Axles: " + axles);
        System.out.println("Trailer: " + hasTrailer);
    }

}