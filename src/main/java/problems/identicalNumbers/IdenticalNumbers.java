package problems.identicalNumbers;

import java.util.ArrayList;

import static problems.InputArray.getArray;

public class IdenticalNumbers {
    public static void main(String[] args) {
        System.out.println("Set the first array.");
        //method getArray() from class InputArray in problems package, to avoid duplicates
        int[] firstArray = getArray();
        System.out.println("Set the second array.");
        int[] secondArray = getArray();
        findIdenticalNumbers(firstArray, secondArray);
    }

    private static void findIdenticalNumbers(int[] firstArray, int[] secondArray) {
        ArrayList identicalNumbersList = new ArrayList();
        for (int firstItem : firstArray) {
            if (!identicalNumbersList.contains(firstItem)) {
                for (int secondItem : secondArray) {
                    if (firstItem == secondItem) {
                        identicalNumbersList.add(firstItem);
                    }
                }
            }
        }
        if (identicalNumbersList.size() == 0) {
            System.out.println("There is no identical numbers in arrays.");
        } else {
            System.out.println("Identical numbers in arrays: " + identicalNumbersList);
        }
    }
}
