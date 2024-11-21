import EmployeeTypes.*;

import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        int employeeCount = 0;

        while (true)
        {
            System.out.println("Menu:");
            System.out.println("1. Register Employee");
            System.out.println("2. Print Employee Data");
            System.out.println("3. Print by Position");
            System.out.println("4. Print by Contract");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    //Register a new employee if Employee array is not full
                    if (employeeCount < employees.length)
                    {
                        employees[employeeCount++] = registerEmployee(scanner);
                    } else {
                        System.out.println("Employee list is full.");
                    }
                    break;
                case 2:
                    //Print out data of all employees.
                    printEmployeeData(employees, employeeCount);
                    break;
                case 3:
                    //Print out employees by specific position
                    printByPosition(employees, employeeCount, scanner);
                    break;
                case 4:
                    //Print out employees by specific contract
                    printByContract(employees, employeeCount, scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    //Method for registering a new employee
    private static Employee registerEmployee(Scanner scanner)
    {
        //Employee personal information and contract type
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter social number: ");
        String socialNumber = scanner.nextLine();
        System.out.print("Enter contract type: ");
        String contractType = scanner.nextLine();

        //Employee type options
        System.out.println("Select employee type:");
        System.out.println("1. Full-Time Employee");
        System.out.println("2. Part-Time Employee");
        System.out.println("3. Commission Employee");
        System.out.println("4. Base Plus Commission Employee");
        int type = scanner.nextInt();
        scanner.nextLine();

        switch (type)
        {
            case 1:
                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                return new FullTimeEmployee(firstName, lastName, socialNumber, contractType, salary);
            case 2:
                System.out.print("Enter hourly rate: ");
                double hourlyRate = scanner.nextDouble();
                System.out.print("Enter hours worked: ");
                int hoursWorked = scanner.nextInt();
                return new PartTimeEmployee(firstName, lastName, socialNumber, contractType, hourlyRate, hoursWorked);
            case 3:
                System.out.print("Enter commission rate: ");
                double commissionRate = scanner.nextDouble();
                System.out.print("Enter sales: ");
                double sales = scanner.nextDouble();
                return new CommissionEmployee(firstName, lastName, socialNumber, contractType, commissionRate, sales);
            case 4:
                System.out.print("Enter base salary: ");
                double baseSalary = scanner.nextDouble();
                System.out.print("Enter commission rate: ");
                commissionRate = scanner.nextDouble();
                System.out.print("Enter sales: ");
                sales = scanner.nextDouble();
                return new BasePlusCommissionEmployee(firstName, lastName, socialNumber, contractType, commissionRate, sales, baseSalary);
            default:
                System.out.println("Invalid employee type. Defaulting to Full-Time Employee with zero salary.");
                return new FullTimeEmployee(firstName, lastName, socialNumber, contractType, 0);
        }
    }

    //Method to print out data of all employees.
    private static void printEmployeeData(Employee[] employees, int employeeCount)
    {
        for (int i = 0; i < employeeCount; i++)
        {
            System.out.println(employees[i]);
            System.out.println("Income: " + employees[i].income());
        }
    }

    //Method to print out all employees by their specific position.
    private static void printByPosition(Employee[] employees, int employeeCount, Scanner scanner)
    {
        System.out.print("Enter position to filter by: ");
        String position = scanner.nextLine();
        for (int i = 0; i < employeeCount; i++)
        {
            if (employees[i].getClass().getSimpleName().equalsIgnoreCase(position))
            {
                System.out.println(employees[i]);
                System.out.println("Income: " + employees[i].income());
            }
        }
    }

    //Method to print out all employees by their specific contract.
    private static void printByContract(Employee[] employees, int employeeCount, Scanner scanner)
    {
        System.out.print("Enter contract type to filter by: ");
        String contractType = scanner.nextLine();
        for (int i = 0; i < employeeCount; i++)
        {
            if (employees[i].getContractType().equalsIgnoreCase(contractType))
            {
                System.out.println(employees[i]);
                System.out.println("Income: " + employees[i].income());
            }
        }
    }
}