package com.repository;

import com.entity.Book;

import java.sql.Connection;

public class BookRepository extends BaseRepository<Book> implements Repository {

    Connection connection;

    @Override
    public Book save(Book entity) {
        return null;
    }
}
