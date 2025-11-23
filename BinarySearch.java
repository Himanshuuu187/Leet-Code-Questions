public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {5,2,7,8,3,1};
        int target = 5;
        int result = bnrs(arr,target);
        if(result!=-1){
            System.out.println("The Element exists at index: " + result );
        }else{
            System.out.println("Element do not exists");
        }

    }

    static int bnrs(int[] arr,int target){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]<target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }

        return -1;
    }
}