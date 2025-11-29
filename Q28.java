/*
                                326. Power of Three
Easy
Topics
premium lock icon
Companies
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

 

Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
Example 3:

Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).
  */



public class Q28{
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
            int a = (int) Math.pow(3, i);

            if (a == n) {
                swp = true;
                break;
            }
            if (a > n) break; // Avoid unnecessary looping
        }
        return swp;
    }
}
 