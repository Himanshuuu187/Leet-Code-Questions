// 34. Find First and Last Position of Element in Sorted Array
// Medium
// Topics
// premium lock icon
// Companies
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]




/*

public class Q6 {
    public static int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    private static int findBound(int[] nums, int target, boolean searchFirst) {
        int left = 0, right = nums.length - 1, bound = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                bound = mid;
                // pull the search toward the direction you want
                if (searchFirst) {
                    right = mid - 1;   // drift left
                } else {
                    left = mid + 1;    // drift right
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return bound;
    }
}

*/


import java.util.Arrays;
public class Q6{
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(fnd(arr,target)));

    }
    static int[] fnd(int[] arr,int target){
        int first = fstbound(arr,target,true);
        int second = fstbound(arr,target,false);

        return new int[]{first,second};
    }
    static int fstbound(int[] arr,int target,boolean search){
        int s = 0;
        int e = arr.length - 1;
        int bound = -1;

        while(s<=e){
            int mid = s +(e-s)/2;
            if(arr[mid] == target){
                bound = mid;
                if(search){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }else if(arr[mid]<target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }

        return bound;
    }
}
