package org.example;

public abstract class Menu {
    int id;
    int price;
    String name;
    Category category;

    Menu(int id, int price, String name, Category category) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
    }

}
