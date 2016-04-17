/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1604.hometask3;

/**
 *
 * @author Артём
 */
import java.util.Arrays;

public class ShiftArr {
    public static void main(String[] args) {
        int [][] arr = {{0, 1, 2, 3, 4},{5, 6, 7, 8, 9}};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr [i][j] + " ");

            }
            System.out.println();
        }
    }
}