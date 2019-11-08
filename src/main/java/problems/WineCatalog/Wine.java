package problems.WineCatalog;

import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private int id;
    private String wineName;
    private String country;
    private LocalDate bottlingDate;

    Wine(String wineName, String country, LocalDate bottlingDate) {
        this.wineName = wineName;
        this.country = country;
        this.bottlingDate = bottlingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBottlingDate() {
        return bottlingDate;
    }

    public void setBottlingDate(LocalDate bottlingDate) {
        this.bottlingDate = bottlingDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWineName() {
        return wineName;
    }

    public void setWineName(String wineName) {
        this.wineName = wineName;
    }

    public int getAging(LocalDate bottlingDate, LocalDate currentDate) {
        if ((bottlingDate != null) && (currentDate != null)) {
            return Period.between(bottlingDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

}
