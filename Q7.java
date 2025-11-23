// public Input: head = [-1,5,3,4,0]
// Output: [-1,0,3,4,5] {
    
// }

// 
// 148. Sort List
// Medium
// Topics
// premium lock icon
// Companies
// Given the head of a linked list, return the list after sorting it in ascending order.

import java.util.Arrays;
import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        int[] arr = {-1,5,3,4,0};

        asc(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void asc(int[] arr){
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