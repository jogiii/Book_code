package com.jogi.book;

import com.jogi.book.Book;
import com.jogi.book.IndexCreator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IndexCreatorTest {

    @Test
    void testCreateIndex() {
        List<Page> pages = Arrays.asList(
                new Page(1, "Java is a programming language."),
                new Page(2, "Java is widely used in software development."),
                new Page(3, "Object-oriented programming is a key feature of Java.")
        );
        Book book = new Book(pages);

        List<String> keywords = Arrays.asList("Java", "programming", "Object-oriented");
        Map<String, List<Integer>> index = IndexCreator.createIndex(book, keywords);

        assertEquals(Arrays.asList(1, 2, 3), index.get("Java"), "Java should be found in pages 1, 2, and 3");
        assertEquals(Arrays.asList(1, 3), index.get("programming"), "Programming should be found in pages 1 and 3");
        assertEquals(Arrays.asList(3), index.get("Object-oriented"), "Object-oriented should be found in page 3");
    }

    @Test
    void testCreateIndexNonExistingKeyword() {
        List<Page> pages = Arrays.asList(
                new Page(1, "Java is a programming language."),
                new Page(2, "Java is widely used in software development."),
                new Page(3, "Object-oriented programming is a key feature of Java.")
        );
        Book book = new Book(pages);

        List<String> nonExistingKeyword = Arrays.asList("Python", "C++");
        Map<String, List<Integer>> index = IndexCreator.createIndex(book, nonExistingKeyword);

        assertTrue(index.get("Python").isEmpty(), "Python should not be found in the book");
        assertTrue(index.get("Python").isEmpty(), "C++ should not be found in the book");
    }
}
