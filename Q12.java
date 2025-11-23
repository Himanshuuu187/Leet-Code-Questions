/*

704. Binary Search
Easy
Topics
premium lock icon
Companies
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1 

*/


public class Q12{
    public static void main(String[] args){
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        int result = bnr(arr,target);
        if(result == -1){
            System.out.println(target + " does not exists in the array");
        }else{
            System.out.println(target + " exists in the array and its in index" + result);
        }

    }
    static int bnr(int[] arr,int target){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid]<target){
                s = mid + 1;

            }else{
                e = mid - 1;
            }

        }

        return -1;
    }
}