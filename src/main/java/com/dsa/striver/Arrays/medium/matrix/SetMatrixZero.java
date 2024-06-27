package com.dsa.striver.Arrays.medium.matrix;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1},{1,1,0}};
        int[][] result = setZeroes(matrix);
        for (int i=0;i<result.length;i++){
            for (int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }


    private static int[][] setZeroes(int[][] matrix) {

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for (int row : rowSet){
            for(int col=0;col<matrix[0].length;col++){
                matrix[row][col] = 0;
            }
        }
        for (int col : colSet){
            for (int row=0;row< matrix.length;row++){
                    matrix[row][col] = 0;
            }
        }
        return matrix;
    }
}
