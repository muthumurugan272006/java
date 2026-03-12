// to find the minimum element in an array
package linearsearch;
public class min {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int min=arr[0];
        int ans =min_num(arr,min);
        System.out.println(ans);
    }
    static int min_num(int[]arr,int min){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i=i+1){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
