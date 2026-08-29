package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class L08_2D_Array_PsP2 {

    //     ------- 2D Array Problem Solving (Part 2) -------

    // #1. Rotate Image --
    static void rotateImage (int[][] matrix, int N){
        // transpose
        for(int row =0;row<N-1;row++){
            for(int col = row+1;col<=N-1;col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        //swap row
        for(int row = 0;row<=N-1;row++){

            int start = 0;
            int end = N-1;

            while(start<=end){
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;
                start++;
                end--;
            }
        }    
    }

    // #2. Spiral Matrix --
    static List<Integer> spiralOrder(int [][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        int startRow = 0;
        int endRow = r-1;
        int startCol = 0;
        int endCol = c-1;

        while(startRow<=endRow && startCol<= endCol) {

            // 1left to right
            for(int col = startCol; col<=endCol; col++){
                ans.add(matrix[startRow][col]);
            }
            startRow++;
            // 2top to bottom
            for(int row = startRow; row<=endRow; row++){
                ans.add(matrix[row][endCol]);
            }
            endCol--;
            // 3right to left 
            for(int col = endCol; col>=startCol; col--){
                ans.add(matrix[endRow][col]);
            }
            endRow--;
            // 4bottom to top
            for(int row=endRow; row>=startRow;row--){
                ans.add(matrix[row][startCol]);
            }
            startCol++;
        }
        return ans;

    }

    public static void main(String[] args) {
        
        // 1.
        // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // rotateImage(matrix, matrix.length);

        // for(int[]row : matrix){
        //     for(int value : row){
        //         System.out.println(value);
        //     }
        // }

        // int N= 3;
        // int ans[][]= rotateImage(matrix, N);
        // for(int i =0;i<N;i++){
        //     for(int j =0;j<N;j++){
        //         System.out.println(ans[i][j]);
        //     }
        // }


        //2.
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);


        // -- End --
    }  
}