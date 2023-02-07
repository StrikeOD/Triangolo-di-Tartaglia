package wtf.strike;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire il numero di righe desiderate per il triangolo di Tartaglia: ");
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

        for (int riga = 0; riga < rows; riga++) {
            for (int colonna = 0; colonna <= riga; colonna++) {
                System.out.print(triangle[riga][colonna] + " ");
            }
            System.out.println();
        }
    }
}
