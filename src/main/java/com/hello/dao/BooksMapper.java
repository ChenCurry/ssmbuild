package com.hello.dao;

import com.hello.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
    int addBooks(Books books);

    int deleteBooks(@Param("bookID") int id);

    int updateBooks(Books books);

    Books queryBooks(@Param("bookID") int id);

    List<Books> queryAllBooks();

    Books queryBookByName(@Param("bookName") String bookName);
}
