/*

                                     977. Squares of a Sorted Array
Easy
Topics
premium lock icon
Companies
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        insr(arr);
        System.out.println(Arrays.toString(arr));   // squared + sorted
    }

    static void insr(int[] arr){
        List<Integer> arr1 = new ArrayList<>();

        // Step 1: square numbers and add to list
        for(int i = 0; i < arr.length; i++){
            arr1.add(arr[i] * arr[i]);
        }

        // Step 2: selection sort on the ArrayList
        for(int j = 0; j < arr1.size(); j++){
            int last = arr1.size() - j - 1;
            int max = getMaxIndex(arr1, 0, last);
            swap(arr1, max, last);
        }

        // Step 3: copy sorted values back into arr[]
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr1.get(i);
        }
    }

    static void swap(List<Integer> arr1, int s, int e){
        int temp = arr1.get(s);
        arr1.set(s, arr1.get(e));
        arr1.set(e, temp);
    }

    static int getMaxIndex(List<Integer> arr1, int s, int e){
        int max = s;
        for(int i = s; i <= e; i++){
            if(arr1.get(i) > arr1.get(max)){
                max = i;
            }
        }
        return max;
    }
}












































