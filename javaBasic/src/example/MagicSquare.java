package example;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;

        try {
            size = scanner.nextInt();
        } catch (Exception exception) {
            return;
        }

        if (size < 3 || size % 2 == 0) return;
        int[][] magicSquare = createMagicSquare(size);

        for (int[] array: magicSquare) {
            for (int number: array) System.out.print(number + " ");
            System.out.println();
        }
    }

    public static int[][] createMagicSquare(int size) {
        int[][] magicSquare = new int[size][size];

        int number = 1;
        int row = 0;
        int col = size / 2;
        int currentRow = row;
        int currentCol = col;

        while (number <= size * size) {
            magicSquare[row][col] = number;
            number++;
            currentRow = row;
            currentCol = col;
            row--;
            col++;

            if (row < 0) row = size - 1;
            if (col == size) col = 0;

            if (magicSquare[row][col] != 0) {
                row = currentRow + 1 == size ? 0 : currentRow + 1;
                col = currentCol;
            }
        }
        return magicSquare;
    }
}