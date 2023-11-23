package com.jogi.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IndexCreator {
    public static Map<String, List<Integer>> createIndex(Book book, List<String> keywords) {
        if (book == null || keywords == null) {
            throw new IllegalArgumentException("Book and keywords cannot be null.");
        }

        Map<String, List<Integer>> index = new HashMap<>();

        for (String keyword : keywords) {
            List<Integer> occurrences = book.getPages().stream()
                    .filter(page -> page.getPageContent().contains(keyword))
                    .map(Page::getPageNo)
                    .collect(Collectors.toList());

            index.put(keyword, occurrences);
        }

        return index;
    }
}
