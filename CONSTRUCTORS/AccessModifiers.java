package CONSTRUCTORS;

class MyEmployee{
    private int id ;
    private String name;
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
}
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee Ashish = new MyEmployee();
        // Ashish.id = 45;
        // Ashish.name = "Ashish Solanki";  -->Theows an error due to private access modifier
        Ashish.setName("Thakur Ashish Solanki");
        System.out.println(Ashish.getName());
        Ashish.setId(58);
        System.out.println(Ashish.getId());

    }
}
