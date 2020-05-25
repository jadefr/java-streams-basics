package com.jade;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> people = getPeople();

        // Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females.forEach(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Fedor Pavlovitch Karamazov", 55, Gender.MALE),
                new Person("Dmitri Fedorovitch Karamazov", 28, Gender.MALE),
                new Person("Ivan Fedorovitch Karamazov", 24, Gender.MALE),
                new Person("Alexei Fedorovitch Karamazov", 20, Gender.MALE),
                new Person("Pavel Smerdiakov", 18, Gender.MALE),
                new Person("Agrafena Alexandrovna", 22, Gender.FEMALE),
                new Person("Katerina Ivanovna", 24, Gender.FEMALE),
                new Person("Zosima", 86, Gender.MALE),
                new Person("Ilucha", 9, Gender.MALE),
                new Person("Liza", 14, Gender.FEMALE)
        );
    }
}
