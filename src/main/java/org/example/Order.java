package org.example;

import java.util.List;

//伝票の情報全てを表すクラス
public class Order {
    List<Menu> menuList;
    int tableNum;

    Status status = null;

    Staff staff;

    Order(List<Menu> menuList, int tableNum, Staff staff) {
        this.menuList = menuList;
        this.tableNum = tableNum;
        this.staff = staff;
    }

    public int getTotalAmount() {
        int amount = 0;
        for(int i = 0; i < menuList.size(); i++) {
            amount = amount + menuList.get(i).price;
        }
        return amount;
    }
}
