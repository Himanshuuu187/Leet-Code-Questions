/*
 283. Move Zeroes
Easy
Topics
premium lock icon
Companies
Hint
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 
*/

// 
import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.println("Array after moving zeroes: " + Arrays.toString(nums));
    }

    // Function to move all zeroes to the end
    static void moveZeroes(int[] nums) {
        int index = 0; // Pointer for placing the next non-zero element

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Step 2: Fill the remaining elements with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 











