/*selects the smallest or largest element in an array and put it in its correct position */
public class selectionsort {
    public static void main(String[] args) {
        int []arr={3,5,4,1,2};
    }
    static int search(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int minvalue=i;
            for(int j=1;j<arr.length-1;j++){
                if(arr[j]<minvalue){
                    minvalue=j;
                }
            }
            int temp = arr[minvalue];
            arr[minvalue]=arr[i];
            arr[i]=temp;
        }
         return-1;
    }
   
}
