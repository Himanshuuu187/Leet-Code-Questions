/*
35. Search Insert Position
Easy
Topics
premium lock icon
Companies
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 */


 public class Q13{
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        int result = bnr(arr,target);
        System.out.println(result);
    }

    static int bnr(int[] arr,int target){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s + (e - s)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]<target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }

            
        }
        return s;

        
    }
 }