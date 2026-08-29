package ProblemSolving;
import java.util.ArrayList;
import java.util.List;

public class L05_Array_PsP5 {

    //     ------- Array Problem (05) -------

    // #. Missing Elements from An Array of Duplicates --
    
    static List<Integer> missingElement(int arr[]) {
        
       List<Integer> ans = new ArrayList<>();

        //marking
        for(int index=0;index<arr.length;index++){
            int value = Math.abs(arr[index]);
            int position = value-1;
            if(arr[position]>0){
                arr[position] = - arr[position];
            }
        }
       
        // adding in List
       for(int i =0;i<arr.length;i++){
        if(arr[i]>0){
            int indexValue = i+1;
            ans.add(indexValue);
        }
       }
       return ans;
    }

    public static void main(String[] args) {

    //
    int arr[] ={3,4,5,4,3,2};
    List<Integer> ans = missingElement(arr);
    System.out.println(ans);
        
      
       //  -- End --
    }
}