package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import static a_Zadania.a_Dzien_1.a_kolekcje_1.Main3.initializeCityList;

public class Main4 {

    public static void main(String[] args) {
        List<City> cities = initializeCityList();
        reverse(cities).forEach(city -> System.out.println(city.toString()));
    }

    public static List<City> reverse (List<City> list ){
//        ListIterator<City> cityListIterator = list.listIterator();
//        List<City> tempList = new ArrayList<>();
//        while (cityListIterator.hasNext()) {
//            cityListIterator.next();
//        }
//        while (cityListIterator.hasPrevious()) {
//            tempList.add(cityListIterator.previous());
//        }
//        return tempList;
        Collections.reverse(list);
        return list;
    }

}
