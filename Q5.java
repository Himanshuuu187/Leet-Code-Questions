// 1539. Kth Missing Positive Number
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

// Return the kth positive integer that is missing from this array.

 

// Example 1:

// Input: arr = [2,3,4,7,11], k = 5
// Output: 9
// Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.



public class Q5 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int missingCount = 0;
        int num = 1; // start checking from 1

        int i = 0; // index for arr

        while (true) {
            if (i < arr.length && arr[i] == num) {
                i++; // skip numbers present in arr
            } else {
                missingCount++; // found a missing number
                if (missingCount == k) {
                    System.out.println("The " + k + "th missing number is: " + num);
                    break;
                }
            }
            num++;
        }
    }
}














