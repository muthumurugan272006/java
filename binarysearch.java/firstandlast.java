public class firstandlast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 6;

        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Step 1: Find range
        while (arr[end] < target) {
            int temp = end + 1;
            end = end * 2;
            start = temp;
        }

        // Step 2: Binary search
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } 
            else if (target > arr[mid]) {
                start = mid + 1;
            } 
            else {
                return mid;
            }
        }

        return -1;
    }
}