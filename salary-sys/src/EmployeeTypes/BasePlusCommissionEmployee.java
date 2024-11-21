package EmployeeTypes;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    //Constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialNumber, String contractType, double commissionRate, double sales, double baseSalary) {
        super(firstName, lastName, socialNumber, contractType, commissionRate, sales);
        this.baseSalary = baseSalary;
    }

    //Override the income with this employee types salary
    @Override
    public double income() {
        return baseSalary + super.income();
    }
    //Override the salary output for this employee type
    @Override
    public String toString() {
        return super.toString() + ", Base Salary: " + baseSalary;
    }
}