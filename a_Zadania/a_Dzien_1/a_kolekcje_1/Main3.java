package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        List<City> cities = initializeCityList();
        System.out.println("First sub list");
        firstSubList(cities, 0, 2).forEach(city -> System.out.println(city.toString()));
        System.out.println("\nSecond sub list");
        secondSubList(cities, 0, 2).forEach(city -> System.out.println(city.toString()));
    }

    public static List<City> initializeCityList() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Warszawa", 2000000));
        cities.add(new City("Krakow", 500000));
        cities.add(new City("Lodz", 750000));
        cities.add(new City("Wroclaw", 500000));
        cities.add(new City("Lublin", 350000));
        return cities;
    }

    public static List<City> firstSubList(List<City> list, int start, int end) {
        List<City> tempList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            tempList.add(list.get(i));
        }
        return tempList;
    }

    public static List<City> secondSubList(List<City> list, int start, int end) {
        return list.subList(start, end);
    }
}
