package ProblemSolving;
import java.util.HashMap;

public class practice {

    // #1. sum of an array (+ve and -ve)
    static int sum(int arr[]){
        int sum =0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }
     
    // #2. Shift array elements by 1 position
    static int [] shiftBy1(int arr[]){
        int temp = arr[arr.length-1];
        for(int i= arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0]= temp;
        return arr;
    }
    
    // #3. Print extreme elements in an alternate manner
    static void alterelements(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }

    }


    // #4. Find Mode of an Array (Highest Frequency)
    static int getMode(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int element : arr){
            map.put(element, map.getOrDefault(element, 0)+1);
        }

        int maxFreq= -1;
        int maxFreqKey= -1;

        for(int key : map.keySet()) {
            int currentKey = key;
            int currentKeyFreq = map.get(key);
            if(currentKeyFreq> maxFreq){
                maxFreq= currentKeyFreq;
                maxFreqKey= currentKey;
            }
        }
        return maxFreqKey;
    }

    // #5. Sorted an Array of 0s and 1s --
    static int[] sortZeroesOnes (int arr[]){
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int num : arr){
        map.put(num,map.getOrDefault(num, 0 )+1);
       }
         
    //    for(int i : map.keySet()){
    //     System.out.println("Key :" + i + " frquency :" + map.get(i));
    //    }

    int index = 0;

    for(int i=0;i<map.get(0);i++){
        arr[index] = 0;
        index ++;
    }

    for(int i=0;i<map.get(1);i++){
        arr[index] = 1;
        index ++;
    }
    return arr;
    }

    // #6. Find Missing Number (Simple Way) --
    static int missingNumber1 (int arr[]) {
        int n = arr.length;

        int expectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int i : arr) {
            actualSum += i;
        }

        int Missing = expectedSum-actualSum;
        return Missing;

    }

    // #6. Find Missing Number --
    static int missingNumber (int arr[]) {
        int xorSum =0 ;

        for (int i : arr){
            xorSum = xorSum^i;
        }

        for(int i=0;i<=arr.length;i++){
            xorSum = xorSum^i;
        }
        return xorSum;
    }

    // #7. Remove Duplicate from sorted Array (and Print that array) --
    static int[] duplicateArray (int arr[]){
        int i =0;
        int j=1;
          
        while(j<arr.length){
            if(arr[i]!= arr[j]){
                i++;
                arr[i] = arr[j];
                j++;
            }
            else{
                j++;
            }
        }
        int ans[] = new int [i+1];
        for(int k=0;k<=i;k++){
            ans[k] = arr[k];
        }
        return ans;
        
    }

    // #8. Find Pivot Index (BrutForce--
    static int pivotIndex(int arr[]){

        for(int i=0;i<arr.length;i++){
           int leftSum =0;
           int rightSum =0;

        for(int j =0;j<i;j++){
            leftSum+=arr[j];
        }  
        
        for(int j=i+1;j<arr.length;j++){
            rightSum+=arr[j];
        }
        
        if(leftSum == rightSum){
        return i;
        }
    }
    return -1;
    }

    // #9. Maximum Subarray (BrutForce)
   static int maxSubArray (int arr[]){

    int maxSum = 0;

    for(int i =0;i<arr.length;i++){
        int sum =0;
        for(int j =i;j<arr.length;j++){
            sum += arr[j];
            maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // #10. Bubble Sort --
    static void bubbleSort(int arr[]){

        int N = arr.length;

        for(int i =0;i<=N;i++){
            for(int j= 0;j<=N-i-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // #11. Selection Sort --
    static void selectionSort (int [] arr){

        int N = arr.length;
        
        for(int i=0;i<N-1;i++){
            int min=i;
            for(int j =i+1;j<N;j++){
                if(arr[j]<arr[min]){
                    min = arr[j];
                }
            }
             int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
        }
    }

    // #12. Insertion Sort --
    static void insertionSort(int arr[]){

        int n = arr.length;

        for(int i=1;i<n;i++){
            int current = i;
            int prev = i-1;
            int currValue = arr[i];

            while(prev>=0 && arr[prev]>currValue){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currValue;
        }
    }
    


    
    



    public static void main(String[] args) {

        int arr[] = {5,4,3,2,1};
        insertionSort(arr);
        for(int value : arr){
            System.out.println(value);
        }
        // for(int i : ans) {
        //     System.out.println(i);
        // }

        // int arr[] = {5,1,3,2,0};
        // int ans = missingNumber1(arr);
        // System.out.println(ans);
        

    }
}