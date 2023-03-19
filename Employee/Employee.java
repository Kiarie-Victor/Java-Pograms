import java.util.Scanner;

public abstract class Employee {
    protected String name;
    protected float salary;
    protected int pfno;
    byte number;



Scanner input = new Scanner(System.in);
    public Employee(){
    System.out.println("Creating an Employeee");
    System.out.println("Enter your name: ");
    name=input.nextLine();
    System.out.println("Enter your monthly salary: ");
    salary=input.nextFloat();
    System.out.println("Enter your personal phone number: ");
    pfno=input.nextInt();
    }
    public Employee( String name,int pfno,float salary) {
    this.name=name;
    this.pfno=pfno;
    this.salary=salary;
    }

    public void getTax() {
    System.out.println(name+ ",Your monthly salary is "+salary);
    double tax=(0.3*salary);
    System.out.println("The tax payable is "+tax);

}
    public void setName(){
        System.out.println("Enter the new correct name");
        name=input.nextLine();
    }
    public void setSalary(){
        System.out.println("Enter the new correct salary");
        salary=input.nextFloat();
    }
    public void setpfno(){
        System.out.println("Enter the new correct personal phone number");
        pfno=input.nextInt();
    }
    public void getName(){
        System.out.println("Your name is "+name);
    }
    public void getSalary(){
        System.out.println("Your name is "+salary);
    }
    public void getPfno(){
        System.out.println("Your personal phone number is "+pfno);
    }
    public abstract void text();
    public static void main(String [] arg) {
       
    }
}

