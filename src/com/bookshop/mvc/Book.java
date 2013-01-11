package com.bookshop.mvc;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 13-1-10
 * Time: 下午1:07
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    private String bookName;
    private double price;
    private String author;

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Book(String bookName,double price,String author){
        this.author = author;
        this.bookName = bookName;
        this.price = price;

    }
}
