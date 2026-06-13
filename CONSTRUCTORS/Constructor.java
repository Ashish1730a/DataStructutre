package CONSTRUCTORS;
class MyMainEmployee{
    private int id ;
    private String name; 
    // int salary;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public MyMainEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public int MyEmployee(int salary){
        return salary;
    }

}
public class Constructor {
    public static void main(String[] args) {
        MyMainEmployee Ashish = new MyMainEmployee("Ashish Singh", 88);
        // Ashish.setName("Thakur Ashish Solanki");
        System.out.println(Ashish.getId());
        System.out.println(Ashish.getName());
        //MyEmployee Ak = new MyEmployee();
    }
}
