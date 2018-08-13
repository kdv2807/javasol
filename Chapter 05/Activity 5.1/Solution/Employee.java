package university;
import java.util.Scanner;
class Employee extends Person
    {  
    double Salary;
    String desg;   
    String dept; 
    public void getDetail() 
    {
    super.getDetail();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Professional Details");
    System.out.println("Enter the Department");
    dept = input.nextLine();
    System.out.println("Enter the Designation");
    desg = input.nextLine();
    System.out.println("Enter the Salary");
    Salary = input.nextInt();
    showDetail();
    }
public void showDetail() 
    {
    
    System.out.println("The details entered are: \n");
    System.out.println("First Name: "+super.firstName);
    System.out.println("Last Name: "+super.lastName);
    System.out.println("Age: "+super.age);
    System.out.println("Department: "+dept);
    System.out.println("Designation: "+desg);
    System.out.println("Salary: "+Salary);
    }   

} 
