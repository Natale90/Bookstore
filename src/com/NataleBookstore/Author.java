package com.NataleBookstore;

public class Author {

    private int id;
    private String authorName;
    private String authorLastname;


    public Author(int id, String authorName, String authorLastname){
        this.id = id;
        this.authorName = authorName;
        this.authorLastname = authorLastname;
    }

    public String toStringMy(){
        String s = "Author ID: " + this.id + " Author Name: " + this.authorName + " Author Lastname: " + this.authorLastname + "\n";
        return s;
    }

    public int getId() {
        return id;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
