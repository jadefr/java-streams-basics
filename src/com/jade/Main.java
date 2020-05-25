package com.jade;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> people = getPeople();

        Info info = new Info(people);

        info.getPeople().forEach(System.out::println);
        System.out.println();

        System.out.println(":: FEMALES ::");
        info.getFemales();
        System.out.println();

        System.out.println(":: ASCENDING ORDER ::");
        info.getAscendingAges();
        System.out.println();

        System.out.println(":: DESCENDING ORDER ::");
        info.getDescendingAges();
        System.out.println();

        System.out.println(":: ALL MATCH ::");
        info.allMatch();
        System.out.println();

        System.out.println(":: ANY MATCH ::");
        info.anyMatch();
        System.out.println();

        System.out.println(":: NONE MATCH ::");
        info.noneMatch();
        System.out.println();

        System.out.println(":: MAX VALUE ::");
        info.maxValue();
        System.out.println();

        System.out.println(":: MIN VALUE ::");
        info.minValue();
        System.out.println();

        System.out.println(":: GROUP BY GENDER ::");
        info.groupByGender();
        System.out.println();

        System.out.println(":: OLDEST FEMALE ::");
        info.oldestFemale();
        System.out.println();
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Fedor Pavlovitch Karamazov", 55, Gender.MALE),
                new Person("Dmitri Fedorovitch Karamazov", 28, Gender.MALE),
                new Person("Ivan Fedorovitch Karamazov", 24, Gender.MALE),
                new Person("Alexei Fedorovitch Karamazov", 20, Gender.MALE),
                new Person("Pavel Smerdiakov", 18, Gender.MALE),
                new Person("Agrafena Alexandrovna", 22, Gender.FEMALE),
                new Person("Catalina Ivanovna", 24, Gender.FEMALE),
                new Person("Father Zosima", 86, Gender.MALE),
                new Person("Ilucha Snegiryov", 9, Gender.MALE),
                new Person("Liza Khokhlakov,", 14, Gender.FEMALE)
        );
    }

}
