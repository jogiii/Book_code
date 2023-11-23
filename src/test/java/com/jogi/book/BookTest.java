package com.jogi.book;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    @Test
    void testBookCreation() {
        List<Page> pages = Arrays.asList(
                new Page(1, "Java is a programming language."),
                new Page(2, "Java is widely used in software development."),
                new Page(3, "Object-oriented programming is a key feature of Java.")
        );
        Book book = new Book(pages);
        assertEquals(3, book.getPages().size(), "Book should have 3 pages");
    }
}
