package EmployeeTypes;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialNumber, String contractType, double commissionRate, double sales, double baseSalary) {
        super(firstName, lastName, socialNumber, contractType, commissionRate, sales);
        this.baseSalary = baseSalary;
    }

    @Override
    public double income() {
        return baseSalary + super.income();
    }

    @Override
    public String toString() {
        return super.toString() + ", Base Salary: " + baseSalary;
    }
}