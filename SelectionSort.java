import java.util.Arrays;


public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4,2,6,7,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int last = arr.length - i - 1;
            int getMaxIndex = maxIndex(arr,0,last);
            swap(arr,getMaxIndex,last);
        }
    }
    static int maxIndex(int[] arr,int first,int second){
        int max = first;
        for(int i = first;i<=second;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    
    
}
