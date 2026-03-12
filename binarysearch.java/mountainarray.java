/* to find target element in a mountain array
1,2,3,4,3,2,1 => this is mountain array
*/

public class mountainarray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,3,2,1};
        int target = 3;

        int peak = peakIndex(arr);

        int result = binarySearchAsc(arr, target, 0, peak);

        if(result == -1){
            result = binarySearchDesc(arr, target, peak+1, arr.length-1);
        }

        System.out.println("Target index: " + result);
    }

    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    static int binarySearchAsc(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }

    static int binarySearchDesc(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(target > arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }
}