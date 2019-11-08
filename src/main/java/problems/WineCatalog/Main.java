package problems.WineCatalog;

import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        WineCatalog catalog = new WineCatalog();
        completeCatalog(catalog);
        catalog.printCatalog();
    }

    private static void completeCatalog(WineCatalog catalog) {
        String[] wines = {"Chardonnay", "Cabernet", "Barbera", "Charbono", "Dolcetto", "Malbec", "Marsanne", "Muscat", "Pinot Blanc"};
        String[] countries = {"France", "Italy", "Spain", "Ukraine", "USA"};

        Random random = new Random();
        int amount = random.nextInt(50);
        RandomDate randomDate = new RandomDate(LocalDate.of(1800, 1, 1), LocalDate.of(2018, 1, 1));
        for (int i = 0; i < amount; i++) {
            catalog.addWine(new Wine(wines[random.nextInt(wines.length)],
                    countries[random.nextInt(countries.length)],
                    randomDate.nextDate()));
        }
    }
}
