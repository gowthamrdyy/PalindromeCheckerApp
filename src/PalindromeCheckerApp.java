import java.util.Stack;

class PalindromeChecker {
    
    public boolean checkPalindrome(String input) {
        if (input == null) {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        int length = input.length();
        
        for (int i = 0; i < length; i++) {
            stack.push(input.charAt(i));
        }
        
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        
        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Welcome to the Object-Oriented Palindrome Checker");
        System.out.print("Enter a Name: ");
        String name = scanner.nextLine();
        
        PalindromeChecker checker = new PalindromeChecker();
        boolean isPalindrome = checker.checkPalindrome(name);
        
        System.out.println("Input : " + name + "\nIs Palindrome? : " + isPalindrome);
        scanner.close();
    }
}
