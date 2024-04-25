interface Amphibious {
    void dock();
    void launch();
}

interface AirVehicle {
    void takeOff();
    void land();
}

class AmphibiousPlane implements Amphibious, AirVehicle {
    @Override
    public void dock() {
        System.out.println("Amphibious plane is docking.");
    }
    
    @Override
    public void launch() {
        System.out.println("Amphibious plane is launching.");
    }
    
    @Override
    public void takeOff() {
        System.out.println("Amphibious plane is taking off.");
    }
    
    @Override
    public void land() {
        System.out.println("Amphibious plane is landing.");
    }
}

abstract class ElectricVehicle {
    public abstract void batteryType();
}

class ElectricCar extends ElectricVehicle {
    @Override
    public void batteryType() {
        System.out.println("Electric car uses Lithium-ion batteries.");
    }
}

class ElectricBike extends ElectricVehicle {
    @Override
    public void batteryType() {
        System.out.println("Electric bike uses Lithium-ion batteries.");
    }
}
