package com.suprememajor;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);

        int[] numbers = {100, 200};
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println(colors.length);

        for (String colour: colors)
            System.out.println(colour);

        Arrays.stream(colors).forEach(color -> System.out.println(color));
        Arrays.stream(colors).forEach(System.out::println);


    }
}
