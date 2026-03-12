// to find maximum element in an array
package linearsearch;
public class max {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int max =arr[0];
        int ans = max_num(arr, max);
        System.out.println(ans);
    }
    static int max_num(int []arr,int max){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i=i+1){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
