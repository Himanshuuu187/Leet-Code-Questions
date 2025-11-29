/*
                       231. Power of Two
Easy
Topics
premium lock icon
Companies
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 */


public class Q27 {
    public static void main(String[] args) {
        int num = 16;
        boolean result = pow(num);
        System.out.println(result);
    }

    public static boolean pow(int n) {
        if (n <= 0) return false;

        boolean swp = false;
        for (int i = 0; i <= n; i++) {
            // Correct way to calculate power of 2 in Java
            int a = (int) Math.pow(2, i);

            if (a == n) {
                swp = true;
                break;
            }
            if (a > n) break; // Avoid unnecessary looping
        }
        return swp;
    }
}























