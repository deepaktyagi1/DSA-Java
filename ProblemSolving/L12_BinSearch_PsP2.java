package ProblemSolving;

public class L12_BinSearch_PsP2 {

    //     ------- Binary Search Problem Search (Part 2) -------

    // #1. Find Peak Index in a Mountain Array --
    static int peakMountainIndex (int arr[]){

        int start =0;
        int end = arr.length-1;

        int peakIndex = -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                peakIndex = mid;
                // move to left
                end = mid-1;
            }
            else if(arr[mid]<arr[mid+1]){
                // move to right
                start = mid+1;
            }
        }
        return peakIndex;
    }



    public static void main(String[] args) {

        int arr[] = {1,3,5,4,2};
        int ans = peakMountainIndex(arr);
        System.out.println(ans);
        
        
        //  -- End --
    }
}