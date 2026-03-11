public class PalindromeCheckerApp {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String name = scanner.nextLine();
        
        int n = name.length();
        boolean isPalindrome = check(name, 0, n - 1);
        System.out.println("Input : " + name + "\nIs Palindrome? : " + isPalindrome);
        scanner.close();
    }

    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        
        return check(s, start + 1, end - 1);
    }
}
