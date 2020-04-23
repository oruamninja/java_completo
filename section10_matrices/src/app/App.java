package app;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault( Locale.US );

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // instancia matriz bidirecional 
        int[][] mat = new int[n][n];


        for (int i=0; i<mat.length; i++) { //for para percorrer as linhas da matriz
            for (int j=0; j<mat[i].length; j++) { //for para percorrer as colunas da matriz
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal:");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        int count = 0;
        for (int i=0; i<mat.length; i++) { //for para percorrer as linhas da matriz
            for (int j=0; j<mat[i].length; j++) { //for para percorrer as colunas da matriz
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Negative numbers: " + count);

        sc.close();
    }
}