package com.hello.dao;

import com.hello.pojo.Books;

import java.util.List;

public interface BooksMapper {
    int addBooks(Books books);

    int deleteBooks(int id);

    int updateBooks(Books books);

    Books queryBooks(int id);

    List<Books> queryAllBooks();
}
