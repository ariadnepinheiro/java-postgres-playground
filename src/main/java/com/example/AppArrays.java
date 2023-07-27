package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        x = 20;
        System.out.println(x);

        double vetorDouble[] = {10, 20, 30};
        System.out.println(Arrays. toString(vetorDouble));

        System.out.println("Valor da posição 0: " + vetorDouble[0]);
        System.out.println("Valor da posição 1: " + vetorDouble[1]);
        System.out.println("Valor da posição 2: " + vetorDouble[2]);

        vetorDouble[0] = 1;
        System.out.println("Valor da posição 0: " + vetorDouble[0]);

        int vetor3[] = new int[4];
        vetor3[0] = 100;
        vetor3[1] = 200;
        vetor3[2] = 300;
        vetor3[3] = 400;
        System.out.println(Arrays.toString(vetor3));

        double matriz[][] = { {10,20,30}, {40,50,60} };
        matriz[0][1] = -20;
        matriz[1] = new double[]{70,80};
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));

    }
}
