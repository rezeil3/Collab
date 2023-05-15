package pair.programming.day4;

public class Main {
    public static void main(String[]args){
        //Employee using non parameterized constructor
        Employees personOne = new Employees();
        personOne.setId(22001);
        personOne.setFirstName("John");
        personOne.setLastName("Doe");
        personOne.setDepartment("ITOps");
        personOne.setPosition("IT");

        //Employee using parameterized constructor
        Employees personTwo = new Employees(22002,"Jane", "Doe", "SoftwareEngg","ASE");

        //Print details
        personOne.printDetails();
        personTwo.printDetails();
    }
}
