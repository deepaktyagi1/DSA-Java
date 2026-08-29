package ProblemSolving;
public class L03_Array_PsP3 {

    //     ------- Array Problem Solving (Part 3) -------

    // #1. Sort an Array of 0s and 1s --
    static int[] sortArray(int arr[]) {
        int i = 0;
        int j = arr.length-1;

        while(i<j) {
            if(arr[i]==1 && arr[j] ==0){

                //swap (traditional)
                int temp = arr[i]; 
                arr[i] = arr[j];
                arr[j] = temp;

                //swap
                // arr[i] = 0;
                // arr[j] = 1;
                
            }

            if(arr[i]==0) {
              i++;
            }
            if(arr[j]==1){
              j--;
            }
        }
        return arr;
    }

    // #2. Find Missing Number --
    static int missingNumber(int arr[]) {
        int xorSum = 0;

        for(int i : arr) {
            xorSum = xorSum^i;
        }

        for(int i=0;i<=arr.length;i++){
            xorSum = xorSum^i;
        }
        return xorSum;
    }
    
    // #3. Find the Unique Element in an Array --
    static int uniqueElement (int arr[]) {
        int xorSum = 0;
        
        for(int i : arr) {
            xorSum = xorSum^i;
        }

        return xorSum;

    }

    public static void main(String[] args) {

        // 1.
        // int arr[] = {1,0,1,1,0,0,1};
        // int ans[] = sortArray(arr);
        // for(int i : ans){
        //     System.out.println(i);
        // }

        // 2.
        // int arr[] ={1,4,4,5,2,2};
        // int ans = missingNumber(arr);
        // System.out.println(ans);

        // 3.
        // int arr[] = {1,1,2,3,3,4,4};
        // int ans = uniqueElement(arr);
        // System.out.println(ans);
        
    
        //  -- End --
    }
}