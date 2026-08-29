package ProblemSolving;
import java.util.HashMap;

public class L04_Array_PsP4 {

    //     ------- Array Problem Solving (Part 4) -------

    // #1. Two Sum --
    static int[] twoSum (int arr[],int target) {

        int n = arr.length;

        for(int i = 0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(target == arr[i] + arr[j]){
                int ans[] = {i,j};
                return ans; 
                }
            }
        }
        int temp[]={};
        return temp;
    }

    // #2. Three Sum --
    static int[] threeSum(int arr[],int target) {
        int n = arr.length;

        for(int i = 0;i<n-2;i++){
            for(int j =i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    if(target == arr[i]+arr[j]+arr[k]){
                        int ans[] ={i,j,k};
                        return ans;
                    }
                }
            }
        }
        int temp[] = {};
        return temp;
    }

    // #3. Remove Duplicates from Sorted Array --
    static int removeDuplicates(int arr[]){

        int i =0;
        int j =1;

        while(j<arr.length){
            if(arr[i]!= arr[j]){
                i++;
                arr[i]=arr[j];
                j++;
            }
            else{
                j++;
            }

        }
        return i+1;
    }

    // #4. Find First Repeating Element --
    static int repeatedElement(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int i : arr){
            if(map.get(i)>1){
                return i;
            }
        }
        return -1;
    }

    // #5. Find Pivot Index --
    static int pivotIndex(int arr[]){
        
        int n= arr.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        leftSum[0] = arr[0];
        for(int i=1;i<n;i++) {
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        rightSum[n-1] = arr[n-1];
        for(int i= n-2;i>=0;i--){
            rightSum[i] = rightSum[i+1] +arr[i];
        }

        for(int i =0;i<n;i++){
            if(leftSum[i]==rightSum[i]){
                return i;
            }
        }
        return -1;
        }
    

    public static void main(String[] args) {

        //1.
        // int arr[]= {2,1,3,5,4,6};
        // int target = 8;
        // int ans[] = twoSum(arr,target);
        // for(int i : ans){
        //     System.out.println(i);
        // }

        //2.
        // int arr[]= {2,1,3,5,4,6};
        // int target = 12;
        // int ans[] = threeSum(arr,target);
        // for(int i : ans){
        //     System.out.println(i);
        // }

        //3.
        // int arr[] = {1,2,2,2,2,3,3,4};
        // int ans = removeDuplicates(arr);
        // System.out.println(ans);

        //4.
        // int arr[]= {2,4,6,8,7,6,8};
        // int ans = repeatedElement(arr);
        // System.out.println(ans);

        //5.
        // int arr[] = {1,7,3,6,5,6};
        // int ans = pivotIndex(arr);
        // System.out.println(ans);

    
        // -- End --
    }  
}