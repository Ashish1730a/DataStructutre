import java.io.*;

public class createFile {
    public static void main(String[] args) {
        File f= new File("C:\\Users\\singh\\OneDrive\\Documents\\abc.text");
       
            if(f.delete()){
                System.out.println("File Successfully Created...!");
            }
            else{
                System.out.println("File Already Exist..!");
            }
       
        
    }
}
