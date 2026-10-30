import java.util.Scanner;
import java.util.*;
public  class stringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char str1Array[]=str1.toCharArray();
        char str2Array[]=str1.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        System.out.println(Arrays.equals(str1Array, str2Array));
    }
}

