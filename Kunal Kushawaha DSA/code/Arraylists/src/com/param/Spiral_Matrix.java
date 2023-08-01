package com.param;

import java.util.*;
public class Spiral_Matrix {

//    public static List<Integer> spiralOrder(int[][] matrix) {
//        int start_row = 0;
//        int end_row = matrix.length - 1;
//        int start_col = 0;
//        int end_col = matrix[0].length - 1;
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//
//        while (start_row <= end_row && start_col <= end_col) {
//
//            boolean l1 = false , l2 = false , l3 = false;
//
//            for (int i = start_col; i <= end_col; i++) {
//                list.add(matrix[start_row][i]);
//                l1 = true;
//            }
//
//            for (int j = start_row + 1; j <= end_row && l1; j++) {
//                list.add(matrix[j][end_col]);
//                l2 = true;
//            }
//            for (int k = end_col - 1; k >= start_col && l2;  k--) {
//                list.add(matrix[end_row][k]);
//                l3 = true;
//            }
//            for (int l = end_row - 1; l > start_row && l3; l--) {
//                list.add(matrix[l][start_col]);
//            }
//
//            label:
//            start_row++;
//            end_row--;
//            start_col++;
//            end_col--;
//
//        }
//
//        return list;
//
//    }


    //Alternating

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int startRow=0,startCol=0;
        int endRow= matrix.length-1;
        int endCol= matrix[0].length-1;

        while (startRow<=endRow && startCol<=endCol){

            //Top line
            for (int i = startCol; i <=endCol; i++) {
                ans.add(matrix[startRow][i]);
            }
            //Right line
            for (int i = startRow+1; i <=endRow ; i++) {
                ans.add(matrix[i][endCol]);
            }
            //Bottom Line
            for (int i = endCol-1; i >=startCol ; i--) {
                if (startRow==endRow)
                    break;
                ans.add(matrix[endRow][i]);
            }
            //Left Line
            for (int i =endRow-1; i >=startRow+1 ; i--) {

                if (startCol==endCol)
                    break;
                ans.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        System.out.println(spiralOrder(arr));
    }

}

