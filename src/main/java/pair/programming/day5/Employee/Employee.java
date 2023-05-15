package pair.programming.day5.Employee;

public class Employee {
    private int id, vacationDays;
    private String ename, email;

    public Employee() {
        //empty constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void printDetails(){
        System.out.println("Id              : " + this.getId()
                       + "\nName            : " + this.getEname()
                       + "\nEmail           : " + this.getEmail()
                       + "\nVacation Days   : " + this.getVacationDays());
    }
}
