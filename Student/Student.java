import java.util.Scanner;

public class Student {
    private String name,regNo;
    private int yob,admYr;
    private float feeBal;
    private Scanner victor=new Scanner(System.in);
    public Student(){
        System.out.println("Enter Student name");
        name=victor.nextLine();
        System.out.println("Enter registration number for "+name);
        regNo=victor.nextLine();
        System.out.println("When was "+name+ " born");
        yob=victor.nextInt();
        System.out.println("Enter year of admission");
        admYr=victor.nextInt();
        System.out.println("Enter the fees to be paid");
        feeBal=victor.nextFloat();
    }
    public void getage(){
        int currentYear;
        currentYear=victor.nextInt();
        int age=currentYear-yob;        
    
        System.out.println(name +" ,You are " + age + "years old.");
    }
    public void graduation(){
        int graduationYear=admYr+4;
        System.out.println("The expected year of graduation is " + graduationYear);

    }
    public void payfees(){
        float newBalance;
        System.out.println("Your current fee balance is "+feeBal);
        System.out.println("How much do you want to pay");
        newBalance=victor.nextFloat();
        System.out.println("Your new fee balance is" +newBalance);
    }
    public static void main(String[] args) {
    Student s1= new Student();
    s1.getage();
    s1.graduation();
    s1.payfees();
    }
    

}
