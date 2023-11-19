package com.bigquery.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Page> pages = Arrays.asList(
                new Page(1, "Java is a programming language."),
                new Page(2, "Java is widely used in software development."),
                new Page(3, "Object-oriented programming is a key feature of Java.")
        );

        Book book = new Book(pages);

        List<String> keywords = Arrays.asList("Java", "programming", "Object-oriented");

        Map<String, List<Integer>> index = IndexCreator.createIndex(book, keywords);

        // Print the index
        for (Map.Entry<String, List<Integer>> entry : index.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
