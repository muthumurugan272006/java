/* compares adjacent elements and swaps it
after each pass the largest element goes to the end
*/
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};

        search(arr);

        // print sorted array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void search(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}