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

public class TriangMatrix {

    public static void main(String[] args) {
        int mass[][] = new int [4][];
        mass[0] = new int[1];
        mass[1] = new int[2];
        mass[2] = new int[3];
        mass[3] = new int[4];
        
        int i, j, k = 0;
        
        for (i = 0; i < 4; i++) 
            for(j = 0; j < i + 1; j++) {
                mass[i][j] = k;
                k++;
            }
        
        
        for (i = 0; i < 4; i++) {
            for(j = 0; j < i + 1; j++) 
                System.out.print(mass[i][j] + " ");
                System.out.println();
            }
        
    }
}