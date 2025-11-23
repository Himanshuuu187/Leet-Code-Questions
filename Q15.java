/*
287. Find the Duplicate Number
Medium
Topics
premium lock icon
Companies
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
 */

public class Q15{
    public static void main(String[] args){
        int[] arr = {1,3,4,2,2};
        int result = bnrs(arr);
        System.out.println(result);

    }
    static int bnrs(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s + (e - s)/2;
            if(arr[mid]==(mid+1) || arr[mid] == (mid - 1)){
                return mid;
                
            }

            if(arr[mid]>(mid+1)){
                s = mid + 1;
            }else if(arr[mid]<(mid - 1)){
                e = mid - 1;
            }
        }
        return -1;
    }
}