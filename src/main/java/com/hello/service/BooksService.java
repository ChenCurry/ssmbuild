package com.hello.service;

import com.hello.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksService {
    int addBooks(Books books);

    int deleteBooks(int id);

    int updateBooks(Books books);

    Books queryBooks(int id);

    List<Books> queryAllBooks();

    Books queryBookByName(String bookName);
}
