package com.NataleBookstore;

public class Category {

    private int id;
    private String categoryName;

    public Category(int id, String categoryName){
        this.id = id;
        this.categoryName = categoryName;
    }

    public String toStringMy(){
        String s = "Category ID: " + this.id + " Category: " + this.categoryName + "\n";
        return s;
    }


    public int getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
