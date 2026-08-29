package ProblemSolving;

public class L10_BinarySearch {

    // #1. Binary Search --
    static int binarySearch(int arr[],int target){

        int start = 0;
        int end = arr.length-1;

        //int mid = (start+end)/2;
        int mid = start +(end-start)/2;

        while(start<=end){
            if( target == arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            mid = start +(end-start)/2;
            }
            return -1;
        }     
    

    public static void main(String[] args) {

        //1.
        int arr[] = {10,20,30,40,50,60,70,80};
        int ans = binarySearch(arr, 50);
        System.out.println(ans);


        //  -- End --
    }  
}