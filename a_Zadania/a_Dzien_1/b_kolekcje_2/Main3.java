package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        List<Country> countries = initialize();
        Map<String, Country> countryMap = getMap(countries);
        Set<String> capitals = countryMap.keySet();
        for (String capital : capitals) {
            System.out.println(capital + " - " + countryMap.get(capital).getName());
        }
    }

    public static List<Country> initialize() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Poland", "Warsaw"));
        countries.add(new Country("Germany", "Berlon"));
        countries.add(new Country("Spain", "Madrid"));
        countries.add(new Country("France", "Paris"));
        countries.add(new Country("Itali", "Rome"));
        return countries;
    }

    public static Map<String, Country> getMap(List<Country> list) {
        Map<String, Country> countryMap = new HashMap<>();
        for (Country country : list) {
            countryMap.put(country.getCapital(), country);
        }
        return countryMap;
    }

}
