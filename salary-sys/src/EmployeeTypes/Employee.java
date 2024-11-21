package EmployeeTypes;

public abstract class Employee
{
    private String firstName;
    private String lastName;
    private String socialNumber;
    private String contractType;

    public Employee(String firstName, String lastName, String socialNumber, String contractType)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialNumber = socialNumber;
        this.contractType = contractType;
    }

    public abstract double income();

    @Override
    public String toString()
    {
        return "EmployeeTypes.Employee: "+ firstName + " " + lastName + ", Social Number: " + socialNumber + ", Contract Type: " + contractType;
    }
}
