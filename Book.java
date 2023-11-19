package com.bigquery.demo;

import java.util.List;

public class Book {
    private List<Page> pages;

    public Book(List<Page> pages) {
        this.pages = pages;
    }

    public List<Page> getPages() {
        return pages;
    }
}
