/*

                        485. Max Consecutive Ones
Easy
Topics
premium lock icon
Companies
Hint
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
  */


public class Q25 {
    public static void main(String[] args){
        int[] arr = {1,0,1,1,0,1};
        
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;      // count consecutive 1s
                maxCount = Math.max(maxCount, count); 
            } else {
                count = 0;    // reset when you see 0
            }
        }
        System.out.println(maxCount);
    }
}