/*
 

75. Sort Colors
Medium
Topics
premium lock icon
Companies
Hint
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q10{
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        blr(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void blr(int[] arr){
        boolean swapped;
        for(int i = 0;i<arr.length;i++){
            swapped = false;
            for(int j = 1;j<arr.length - i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}