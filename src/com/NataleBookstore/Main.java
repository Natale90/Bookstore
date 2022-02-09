package com.NataleBookstore;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> bookStore = new ArrayList<>();

        Book book1 = new Book(
                1,
                "Peter Pan",
                15,
                new Category(1, "Children"),
                new Author(1, "J.M", "Burrys")
        );

        Book book2 = new Book(
                 2,
                "Tungsteno",
                12.5,
                new Category(2, "Novel"),
                new Author(2, "Cesar", "Vallejo")
        );

        Book book3 = new Book(
                3,
                "Ask the dust",
                18.5,
                new Category(2, "Novel"),
                new Author(3, "Jhon", "Fante")
        );

        Book book4 = new Book(
                4,
                "L'interpretazione dei sogni",
                50.0,
                new Category(3, "Saggistica"),
                new Author(4, "Sigmund", "Freud")
        );

        Book book5 = new Book(
                5,
                "Fondazione Terra",
                10.5,
                new Category(4, "SciFi"),
                new Author(5, "Isaac", "Asimov")
        );

        Book book6 = new Book(
                6,
                "Iperversum",
                8.5,
                new Category(5, "Fantasy"),
                new Author(6, "Cecilia", "Randal")
        );

        Book book7 = new Book(
                7,
                "Iseguendo un raggio di luce",
                5.5,
                new  Category(3, "Saggistica"),
                new Author(7, "Amedeo", "Balbi")
        );

        Book book8 = new Book(
                7,
                "Lord of the rings",
                11.5,
                new  Category(5, "Fantasy"),
                new Author(8, "J.R.R", "Tolkien")
        );

        bookStore.add(book1);
        bookStore.add(book2);
        bookStore.add(book3);
        bookStore.add(book4);
        bookStore.add(book5);
        bookStore.add(book6);
        bookStore.add(book7);
        bookStore.add(book8);

        getFilteredBooks(10,20, bookStore);

    }

    public static void getFilteredBooks(double min, double max, ArrayList<Book> booklist) {
        ArrayList<Book> filteredBooks = new ArrayList<>();
        double sum = 0;
        for (Book b : booklist){

            if (b.getPrice() >= 10 && b.getPrice() <= 20){
                filteredBooks.add(b);
                sum += b.getPrice();
            }
        }


        for (Book b : filteredBooks){
            System.out.println(b.toStringMy());
        }

        System.out.println("Total Price: " + sum);
    }


}
