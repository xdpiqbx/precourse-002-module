package LessonByMelnichuk.lambdaStream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CityTests {
    public static void main(String[] args) {
        City kyiv = new City("Kiev", 4000000);
        City vinnyca = new City("Vinnyca", 450000);
        City lviv = new City("Lviv", 1000000);

//        Map<String, Integer> cityPopulation = Stream.of(kyiv, vinnyca, lviv)
//                .collect(Collectors.toMap(
//                        it -> it.getName(),
//                        it -> it.getPopulation()
//                ));

        Map<String, Integer> cityPopulation = Stream.of(kyiv, vinnyca, lviv)
                .collect(Collectors.toMap(
                        City::getName,
                        City::getPopulation
                ));

        // Imperative version
        Map<String, Integer> cityPopulationImperative = new HashMap<>();
        List<City> cities = Arrays.asList(kyiv, vinnyca, lviv);
        for (City city : cities) {
            cityPopulationImperative.put(city.getName(), city.getPopulation());
        }

        System.out.println("cityPopulation = " + cityPopulation);
        System.out.println("cityPopulationImperative = " + cityPopulationImperative);

        int totalPopulation = cityPopulation
                .values()
                .stream()
                .mapToInt(it -> it)
                .sum();

        int totalPopulationImp = 0;
        for (Integer value : cityPopulationImperative.values()) {
            totalPopulationImp += value;
        }

        System.out.println("totalPopulation = " + totalPopulation);
        System.out.println("totalPopulationImp = " + totalPopulationImp);
    }
}
