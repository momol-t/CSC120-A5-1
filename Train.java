import java.util.ArrayList;

public class Train {
    private ArrayList<Car> carList;
    private final FuelType fuelType;
    private final double fuelCapacity;
    private int nCars;
    private final int passengerCapacity;
    private final Engine engine;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.carList = new ArrayList<Car>(nCars);
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
        this.engine = new Engine(fuelType, fuelCapacity);
    }

    public Engine getEngine(){
        System.out.println(engine.toString());
        return this.engine;
    }

    private void addCar(Car c){
        if (carList.contains(c)){
            throw new RuntimeException();
        } else if ((this.carList.size() + 2) >= this.nCars){
            throw new RuntimeException();
        }
        this.carList.add(c);
        this.nCars += 1;
    }

    


//This class will tie them all together
//This class should have a **composition** relationship with the `Engine` class
//This class has an **aggregation** relationship with the `Car` class
}
