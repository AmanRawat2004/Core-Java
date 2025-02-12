
class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println("Accelerating... New speed: " + speed + " km/h");
    }
}
