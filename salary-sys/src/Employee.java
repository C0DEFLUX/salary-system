public abstract class Employee
{
    private String firstName;
    private String lastName;
    private String socailNumber;
    private String contractType;

    public Employee(String firstName, String lastName, String socailNumber, String contractType)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socailNumber = socailNumber;
        this.contractType = contractType;
    }

    public abstract double income();

    @Override
    public String toString()
    {
        return "Employee: "+ firstName + " " + lastName + ", Social Number: " + socailNumber + ", Contract Type: " + contractType;
    }
}
