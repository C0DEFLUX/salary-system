package EmployeeTypes;

public class FullTimeEmployee extends Employee
{
    private double salary;

    public FullTimeEmployee(String firstName, String lastName, String socialNumber, String contractType, double salary)
    {
        super(firstName, lastName, socialNumber, contractType)
        {
            this.salary = salary;
        }
    }

    @Override
    public double income()
    {
        return salary;
    }

    public String toString()
    {
        return super.toString() + ", Salary: " + salary;
    }
}
