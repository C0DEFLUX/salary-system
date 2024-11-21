package EmployeeTypes;

public class PartTimeEmployee extends Employee
{
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String firstName, String lastName, String socialNumber, String contractType, double HourlyRate, int hoursWorked)
    {
         super(firstName, lastName, socialNumber, contractType);
         this.hourlyRate = HourlyRate;
         this.hoursWorked = hoursWorked;
    }

    @Override
    public double income()
    {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}
