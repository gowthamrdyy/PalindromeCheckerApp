public class PalindromeCheckerApp {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String name = scanner.nextLine();
        
        long start1 = System.nanoTime();
        boolean res1 = checkTwoPointer(name);
        long end1 = System.nanoTime();
        
        long start2 = System.nanoTime();
        boolean res2 = checkReverse(name);
        long end2 = System.nanoTime();
        
        long start3 = System.nanoTime();
        boolean res3 = checkRecursive(name, 0, name.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("Two Pointer: " + res1 + " Time: " + (end1 - start1) + " ns");
        System.out.println("Reverse String: " + res2 + " Time: " + (end2 - start2) + " ns");
        System.out.println("Recursive: " + res3 + " Time: " + (end3 - start3) + " ns");
        
        scanner.close();
    }

    private static boolean checkTwoPointer(String str) {
        if (str == null) return false;
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean checkReverse(String str) {
        if (str == null) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    private static boolean checkRecursive(String str, int left, int right) {
        if (str == null) return false;
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return checkRecursive(str, left + 1, right - 1);
    }
}
