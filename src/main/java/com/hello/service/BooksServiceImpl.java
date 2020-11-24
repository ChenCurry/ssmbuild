package com.hello.service;

import com.hello.dao.BooksMapper;
import com.hello.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService {

    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    public int addBooks(Books books) {
        return booksMapper.addBooks(books);
    }

    public int deleteBooks(int id) {
        return booksMapper.deleteBooks(id);
    }

    public int updateBooks(Books books) {
        System.out.println("BooksServiceImpl.updateBooks=>"+books);
        return booksMapper.updateBooks(books);
    }

    public Books queryBooks(int id) {
        return booksMapper.queryBooks(id);
    }

    public List<Books> queryAllBooks() {
        return booksMapper.queryAllBooks();
    }
}
