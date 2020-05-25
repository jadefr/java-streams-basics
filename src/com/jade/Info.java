package com.jade;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Info {

    private final List<Person> people;

    Info(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    /**
     *  Filter
     */
    public void getFemales() {
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females.forEach(System.out::println);
    }


    /**
     *  Ascending Sort
     */
    public void getAscendingAges() {
        List<Person> ascending = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        ascending.forEach(System.out::println);
    }


    /**
     *  Descending Sort
     */
    public void getDescendingAges() {
        List<Person> descending = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
        descending.forEach(System.out::println);
    }


    /**
     *  All match
     */
    public void allMatch() {
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 10);
        System.out.println(allMatch);
    }


    /**
     *  Any match
     */
    public void anyMatch() {
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 100);
        System.out.println(anyMatch);
    }


    /**
     *  None match
     */
    public void noneMatch() {
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Aliocha"));
        System.out.println(noneMatch);
    }


    /**
     *  Max value
     */
    public void maxValue() {
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
    }


    /**
     *  Min value
     */
    public void minValue() {
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
    }


    /**
     *  Group
     */
    public void groupByGender() {
        Map<Gender, List<Person>> groupByGender =  people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });
    }


    /**
     *  get oldest female
     */
    public void oldestFemale() {
        Optional<String> oldestFemale = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemale.ifPresent(System.out::println);
    }



}
