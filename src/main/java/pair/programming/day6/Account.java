package pair.programming.day6;

import java.text.DecimalFormat;

public abstract class Account {

    private Contributor contributor;
    private String accountType;

    public Account(Contributor contributor, String accountType) {
        this.contributor = contributor;
        this.accountType = accountType;
    }

    public Contributor getContributor() {
        return contributor;
    }

    public void setContributor(Contributor contributor) {
        this.contributor = contributor;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    abstract public double getContributionRate();

    public double calculateContribution(){
        return getContributionRate() * contributor.getSalary();
    }

    public void displayContribution(){
        System.out.println("=== " + getAccountType() + " Account ===");
        System.out.printf("Contribution Amount: %.2f \n",calculateContribution());
    }

}
