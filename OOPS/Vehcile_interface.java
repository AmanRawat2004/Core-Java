/*Design and develop a context for given case study and implement an interface for Vehicles.
Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all
        these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
functionalities in their own class in their own way.*/

interface Vehcile{
    void gear(int a);
    void speed(int a);
    void brake(int a);
}
class Bicycle implements Vehcile{
    int speed;
    int gear;
    @Override
    public void gear(int Gear){
        gear=Gear;
    }
    @Override
    public void speed(int increament){
        speed = speed  + increament;
    }

    @Override
    public void brake(int decrement) {
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println(speed+" "+gear);
    }
}
public class Vehcile_interface {
    public static void main(String[] args){
        Bicycle bicycle = new Bicycle();
        bicycle.gear(2);
        bicycle.speed(3);
        bicycle.brake(1);
        bicycle.printStates();

    }
}
