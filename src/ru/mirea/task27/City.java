package ru.mirea.task27;

public class City {
    private String town;
    private String country;

    public City(String town, String country) {
        this.town = town;
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "'" + town + ";" + country + "'";
    }
}

