// to search target element in an given array using linear search
//checks element one by one to search target element
package linearsearch;
public class targetelement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int target=3;
        int ans = l_search(arr,target);
        System.out.println(ans);
    }
    static int l_search(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i=i+1)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
