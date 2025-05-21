package org.example;

import org.example.entity.StringSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main çalışıyor.");
        System.out.println("Unique words: " + StringSet.findUniqueWords().size());
        System.out.println("İlk 10 kelime:");
        StringSet.findUniqueWords().stream().limit(10).forEach(System.out::println);
    }
}