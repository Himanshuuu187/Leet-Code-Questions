//                        540. Single Element in a Sorted Array


// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.
// 
// Your solution must run in O(log n) time and O(1) space.
// 
//  
// 
// Example 1:
// 
// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2

//                                            Binary Search is used



class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Ensure mid is even (so it points to the first element of a pair)
            if (mid % 2 == 1) mid--;

            // Check if the pair is valid
            if (nums[mid] == nums[mid + 1]) {
                // Single element is in the right half
                start = mid + 2;
            } else {
                // Single element is in the left half (including mid)
                end = mid;
            }
        }

        // When start == end, we found the single element
        return nums[start];
    }
}










