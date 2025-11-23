// Q1. Smallest Missing Multiple of K
// Easy
// 3 pt.
// Given an integer array nums and an integer k, return the smallest positive multiple of k that is missing from nums.

// A multiple of k is any positive integer divisible by k.

 

// Example 1:

// Input: nums = [8,2,3,4,6], k = 2

// Output: 10

// Explanation:

// The multiples of k = 2 are 2, 4, 6, 8, 10, 12... and the smallest multiple missing from nums is 10.


public class Q4{
    public static void main(String[] args) {
        int[] arr = {8,2,3,4,6};
        int k = 2;

        for(int i = 1;i<=10;i++){
            int num = k*i;
            
            for(int j = 0;j<arr.length;j++){
                if(arr[j] == num){
                    return;
                }else{
                    System.out.println(num);
                    break;
                }
            }


            
        }
    }
}