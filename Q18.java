/*
                           448. Find All Numbers Disappeared in an Array
Easy
Topics
premium lock icon
Companies
Hint
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 
*/



import java.util.ArrayList;
import java.util.List;

public class Q18{
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(slr(arr)); // -> [5, 6]
    }

    static ArrayList<Integer> slr(int[] arr){
        ArrayList<Integer> arr1 = new ArrayList<>();

        // Selection sort (your original idea)
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);
            swap(arr, max, last);
        }

        // CORRECTED: scan sorted array with a pointer to handle duplicates
        int idx = 0;
        for (int k = 1; k <= arr.length; k++) {
            // advance idx while current element is less than k
            while (idx < arr.length && arr[idx] < k) idx++;
            // if current equals k, it's present — consume it; otherwise k is missing
            if (idx < arr.length && arr[idx] == k) {
                idx++;
            } else {
                arr1.add(k);
            }
        }

        return arr1;
    }

    static void swap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    // FIXED: include 'e' in the loop (<=)
    static int getMax(int[] arr,int s,int e){
        int max = s;
        for(int i = s; i <= e; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}





















































































