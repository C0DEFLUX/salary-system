package EmployeeTypes;

public class FullTimeEmployee extends Employee
{
    private double salary;

    public FullTimeEmployee(String firstName, String lastName, String socialNumber, String contractType, double salary)
    {
        super(firstName, lastName, socialNumber, contractType);
        this.salary = salary;
    }
    //Override the income with this employee types salary
    @Override
    public double income()
    {
        return salary;
    }
    //Override the salary output for this employee type
    public String toString()
    {
        return super.toString() + ", Salary: " + salary;
    }
}
