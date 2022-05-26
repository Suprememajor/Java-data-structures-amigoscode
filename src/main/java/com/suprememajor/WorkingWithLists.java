package com.suprememajor;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List<String> immutableList = List.of(
                "Blue",
                "Purple"
        );
        immutableList.add("Pink");

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));

        for (String color: colors) {
            System.out.println(color);
        }

        colors.forEach(color -> System.out.println(color));
        colors.forEach(System.out::println);


    }
}
