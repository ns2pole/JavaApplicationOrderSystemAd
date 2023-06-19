package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //メニューを生成
        List<Menu> menuList1 = List.of(new CafeAuLait(), new Coffee(), new Anpan());
        List<Menu> menuList2 = List.of(new CafeAuLait(), new Coffee());
        List<Menu> menuList3 = List.of(new Coffee());


        //お客さんが座ったら座席登録
        TableManager.take(2,2);
        TableManager.take(3,2);
        TableManager.take(4,2);

        //注文の生成と利用卓の登録
        Order order1 = new Order(menuList1, 2, StaffManager.getById(1));
        OrderManager.orderList.add(order1);
        Order order2 = new Order(menuList2, 3, StaffManager.getById(2));
        OrderManager.orderList.add(order2);
        Order order3 = new Order(menuList3, 4, StaffManager.getById(2));
        OrderManager.orderList.add(order3);


        //支払い処理
        StatusManager.pay(order2);
        //退席処理
        TableManager.reset(order2.tableNum);

        //金額計算
        System.out.println(order1.getTotalAmount());
        System.out.println(order2.getTotalAmount());

        System.out.println(Arrays.toString(TableManager.getUsingTableNumbers()));
    }
}