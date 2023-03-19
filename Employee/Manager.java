/*manger inherits an abstract class which it must implements or otherwise itself should be an abstract class */
public class Manager extends Employee{
    private String section;
    private double allowance;
   
    public Manager(){
       super();
       System.out.println("Manager constructor.");
       System.out.println("Enter your section");
       section=input.next();
       allowance=(0.1*salary);
       System.out.println("Your allowance is "+allowance);
   
    }
    public void text(){
   
    }
    public void viewSalary(){
       System.out.println(name + "Your basic salary is "+salary);
       System.out.println("Your allowance is "+allowance);
       System.out.println("Your gross salary is "+(salary +allowance));
   
    }
    public Manager(String s, int x,float y,String sec, float a){
       super(s,x,y);
       section=sec;
       allowance=a;
    }
    public void getTax(){
       System.out.println("No tax");
    }
    public static void main(String [] name) {
       Manager e3 = new Manager();
       e3.viewSalary();
       Manager m2 = new Manager(null, 0, 0, "HR", 50000);
       m2.getTax();
       
       
    }
   }
       
   