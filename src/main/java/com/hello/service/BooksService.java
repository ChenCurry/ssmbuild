package com.hello.service;

import com.hello.pojo.Books;

import java.util.List;

public interface BooksService {
    int addBooks(Books books);

    int deleteBooks(int id);

    int updateBooks(Books books);

    Books queryBooks(int id);

    List<Books> queryAllBooks();
}
