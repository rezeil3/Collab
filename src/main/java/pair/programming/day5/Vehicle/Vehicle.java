package pair.programming.day5.Vehicle;

public class Vehicle {
    private int doors, seats, wheels;

    public Vehicle(int doors, int seats, int wheels) {
        this.doors = doors;
        this.seats = seats;
        this.wheels = wheels;

        System.out.println("Building a Vehicle...");
        System.out.println("number of doors  = " + this.getDoors());
        System.out.println("number of seats  = " + this.getSeats());
        System.out.println("number of wheels = " + this.getWheels());
    }

    public Vehicle() {
        System.out.println("Building a Vehicle...");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void drive(){
        System.out.println("Driving a Vehicle");
    }

}
