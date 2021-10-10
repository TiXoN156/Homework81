package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("элемент");
        list.add("массив");
        list.add("строка");
        list.add("значение");
        list.add("цикл");
        list.add("класс");
        list.add("метод");
        list.add("импорт");
        list.add("интерфейс");
        list.add("строка");
        list.add("класс");
        list.add("метод");
        list.add("импорт");
        list.add("интерфейс");
        list.add("строка");

        getUniqueWords(list);
    }

    private static void getUniqueWords(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : list) {
            result.put(s, result.getOrDefault(s, 0) +1);
        }
        for (Map.Entry<String, Integer> temp : result.entrySet()) {
            System.out.println(String.format("Слово %s встречается %s раз(а).", temp.getKey(), temp.getValue()));
        }
    }
}
