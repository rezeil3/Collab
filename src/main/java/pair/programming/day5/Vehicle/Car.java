package pair.programming.day5.Vehicle;

public class Car extends Vehicle{

    public Car(int doors, int seats, int wheels) {
        this.setDoors(doors);
        this.setSeats(seats);
        this.setWheels(wheels);

        System.out.println("Building a Car...");
        System.out.println("number of doors  = " + this.getDoors());
        System.out.println("number of seats  = " + this.getSeats());
        System.out.println("number of wheels = " + this.getWheels());
    }

    public void drive(){
        System.out.println("Driving a Car");
    }

}
