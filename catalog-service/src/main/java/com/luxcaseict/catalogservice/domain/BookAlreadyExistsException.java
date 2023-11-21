package com.luxcaseict.catalogservice.domain;

/**
 * BookAlreadyExistsException already
 */
public class BookAlreadyExistsException extends RuntimeException{
    /**
     *
     * @param isbn isbn
     */
    public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }
}
