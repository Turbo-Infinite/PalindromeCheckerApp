import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        String input = "level";

        runBenchmark("Two-pointer", input, Main::isPalindromeTwoPointer);
        runBenchmark("String reversal", input, Main::isPalindromeReverse);
        runBenchmark("Recursive", input, Main::isPalindromeRecursive);
    }

    /**
     * Benchmark runner for a given algorithm.
     *
     * @param name Algorithm name
     * @param input Test string
     * @param algo Functional interface for algorithm
     */
    private static void runBenchmark(String name, String input, java.util.function.Function<String, Boolean> algo) {
        long start = System.nanoTime();
        boolean result = algo.apply(input);
        long end = System.nanoTime();
        long duration = end - start;

        System.out.println("===================================");
        System.out.println("Algorithm: " + name);
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
        System.out.println("Execution Time: " + duration + " ns");
        System.out.println("===================================\n");
    }

    // ---------------------------------------------------------------
    // Algorithm 1: Two-pointer approach
    // ---------------------------------------------------------------
    private static boolean isPalindromeTwoPointer(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    // ---------------------------------------------------------------
    // Algorithm 2: Reverse string comparison
    // ---------------------------------------------------------------
    private static boolean isPalindromeReverse(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // ---------------------------------------------------------------
    // Algorithm 3: Recursive approach
    // ---------------------------------------------------------------
    private static boolean isPalindromeRecursive(String s) {
        return checkRecursive(s, 0, s.length() - 1);
    }

    private static boolean checkRecursive(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return checkRecursive(s, i + 1, j - 1);
    }
}