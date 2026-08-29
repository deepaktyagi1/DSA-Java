package ProblemSolving;
import java.util.HashMap;

public class L02_Array_PsP2 {
    
    //     ------- Array Manipulation Problems (Part 2) -------

    // #1. Reverse an Array --
    static int[] reverse(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }
        return arr;
    }
    
    // #2. Shift array elements by 1 Position --
    static int[] shiftBy1(int arr[]){ 
        int temp= arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]= temp;
        return arr;
    }

    // #3. Print Extreme Elements in an alternate manner --
    static void printAlternate(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            if(i<j){
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;}
            else{
                System.out.println(arr[i]);
                return;
            } 
        } 
    }

     // #4. Find Mode of an Array (Highest Frequency) --
     static int getMode(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        // for(int i : map.keySet()){
        // System.out.println("Key :" + i +" -< " + "Value :" + map.get(i));}

        int maxFreq = -1;
        int maxFreqKey = -1;

        for(int key : map.keySet()){
            int currentKey = key;
            int currentFreq = map.get(key);
            if(currentFreq > maxFreq){
                maxFreq = currentFreq;
                maxFreqKey = currentKey;
            }
        }
        return maxFreqKey;
     }

    // #5. Identify elements with Highest and Lowest Frequency --
    static int[] getHighLowFreq(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int maxFreqKey = -1;

        for(int key : map.keySet()) {
            int currentKey = key;
            int currentFreq = map.get(key);
            if(currentFreq > maxFreq) {
                maxFreq = currentFreq;
                maxFreqKey = currentKey;
            }
        }

        int minFreq = Integer.MAX_VALUE;
        int minFreqKey = -1;

        for(int key : map.keySet()){
            int currentKey = key;
            int currentFreq = map.get(key);
            if (currentFreq < minFreq) {
                minFreq = currentFreq;
                minFreqKey = currentKey;
            }
        }
        int ans[] = {maxFreqKey,minFreqKey};
        return ans;

    }

    public static void main(String[] args) {

        // 1.
        // int arr[]= {1,2,3,4,5};
        // int ans[]= reverse(arr);
        // for(int ele : ans){
        //     System.out.println(ele);
        // }

        //2.
        // int arr[]= {1,2,3,4,5,6};
        // int ans[]= shiftBy1(arr);
        // for(int ele : ans){
        //     System.out.println(ele);
        // }

        // 3.
        // int arr[]= {1,2,3,4,5};
        // printAlternate(arr);

        // 4.
        // int arr[] ={1,2,2,3,3,3,3,4,4,4,5,5};
        // int ans = getMode(arr);
        // System.out.println("Highest Frequency No. : "+ans);

        // 5.
        //  int arr[] ={1,2,2,3,3,3,3,4,4,4,5,5};
        //  int ans[] = getHighLowFreq(arr);

        //  System.out.println("Highest Freq. No. :" + ans[0]);
        //  System.out.println("Lowest Freq No. :" + ans[1]);

    
      // -- End --
    }
}