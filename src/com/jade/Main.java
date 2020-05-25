package com.jade;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> people = getPeople();
//        people.forEach(System.out::println);



        // Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
//        females.forEach(System.out::println);



        // Sort Ascending
        List<Person> ascending = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
//        ascending.forEach(System.out::println);




        // Sort Descending
        List<Person> descending = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
//        descending.forEach(System.out::println);



        // All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 10);
//        System.out.println(allMatch);



        // Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 100);
//        System.out.println(anyMatch);



        // None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Aliocha"));
//        System.out.println(noneMatch);



        // Max value
        people.stream()
                .max(Comparator.comparing(Person::getAge));
//                .ifPresent(System.out::println);



        // Min value
        people.stream()
                .min(Comparator.comparing(Person::getAge));
//                .ifPresent(System.out::println);



        // Group
        Map<Gender, List<Person>> groupByGender =  people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

//        groupByGender.forEach((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//            System.out.println();
//        });



        // get oldest female
        Optional<String> oldestFemale = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemale.ifPresent(System.out::println);

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
