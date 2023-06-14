package org.example;

public abstract class Menu {
    int price;
    String name;

    Category category;

    Menu(int price, String name, Category category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }
}
