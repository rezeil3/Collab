package pair.programming.day6;

public class ContributorMain {
    public static void main(String[]args){

        //new contributor object
        Contributor contributor = new Contributor("John", "Doe", 45, 10000);
        System.out.printf("Salary: %.2f \n", contributor.getSalary());

        //new ordinary contributor object
        Ordinary ordinary = new Ordinary(contributor,"Ordinary");
        ordinary.displayContribution();

        //new special contributor object
        Special special = new Special(contributor,"Special");
        special.displayContribution();

        //new medisave contributor object
        MediSave mediSave = new MediSave(contributor,"MediSave");
        mediSave.displayContribution();
    }
}
