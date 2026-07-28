package com.alejandro.other;

import java.util.List;

public class StreamRemoveDuplicate {

    public static void removeDuplicate(List<String> list) {

        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        removeDuplicate(List.of("apple", "banana", "apple", "orange"));
    }
}
