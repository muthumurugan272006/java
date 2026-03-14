/*Insertion sort works like arranging playing cards in your hand.
You take one element and insert it into the correct position in the sorted part of the array. */
public class insertionsort {
    public static void main(String[] args) {
        int []arr={2,3,4,1,5};
        search(arr);
    }    
    static void search(int []arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>0&& arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
}
