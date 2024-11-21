package EmployeeTypes;

public abstract class Employee
{
    private String firstName;
    private String lastName;
    private String socialNumber;
    private String contractType;

    //Set the employee info
    public Employee(String firstName, String lastName, String socialNumber, String contractType)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialNumber = socialNumber;
        this.contractType = contractType;
    }

    public abstract double income();

    //Return the contract type
    public String getContractType()
    {
        return contractType;
    }
    //Return the employee info
    @Override
    public String toString()
    {
        return "Employee: "+ firstName + " " + lastName + ", Social Number: " + socialNumber + ", Contract Type: " + contractType;
    }
}
