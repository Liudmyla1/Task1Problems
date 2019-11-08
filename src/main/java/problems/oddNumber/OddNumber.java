package problems.oddNumber;

import static problems.InputArray.getArray;

public class OddNumber {
    public static void main(String[] args) {
        //method getArray() from class InputArray in problems package, to avoid duplicates
        int[] array = getArray();
        findMaxOdd(array);
    }

    private static void findMaxOdd(int[] array) {
        int maxOdd = 0;
        //update maxOdd value
        for (int value : array) {
            if (value % 2 != 0 && value > maxOdd) {
                maxOdd = value;
            }
        }
        if (maxOdd == 0) {
            System.out.println("There is no odd numbers in array.");
        } else {
            System.out.println("Max odd number in array: " + maxOdd);
        }
    }
}
