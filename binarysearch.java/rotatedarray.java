public class rotatedarray {
    public static void main(String[] args) {

        int [] arr = {3,4,5,6,7,1,2};
        int target = 6;

        int piv = pivot(arr);

        int ans = binarySearchAsc(arr, target, piv+1, arr.length-1);

        if(ans == -1){
            ans = binarySearchAsc(arr, target, 0, piv);
        }

        System.out.println(ans);
    }

    static int pivot(int []arr){
        int start=0,end =arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[mid]>=arr[start]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    static int binarySearchAsc(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}