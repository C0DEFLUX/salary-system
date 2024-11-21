package EmployeeTypes;

public class CommissionEmployee extends Employee
{
    private double commissionRate;
    private double sales;

    public CommissionEmployee(String firstName, String lastName, String socialNumber, String contractType, double commissionRate, double sales)
    {
        super(firstName, lastName, socialNumber, contractType);
        this.commissionRate = commissionRate;
        this.sales = sales;
    }

    @Override
    public double income()
    {
        return commissionRate * sales;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Commission Rate: " + commissionRate + ", Sales: " + sales;
    }
}
