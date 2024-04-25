class VehicleRentalService {
    public void rentVehicle(String vehicleType, int rentalDuration) {
        System.out.println("Renting a " + vehicleType + " for " + rentalDuration + " days.");
    }
    
    public void rentVehicle(String vehicleType, int rentalDuration, boolean includeInsurance) {
        if (includeInsurance) {
            System.out.println("Renting a " + vehicleType + " for " + rentalDuration + " days with insurance.");
        } else {
            System.out.println("Renting a " + vehicleType + " for " + rentalDuration + " days without insurance.");
        }
    }
    
    public void rentVehicle(String vehicleType, int rentalDuration, boolean includeInsurance, boolean hasChildSeat) {
        if (includeInsurance && hasChildSeat) {
            System.out.println("Renting a " + vehicleType + " for " + rentalDuration + " days with insurance and a child seat.");
        } else if (includeInsurance) {
            System.out.println("Renting a " + vehicleType + " for " + rentalDuration + " days with insurance.");
        } else if (hasChildSeat) {
            System.out.println("Renting a " + vehicleType + " for " + rentalDuration + " days with a child seat.");
        } else {
            System.out.println("Renting a " + vehicleType + " for " + rentalDuration + " days without insurance or child seat.");
        }
    }
}
