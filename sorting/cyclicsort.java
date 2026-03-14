/*Cyclic Sort is an algorithm used when the array contains numbers
 from 1 to n (or 0 to n) and you want to place each number at its correct index. 
*/

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int []arr={2,3,4,5,1};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[]arr){
        int i=0;
        while(i<arr.length){
            int correctindex=arr[i]-1;
            if(arr[i]!=arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }
        }
    }
    static void swap(int []arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
