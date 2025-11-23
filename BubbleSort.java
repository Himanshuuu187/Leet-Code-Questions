import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {5,8,1,2,3};
        bbl(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bbl(int[] arr){
        boolean swp = false;
        for(int i = 0;i<arr.length;i++){
            swp = false;
            for(int j = 1;j<arr.length- i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swp = true;


                }
            }
        }

        if(!swp){
            return;
        }
    }
}