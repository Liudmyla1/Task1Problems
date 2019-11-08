package problems.mostCommonSymbol;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostCommonSymbol {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        String string = getString();
        //needs to count meets of each symbol, key is symbol, value is number of meets
        Map<String, Integer> symbols = getHashMap(string);

        findMostCommonSymbol(symbols);
    }

    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static Map<String, Integer> getHashMap(String string) {
        Map<String, Integer> symbols = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            String symbol = Character.toString(string.charAt(i)).toLowerCase();
            if (symbols.containsKey(symbol)) {
                int value = symbols.get(symbol);
                symbols.remove(symbol);
                symbols.put(symbol, value + 1);
            } else {
                symbols.put(symbol, 1);
            }
        }

        return symbols;
    }

    private static void findMostCommonSymbol(Map<String, Integer> map) {
        String mostCommonSymbol = "";
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                mostCommonSymbol = entry.getKey();
            }
        }

        if (count == 0) {
            System.out.println("There is no symbols in line.");
        } else {
            System.out.println("Most common symbol in string: " + mostCommonSymbol + ", it was found " + count + " times.");
        }
    }
}
