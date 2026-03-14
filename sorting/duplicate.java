public class duplicate {
    public static void main(String[] args) {

        int []arr={1,2,3,3,4,5,6};

        int ans = search(arr);

        System.out.println("Duplicate = " + ans);
    }

    static int search(int[] arr){

        int i = 0;

        while(i < arr.length){

            int correctindex = arr[i] - 1;

            if(arr[i] != arr[correctindex]){
                swap(arr,i,correctindex);
            }
            else if(i != correctindex){
                return arr[i];   // duplicate found
            }
            else{
                i++;
            }
        }

        return -1;
    }

    static void swap(int []arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}