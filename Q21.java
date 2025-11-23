/*LeetCode Logo
Problem List
Debugging...
Debugging...









0
0Streaks
Ready to Practice?
DCC Badge

avatar
Avatar
Himanshu Jaiswal
Access all features with our Premium subscription!
myLists
My Lists
notebook
Notebook
progress
Progress
points
Points
Try New Features
Orders
My Playgrounds
Settings
Appearance
Sign Out
Premium
Description
Editorial
Editorial
Solutions
Solutions
Submissions
Submissions


Code
Testcase
Testcase
Test Result
215. Kth Largest Element in an Array
Medium
Topics
premium lock icon
Companies
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
 
🎉 Thank you for your feedback!
Accepted
3,328,043/4.9M
Acceptance Rate
68.6%
Topics
icon
Companies
Similar Questions
Discussion (353)

Choose a type



Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

Copyright © 2025 LeetCode. All rights reserved.

18.4K


353


216 Online
Java
Auto





12345
class Solution {
    public int findKthLargest(int[] nums, int k) {
        
    }
}
Saved
You must run your code first
Remove Element - LeetCode
Problem List
1 Qt
215


215. Kth Largest Element in an Array
Med.

 */





















public class Q21 {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(arr,k));
    }

    
    
    
    
    
    
    public static int findKthLargest(int[] nums, int k) {
        insertionSort(nums);
        return nums[nums.length - k];
    }

    // Insertion Sort (Ascending)
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

}
 