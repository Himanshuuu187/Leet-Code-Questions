//                          Input:      nums = [12,345,2,6,7896]
//                          Output:        2

//  1295      Find numbers which contains even number of digits

//                                                                             Linear Search is used


public class Q1{
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if (String.valueOf(arr[i]).length() % 2 == 0) {
                    count++;
            }

            
            
            
        }
        System.out.println(count);
    }
}