//                             162.      Find Peak Element


//           Input: nums = [1,2,3,1]
//           Output: 2
// //        Explanation: 3 is a peak element and your function should return the index number 2.   


//                                    Binary Search is used


public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1};
        int result = peIndex(arr);
        System.out.println(result);

    }

    public static int peIndex(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s + (e - s)/2;
            if(arr[mid] < arr[mid + 1]){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
            
        }
        return s;
        
    } 
    
}
