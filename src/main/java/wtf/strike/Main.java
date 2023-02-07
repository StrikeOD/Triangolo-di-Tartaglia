package wtf.strike;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci il numero di righe del triangolo di Tartaglia: ");
        int rows = sc.nextInt();
        int[][] triangle = new int[rows][];

        for (int riga = 0; riga < rows; riga++) {
            triangle[riga] = new int[riga + 1];
            triangle[riga][0] = 1;
            triangle[riga][riga] = 1;

            for (int colonna = 1; colonna < riga; colonna++) {
                triangle[riga][colonna] = triangle[riga - 1][colonna - 1] + triangle[riga - 1][colonna];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
