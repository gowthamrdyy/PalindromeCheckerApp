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
            break;
        } else {
            b = true;
        }
    }
    System.out.println(b);
    String Reverse="";
    for(int i=n-1;i>=0;i--){
        Reverse=Reverse+name.charAt(i);
    }
    if(name.equals(Reverse)){
        System.out.println("It is Palindrome");
        }
    else{
        System.out.println("It's not a palindrome");
        }
    char[] chars = name.toCharArray();
    int start = 0;
    int end = chars.length - 1;
    boolean isPalindromeUC4 = true;

    while (start < end) {
        if (chars[start] != chars[end]) {
            isPalindromeUC4 = false;
            break;
        }
        start++;
        end--;
    }
    System.out.println("Input : " + name);
    System.out.println("Is Palindrome? : " + isPalindromeUC4);
    }
}
