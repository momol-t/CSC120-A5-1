import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<Passenger>(maxCapacity);
    }


    public int getCapacity(){
        return this.maxCapacity;
    }

    public int seatsRemaining(){
        return this.maxCapacity - this.passengers.size();
    }

    public void addPassenger(Passenger p){
        if (this.passengers.contains(p)){
            throw new RuntimeException("passenger already on board");
        } else if (seatsRemaining() <= 0){
            throw new RuntimeException("Car is full");
        }
        this.passengers.add(p);
        System.out.println(p.getName() + "has been added to car");
    }
    public void removePassenger(Passenger p){
        if (passengers.contains(p)){
            passengers.remove(p);
        }else{
            throw new RuntimeException();
        }
    }

    public void manifest(){
        if (seatsRemaining() == 0){
            System.out.println("This car is empty.");
        } else {
            for(Passenger p : passengers){
                System.out.println(p);
            }
        }

    }

}