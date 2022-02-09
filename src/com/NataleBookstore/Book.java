package com.NataleBookstore;

public class Book {

    private int isbn;
    private String title;
    private double price;

    private Category category;
    private Author author;

    public Book(int isbn, String title, double price, Category category, Author author){

        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.category = category;
        this.author = author;

    }

    public String toStringMy(){

        String s = "ISBN: " + this.isbn
                + " Book title: " + "'"+this.title+"'"
                + " Price: " + this.price
                + "\n"
                + this.category.toStringMy()
                + this.author.toStringMy();

        return s;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public Category getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
