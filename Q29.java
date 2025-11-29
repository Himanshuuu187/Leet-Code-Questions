/*

                      342. Power of Four
Easy
Topics
premium lock icon
Companies
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

 

Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true
 */


public class Q29{
    public static void main(String[] args) {
        int num = 9;
        boolean result = pow(num);
        System.out.println(result);
    }

    public static boolean pow(int n) {
        if (n <= 0) return false;

        boolean swp = false;
        for (int i = 0; i <= n; i++) {
            // Correct way to calculate power of 2 in Java
            int a = (int) Math.pow(4, i);

            if (a == n) {
                swp = true;
                break;
            }
            if (a > n) break; // Avoid unnecessary looping
        }
        return swp;
    }
}
  