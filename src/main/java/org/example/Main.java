package org.example;

import java.util.Scanner;

// Klavyeden girilen terim sayısı (N) için Fibonacci Serisinin ilk N terimini bulup ekrana yazan program

public class Main {
    public static void main(String[] args) {

        int i;
        int N;
        int T1;
        int T2;
        int T3;

        System.out.printf("Fibonacci Serisi\n\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Terim Sayısı : ");
        N = scanner.nextInt();
        T1 = 1;
        T2 = 1;
        System.out.print("\n" + T1 + "\t" + T2 + "\t");
        for (i = 1; i <= N - 2; i++) {
            T3 = T1 + T2;
            System.out.println(T3 + "\t");
            T1 = T2;
            T2 = T3;
        }
    }
}