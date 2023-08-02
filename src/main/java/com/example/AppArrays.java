package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        /*
        int x = 10;
        System.out.println(x);

        x = 20;
        System.out.println(x);

        double vetorDouble[] = {10, 20, 30};
        System.out.println(Arrays.toString(vetorDouble));

        System.out.println("Valor da posição 0: " + vetorDouble[0]);
        System.out.println("Valor da posição 1: " + vetorDouble[1]);
        System.out.println("Valor da posição 2: " + vetorDouble[2]);

        vetorDouble[0] = 1;
        System.out.println("Valor da posição 0: " + vetorDouble[0]);

        int vetor3[] = new int[5];
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = 100 * (i + 1);
        }
        System.out.println(Arrays.toString(vetor3));
        
        matriz[0][1] = -20;
        matriz[1] = new double[]{70,80};
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
        */

        double matriz[][] = new double[3][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i * matriz[i].length + j+1) * 10;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5.1f ", matriz[i][j]);
            }
        }
    }
}
