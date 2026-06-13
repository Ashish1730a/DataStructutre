public class staticss {
    int a=10; // instance variable
   static int b=20;// instance variable
   
   public void get()
   {
    
     int c=a*b;
     System.out.println(c);
    

   }
   void display()
   {
int z=a+b;
System.out.println(z);

   }
   public static void main(String []args)
   {
   staticss g = new staticss();
      System.out.println(g.a);
      System.out.println(b);
     g.get();
     


   } 
}
