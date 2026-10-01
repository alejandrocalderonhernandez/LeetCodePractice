package com.alejandro.letcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindKDistinctColor {

    public static String findNthDistinctColor(List<String> colors, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String c: colors) {
            map.merge(c,1, Integer::sum);
        }

        return map.entrySet().stream()
                .filter(es -> es.getValue() == 1)
                .skip(k - 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);

    }

    public static void main(String[] args) {
        List<String> complexColors = Arrays.asList(
                "Red", "Green", "Blue", "Orange", "Green", "Red",
                "Blue", "Purple", "Cyan", "Yellow", "Cyan", "Brown",
                "Pink", "Brown", "Gray", "Gray", "Black", "Magenta",
                "Magenta", "Silver", "Silver", "Gold", "Gold", "Red"
        );

        int n1 = 2;
        String result1 = findNthDistinctColor(complexColors, n1);
        System.out.println("Caso 1 - Obtenido: " + result1 + " | Esperado: Purple");

        int n2 = 5;
        String result2 = findNthDistinctColor(complexColors, n2);
        System.out.println("Caso 2 - Obtenido: " + result2 + " | Esperado: Black");


        int n3 = 6;
        String result3 = findNthDistinctColor(complexColors, n3);
        System.out.println("Caso 3 - Obtenido: " + result3 + " | Esperado: null");
    }
}
