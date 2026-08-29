package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class L07_2D_Array_PsP1 {

    //     ------- 2D Array Problem Solving (Part 1) -------

    // #1. Print the Sum of Each Row in a 2D Array --
    static List<Integer> rowSum(int arr[][]){

        List<Integer> ans = new ArrayList<>();
        
        for(int row =0;row<arr.length;row++){
            int sum =0;
            for(int col =0;col<arr[row].length;col++){
                sum += arr[row][col];
            }
            ans.add(sum);
        }
    return ans;
    }

    // #2. Print the Sum of Each Column in a 2D Array --
    static List<Integer> columnSum(int arr[][]){

        List<Integer> ans = new ArrayList<>();

        for(int col = 0; col<arr[0].length;col++){
            int sum =0;
            for(int row =0;row<arr.length;row++){
                sum += arr[row][col];
            }
            ans.add(sum);
        }
        return ans;
    }

    // #3. Print A Wave Matrix --
    static List<Integer> printWaveMatrix(int matrix[][], int r, int c){

        List<Integer> ans = new ArrayList<>();

        for( int col =0; col<c;col++){
            if((col & 1) == 0 ){
                //top to bottom (even)
                for(int row =0;row<r;row++){
                    ans.add(matrix[row][col]);
                }
            }
            else{
                // bottom to top (odd)
                for(int row = r-1;row>=0;row--){
                    ans.add(matrix[row][col]);
                }
            }
        }
        return ans;
    }

    // #4. Transpose of a Matrix --
    static int[][] transpose(int matrix[][]){

        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int newTotalRow = totalCol;
        int newTotalCol = totalRow;
        int ans[][] = new int[newTotalRow][newTotalCol];

        for(int row = 0; row< totalRow;row++) {
            for(int col =0 ;col<totalCol; col++){
                ans[col][row] = matrix[row][col];
            }
        }
      return ans;
    }

    public static void main(String[] args) {
     
    // 1.
    // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    // List<Integer> ans = rowSum(arr);
    // System.out.println(ans);

    // 2.
    // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    // List<Integer> ans = columnSum(arr);
    // System.out.println(ans);

    // 3.
    // int matrix[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    // List<Integer> ans = printWaveMatrix(matrix,4, 4);
    // System.out.println(ans);

    // 4.
    // int matrix[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    // int ans[][] = transpose(matrix);
    // for(int i =0;i<ans.length;i++){
    //     for(int j =0; j<ans[i].length;j++){
    //         System.out.println(ans[i][j]);
    //     }
    // }
    
    
      //  -- End --
    }
}