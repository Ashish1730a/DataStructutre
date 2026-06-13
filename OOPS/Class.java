package OOPS;
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class Class {
    public static void main(String[] args) {
        Employee1 Ashish = new Employee1();
        Ashish.setName("Thakur Ashish Solanki");
        Ashish.salary = 200000;
        System.out.println(Ashish.getName());
        System.out.println(Ashish.getSalary());
    }
}
