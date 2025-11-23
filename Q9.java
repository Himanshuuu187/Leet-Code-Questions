/*
1464. Maximum Product of Two Elements in an Array
Easy

Given the array of integers nums, you will choose two different indices i and j of that array.
Return the maximum value of (nums[i]-1)*(nums[j]-1).
*/

public class Q9 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 20};

        int result = maxprod(arr);
        System.out.println("Maximum product of two elements (nums[i]-1)*(nums[j]-1): " + result);
    }

    static int maxprod(int[] arr) {
        boolean swapped;

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // Optimization: stop if no swaps happened (array is sorted)
            if (!swapped) {
                break;
            }
        }

        int max1 = arr[arr.length - 1];
        int max2 = arr[arr.length - 2];

        return (max1 - 1) * (max2 - 1);
    }
}
