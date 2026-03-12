/*to find the position of an element in an sorted array of infinite numbers using binary search
no need to use arr.length-1
without using it we need to find the position of an elementj
*/
public class positionelement {
    public static void main(String[] args) {
        /* we need to check chunk by chunk  */
        int []arr={1,2,3,4,5,6,7,8,9};
        int target =6;
        int ans = search(arr, target);
        System.out.println(ans);

    }
    static int search(int []arr,int target){
        int start=0;
        int end =1;
        while(arr[end]<target){
            start=end+1;
            end = end*2;
            int mid = start+(end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
