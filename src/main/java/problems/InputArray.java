package problems;

import java.util.Scanner;

public class InputArray {
    private static Scanner scanner = new Scanner(System.in);
    public static int[] getArray() {
        System.out.println("Enter the size of array:");
        int arraySize = scanner.nextInt();
        int[] inputArray = new int[arraySize];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }

        return inputArray;
    }

    public static int[][] getTwoDimensionalArray() {
        System.out.println("Enter the number of rows in array:");
        int rowsNumber = scanner.nextInt();
        System.out.println("Enter the number of columns in array:");
        int columnsNumber = scanner.nextInt();
        int[][] inputArray = new int[rowsNumber][columnsNumber];

        System.out.println("Enter array elements:");
        for (int i = 0; i < rowsNumber; i++) {
            for (int j = 0; j < columnsNumber; j++) {
                inputArray[i][j] = scanner.nextInt();
            }
        }

        return inputArray;
    }
}
