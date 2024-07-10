package com.dsa.striver.Arrays.medium.matrix;

import static java.util.Collections.rotate;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = rotate(matrix);
        for (int i=0;i<result.length;i++){
            for (int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static int[][] rotate(int[][] matrix) {
        int len = matrix.length/2;

        for(int i=0;i<matrix.length;i++){


        }
        return matrix;
    }
}
