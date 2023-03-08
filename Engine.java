public class Engine {
    //will represent the locomotive engine, storing information about its fuel type, level, etc.
    private FuelType fuelType; 
    private double currentFuel; 
    private double fuelCapacity;

    public Engine(FuelType fuelType, double fuelCapacity){
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = fuelCapacity;
    }

    public String toString(){
        return "This train's engine is "+this.fuelType+". Current fuel: "+this.currentFuel+" of "+this.fuelCapacity;
    }
    
    public double getFuelCapacity(){
        return this.fuelCapacity;
    }

    public double getCurrentFuel(){
        return this.currentFuel;
    }

    public void refuel(){
        System.out.println("Refueled and ready to go! Current fuel level is: " + this.currentFuel);
        this.currentFuel = this.fuelCapacity;
    }

    public void go(){
        if (this.currentFuel > 14){
            this.currentFuel = this.currentFuel - 15;
        } else {
            throw new RuntimeException("There is not enough fuel in engine. The fuel level is: " + this.currentFuel);
        }
        System.out.println("Onward! Fuel left in engine: " + this.currentFuel);

    }
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }
}

