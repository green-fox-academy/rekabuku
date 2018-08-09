package com.company;

public class Main {

    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        int[][] twoDimArray = new int[4][4];
        for (int i = 0; i < twoDimArray.length; i++) {
            twoDimArray[i][i] = 1;
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                System.out.print(twoDimArray[i][j]);
            }
            System.out.println();
        }
    }
}


