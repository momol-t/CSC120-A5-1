public class Passenger {
//store information about an individual passenger
//class has **association** relationships with the `Car` class    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c){
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void getOffCar(Car c) {
        try {
            c.removePassenger(this);
        } catch (Exception e){
            System.err.println(e);
        }
    }
    public String getName(){
        return this.name;
    }
}