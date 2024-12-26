package com.rizwan.utils;

import com.rizwan.Book;
import com.rizwan.exceptions.BookNotFoundException;

public class BookValidator {
    public static void validateBookNotNull(Book book, String message) {
        if (book == null) {
            throw new BookNotFoundException(message);
        }
    }
}