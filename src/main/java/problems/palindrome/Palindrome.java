package problems.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        int totalNumber = 0;
        int i = Integer.MIN_VALUE;
        //search palindromes from min to max integer value
        do {
            //even numbers can't be palindromes
            if (i % 2 != 0) {
                String binaryNumber = Integer.toBinaryString(i);
                if (isPalindrome(binaryNumber)) {
                    totalNumber++;
                    System.out.println(i + " is a palindrome: " + binaryNumber);
                }
            }
            i++;
        } while (i != Integer.MAX_VALUE+1);
        System.out.println("Total number of palindromes: " + totalNumber);
    }

    private static boolean isPalindrome(String binaryNumber) {
        int length = binaryNumber.length();
        //compare left and right half
        for (int i = 0; i < length / 2; i++) {
            if (binaryNumber.charAt(i) != binaryNumber.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}