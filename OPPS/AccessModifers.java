package OPPS;

public class AccessModifers {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        
        acc.name = "Ashish";
        // NOT ACCESS BECOUSE PRIVATE MODIRFER
        // acc.password = "Ashish"
        acc.setPassword("Ashish1730");;
    }
}


class BankAccount{
    public String name;
    private String password;
    public void setPassword(String pass){
        password = pass;
    }
}