package OOPS;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id "+ id);
        System.out.println("My name is "+ name);
    }
    public void getSalary(){
        System.out.println( "I am "+ name );
        System.out.println("And my salary is " + salary);
    }
}
public class CustomClass {
    public static void main(String[] args) {
         System.out.println("This is our custom class ");
         Employee Ashish = new Employee();
         Employee Adesh =  new Employee(); //Instantiating a new Employee Object
        //  Setting Attributes
         Ashish.id =15;
         Ashish.salary = 12450;
         Ashish.name = "Ashish Solanki";
         Adesh.id = 18;
         Adesh.name = "Adesh Yadav";
         Adesh.salary=13450;
        //  Printing the Attributes
        //  System.out.println(Ashish.id);
        //  System.out.println(Ashish.name);
        Ashish.printDetails();
        Adesh.printDetails();
        Ashish.getSalary();
        Adesh.getSalary();
        
    }
}
