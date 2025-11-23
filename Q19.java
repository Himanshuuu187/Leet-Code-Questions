/*
                             41. First Missing Positive
Hard
Topics
premium lock icon
Companies
Hint
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.

*/


import java.util.ArrayList;
import java.util.List;

public class Q19{
    public static void main(String[] args) {
        int[] arr = {1,2,0};
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
                break;
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
 