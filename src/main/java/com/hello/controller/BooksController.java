package com.hello.controller;

import com.hello.pojo.Books;
import com.hello.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BooksController {
    @Autowired
    @Qualifier("BooksServiceImpl")
    private BooksService booksService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> books = booksService.queryAllBooks();
        model.addAttribute("list", books);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        System.out.println("addBook=>" + books);
        booksService.addBooks(books);
        return "redirect:/book/allBook";
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id, Model model) {
        Books books = booksService.queryBooks(id);
        model.addAttribute("QBook", books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        System.out.println("updateBook=>" + books);
        int i = booksService.updateBooks(books);
        if (i > 0) {
            System.out.println("添加成功"+books);
        }
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        int i = booksService.deleteBooks(id);
        return "redirect:/book/allBook";
    }

}
