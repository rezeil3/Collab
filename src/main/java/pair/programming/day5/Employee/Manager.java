package pair.programming.day5.Employee;

public class Manager extends Employee{
    private int numberOfReportees;

    public Manager() {
        //empty constructor
    }

    public int getNumberOfReportees() {
        return numberOfReportees;
    }

    public void setNumberOfReportees(int numberOfReportees) {
        this.numberOfReportees = numberOfReportees;
    }

    public void printDetails(){
        System.out.println("Id                  : " + this.getId()
                       + "\nName                : " + this.getEname()
                       + "\nEmail               : " + this.getEmail()
                       + "\nVacation Days       : " + this.getVacationDays()
                       + "\nNumber of Reportees : " + this.getNumberOfReportees());
    }


}
