package com.example.jsonparsing;

public class book {
int bookId,price;
String Bookname,Writter;

    public book(int bookId, int price, String bookname, String writter) {
        this.bookId = bookId;
        this.price = price;
        Bookname = bookname;
        Writter = writter;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public String getWritter() {
        return Writter;
    }

    public void setWritter(String writter) {
        Writter = writter;
    }
}
