import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker app");
        System.out.println("Version 1.0");
        System.out.println("System Initalzed Successfully");
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a Name:");
        String name = a.nextLine();
        int n = name.length();
        boolean b = true;
        for (int i = 0; i < n / 2; i++) {
            if (name.charAt(i) != name.charAt(n - i - 1)) {
                b = false;
                break;
            } else {
                b = true;
            }
        }
        System.out.println(b);
        String Reverse = "";
        for (int i = n - 1; i >= 0; i--) {
            Reverse = Reverse + name.charAt(i);
        }
        if (name.equals(Reverse)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
        char[] chars = name.toCharArray();
        int start = 0, end = chars.length - 1;
        boolean isPalindromeUC4 = true;
        while (start < end)
            if (chars[start++] != chars[end--]) {
                isPalindromeUC4 = false;
                break;
            }
        System.out.println("Input : " + name + "\nIs Palindrome? : " + isPalindromeUC4);

        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : chars)
            stack.push(c);
        boolean isPalindromeUC5 = true;
        for (char c : chars)
            if (c != stack.pop()) {
                isPalindromeUC5 = false;
                break;
            }
        System.out.println("Input : " + name + "\nIs Palindrome? : " + isPalindromeUC5);

        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack6 = new java.util.Stack<>();
        for (char c : chars) {
            queue.add(c);
            stack6.push(c);
        }
        boolean isPalindromeUC6 = true;
        while (!queue.isEmpty())
            if (queue.poll() != stack6.pop()) {
                isPalindromeUC6 = false;
                break;
            }
        System.out.println("Input : " + name + "\nIs Palindrome? : " + isPalindromeUC6);
    }
}
