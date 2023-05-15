package pair.programming.day5.Employee;

public class Main {
    public static void main(String[]args){
        //creates new manager named jp
        Manager jp = new Manager();

        //sets the attributes of manager jp
        jp.setId(101234);
        jp.setEname("John Peter");
        jp.setEmail("john.peter@accenture.com");
        jp.setVacationDays(20);
        jp.setNumberOfReportees(10);

        //displays manager jp details
        jp.printDetails();
    }
}
