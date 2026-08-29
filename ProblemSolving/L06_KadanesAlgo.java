package ProblemSolving;
public class L06_KadanesAlgo {

    //     ------- Kadane's Algorithm -------      

    // #. Maximum Subarray --
    static int maxSubArray(int arr[]){

        int sum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum += arr[i]; 
                maxSum = Math.max(maxSum,sum);
            if(sum<0){
                sum =0;
            }
        }
       return maxSum; 
    }

    public static void main(String[] args) {

        int arr[] = {5,4,-1,7,8};
        int ans = maxSubArray(arr);
        System.out.println(ans);

    
        //  -- End --
    }
}