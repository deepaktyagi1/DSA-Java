package ProblemSolving;

public class L11_BinSearch_PsP1 {

    //     ------- Binary Search Problem Solving (Part 1) -------

    // #1. Lower Bound --
    static int getLowerBound(int arr[], int target){

        int start = 0;
        int end = arr.length-1;

        int ans =-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>= target){ 
                // move to left
                ans = mid;
                end = mid -1;
            }
            if(arr[mid]<target){
                // move to right
                 start = mid+1;
            }
        }
        return ans; 
    }

    // #2. Upper Bound --
    static int getUpperBound(int arr[],int target){

        int start =0;
        int end = arr.length-1;

        int ans =-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]<=target){
                // move to right
                start = mid +1;
            }
            else if(arr[mid]>target){
                // move to left
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }

    // #3. Number of occurence --
    static int countFreq(int arr[],int target){

        // countFreq = UB - LW 

        int start =0;
        int end = arr.length -1;
        int upperAns = arr.length;
        int lowerAns = arr.length;

    // Upper Bound--
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]<=target){
                // move right
                start = mid +1;
            }
            else if(arr[mid]>target){
                //move left
                upperAns = mid;
                end = mid-1;
            }
        }

        start =0;
        end = arr.length-1;

    // Lower Bound--
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(arr[mid]>=target){
                // left move
                lowerAns = mid;
                end = mid-1;
            }
            else if(arr[mid]<target){
                // right move
                start = mid +1;
            }
        }
        int ans = upperAns - lowerAns;
        return ans;
    }

    public static void main(String[] args) {

        //1.
        int arr[]= {10,20,30,30,30,40,50,50};
        int ans = countFreq(arr,50);
        System.out.println(ans);


        //  -- End --
    }   
}