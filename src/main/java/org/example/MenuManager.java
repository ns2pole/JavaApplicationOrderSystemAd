package org.example;

import java.util.List;

public abstract class MenuManager {
    List<Menu> allMenu = List.of(new Coffee(), new CafeAuLait(), new Anpan());

    public static Menu getById() {

    }
}
