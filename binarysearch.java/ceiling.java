//The smallest element in the array that is greater than or equal to the target.
public class ceiling {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        int target=7;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[]arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return arr[start];
    }
}
