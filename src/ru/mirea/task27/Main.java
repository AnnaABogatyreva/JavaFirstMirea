package ru.mirea.task27;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 1. десять записей по принципу «фамилия» - «имя».
        HashMap<String, String> m1 = new HashMap<>();
        m1.put("Smith", "John");
        m1.put("Bond", "James");
        m1.put("Trump", "Donald");
        m1.put("McDuck", "Scrooge");
        m1.put("Monroe", "Marilyn");
        m1.put("Kennedy", "John");
        m1.put("Duck", "Donald");
        m1.put("Manson", "Marilyn");
        m1.put("Connor", "John");
        m1.put("Schwarzenegger", "Arnold");
        System.out.println("before: " + m1);
        HashMap<String, Integer> names1 = new HashMap<>();
        for (String fam : m1.keySet()) {
            String name = m1.get(fam);
            names1.put(name, names1.getOrDefault(name, 0) + 1);
        }
        //System.out.println(d1);
        Set<String> fams1 = new HashSet<String>();
        for (String fam : m1.keySet())
            if (names1.get(m1.get(fam)) > 1)
                fams1.add(fam);
        //System.out.println(fams1);
        for (String fam : fams1)
            m1.remove(fam);
        System.out.println("after: " + m1);

        // 2. Опишите класс City с полями город, страна.
        ArrayList<City> a2 = new ArrayList<>();
        a2.add(new City("New York", "USA"));
        a2.add(new City("Los Angeles", "USA"));
        a2.add(new City("Moscow", "Russia"));
        a2.add(new City("London", "England"));
        a2.add(new City("Chicago", "USA"));
        a2.add(new City("Novosibirsk", "Russia"));
        a2.add(new City("Dallas", "USA"));
        a2.add(new City("Seattle", "USA"));
        a2.add(new City("Manchester", "England"));
        a2.add(new City("Kaliningrad", "Russia"));
        System.out.println("cities: " + a2);
        Map<String, ArrayList<String>> m2 = new HashMap();
        for (City city : a2) {
            if (!m2.containsKey(city.getCountry()))
                m2.put(city.getCountry(), new ArrayList<>());
            m2.get(city.getCountry()).add(city.getTown());
        }
        System.out.println("map: " + m2);

    }
}
