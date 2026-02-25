import java.util.*;
public class PalindromeCheckerApp{
public static void main(String[] args) {
    System.out.println("Welcome to Palindrome Checker app");
    System.out.println("Version 1.0");
    System.out.println("System Initalzed Successfully");
    Scanner a=new Scanner(System.in);
    System.out.print("Enter a Name:");
    String name=a.nextLine();
    int n=name.length();
    boolean b = true;
    for(int i=0;i<n/2;i++) {
        if (name.charAt(i) != name.charAt(n - i-1)) {
            b = false;
        } else {
            b = true;
        }
    }
    System.out.println(b);
    }
}
