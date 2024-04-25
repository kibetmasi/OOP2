class Vehicle {
    protected String manufacturer;
    protected String model;
    
    public Vehicle(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
}

class Motorcycle extends Vehicle {
    private int engineDisplacement;
    
    public Motorcycle(String manufacturer, String model, int engineDisplacement) {
        super(manufacturer, model);
        this.engineDisplacement = engineDisplacement;
    }
    
    public void start() {
        System.out.println("Starting the motorcycle engine...");
    }
    
    public void accelerate() {
        System.out.println("Accelerating the motorcycle...");
    }
}

class Bus extends Vehicle {
    private int passengerCapacity;
    
    public Bus(String manufacturer, String model, int passengerCapacity) {
        super(manufacturer, model);
        this.passengerCapacity = passengerCapacity;
    }
    
    public void openDoors() {
        System.out.println("Opening the bus doors...");
    }
    
    public void closeDoors() {
        System.out.println("Closing the bus doors...");
    }
}

class Trailer extends Vehicle {
    private double length;
    
    public Trailer(String manufacturer, String model, double length) {
        super(manufacturer, model);
        this.length = length;
    }
    
    public void attach() {
        System.out.println("Attaching the trailer...");
    }
    
    public void detach() {
        System.out.println("Detaching the trailer...");
    }
}

class Boat extends Vehicle {
    private String propulsionType;
    
    public Boat(String manufacturer, String model, String propulsionType) {
        super(manufacturer, model);
        this.propulsionType = propulsionType;
    }
    
    public void startEngine() {
        System.out.println("Starting the boat engine...");
    }
    
    public void stopEngine() {
        System.out.println("Stopping the boat engine...");
    }
}
