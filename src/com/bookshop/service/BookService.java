package com.bookshop.service;

import com.bookshop.mvc.Book;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 13-1-10
 * Time: 下午1:06
 * To change this template use File | Settings | File Templates.
 */
public class BookService implements Service {
    private ArrayList<Book> bookList = new ArrayList<Book>();
    public BookService(){
        this.bookList.add(new Book("Spring in action",40,"Craig"));
        this.bookList.add(new Book("Explain Xp",20,"Kent"));
    }


    @Override
    public ArrayList<Book> getList() {
        return this.bookList;
    }
}
