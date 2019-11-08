package problems.positiveNumbers;

import static problems.InputArray.getTwoDimensionalArray;

public class PositiveNumbers {
    public static void main(String[] args) {
        //method getTwoDimensionalArray() from class InputArray in problems package
        int[][] array = getTwoDimensionalArray();

        removeNegativeElements(array);
        printArray(array);

        findRowWithMaxAverage(array);
    }

    private static void removeNegativeElements(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
            }
        }
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void findRowWithMaxAverage(int[][] array) {
        int rowNumber = 0;
        int maxAverage = 0;
        int average = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
            average = sum / array[0].length;
            if (average > maxAverage) {
                maxAverage = average;
                rowNumber = i;
            }
            sum = 0;
        }
        System.out.println("The number of row with max average: " + (rowNumber + 1));
    }
}
