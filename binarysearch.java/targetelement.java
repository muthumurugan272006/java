/*Binary Search is a searching algorithm used to find an element in a sorted array efficiently.
1.Start with the middle element of the array.
2.If the target equals the middle → Found.
3.If the target is smaller → Search the left half.
4.If the target is larger → Search the right half.
5.Repeat until found or range becomes empty. 
*/
public class targetelement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int target =6;
        int ans = b_search(arr,target);
        System.out.println(ans);      
    }    
    static int b_search(int []arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
