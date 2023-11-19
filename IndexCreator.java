package com.bigquery.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexCreator {
    public static Map<String, List<Integer>> createIndex(Book book, List<String> keywords) {
        Map<String, List<Integer>> index = new HashMap<>();

        for (String keyword : keywords) {
            List<Integer> occurrences = new ArrayList<>();
            for (Page page : book.getPages()) {
                if (page.getPageContent().contains(keyword)) {
                    occurrences.add(page.getPageNo());
                }
            }
            index.put(keyword, occurrences);
        }

        return index;
    }
}
