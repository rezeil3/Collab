package pair.programming.day4;

public class Employees {
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private String position;

    public Employees() {
        //non parameterized constructor
    }

    public Employees(int id, String firstName, String lastName, String department, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    void printDetails(){
        System.out.println("**********[Employee Details]**********"
                         + "\n ID          : " + this.getId()
                         + "\n First Name  : " + this.getFirstName()
                         + "\n Last Name   : " + this.getLastName()
                         + "\n Department  : " + this.getDepartment()
                         + "\n Position    : " + this.getPosition()
                         + "\n **************************************");
    }
}
