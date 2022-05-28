package com.suprememajor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("African Diamond"));
        System.out.println(map.get(new Person("Jamila")));
    }

    private static void maps() {
        Map<Integer, WorkingWithQueues.Person> map = new HashMap<>();
        map.put(1, new WorkingWithQueues.Person("Alex", 18));
        map.put(2, new WorkingWithQueues.Person("Alexa", 18));
        map.put(3, new WorkingWithQueues.Person("Mariam", 30));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        map.entrySet().forEach(System.out::println);

        map.remove(3);

        map.forEach((integer, person) -> {
            System.out.println(integer + " - " + person);
        });

        System.out.println(map.getOrDefault(3, new WorkingWithQueues.Person("Default", 23)));
        System.out.println(map.values());
    }

    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return name.equals(person.name);
        }
        //Always override equals and hash methods

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    record Diamond(String name){}
}
