package collections;

import java.util.*;

public class CollectionsExample {
    public void collectionsExample() {
        Set<String> namesSet = new HashSet<>();
        namesSet.add("Bob");
        namesSet.add("John");

        Map<String, String> countriesMap = new HashMap<>();
        countriesMap.put("England", "London");
        countriesMap.put("France", "Paris");

        List<String> namesList = new ArrayList<>();
        namesList.add("Matty");
        namesList.add("Martin");

        List<String> namesList2 = Arrays.asList("Matty", "Martin");

        List<String> names = List.of("Matty", "Martin");
        Set<String> newSet = Set.of("Jess", "Emily");
        Map<String, String> countries = Map.of("Poland", "Warsaw", "Germany", "Berlin");
        Map<String, String> countries2 = Map.ofEntries(Map.entry("England", "London"), Map.entry("France", "Paris"));
    }
}
