package problems.WineCatalog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WineCatalog {
    private List<Wine> catalog = new ArrayList<>();

    public List<Wine> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Wine> catalog) {
        this.catalog = catalog;
    }

    void addWine(Wine wine) {
        catalog.add(wine);
    }

    void printCatalog() {
        for (Wine wine: catalog) {
            System.out.println(wine.getWineName() + ", " + wine.getCountry() + ", " + wine.getBottlingDate() + ", "
                    + wine.getAging(wine.getBottlingDate(), LocalDate.now()) + " years of aging.");
        }
        System.out.println("Catalog counts " + catalog.size() + " wines.");
    }
}
