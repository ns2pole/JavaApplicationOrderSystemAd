package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("利用卓:" + TableManager.getUsingTableNumbers());

        //お客さんが座ったら座席登録
        TableManager.take(2,3);
        TableManager.take(3,2);
        TableManager.take(4,1);
        System.out.println("利用卓:" + TableManager.getUsingTableNumbers());

        //注文の生成と利用卓の登録
        Order order1 = new Order(1, List.of(1,2,2,3),3, 2, 1);
        Order order2 = new Order(2, List.of(1,1),2, 3, 2);
        Order order3 = new Order(3, List.of(1),1, 4, 2);

        //支払い処理
        StatusManager.pay(order2);
        //退席処理
        TableManager.reset(order2.tableNum);
        System.out.println("利用卓:" + TableManager.getUsingTableNumbers());

        //伝票表示
        System.out.println();
        System.out.println(order1);
        System.out.println();
        System.out.println(order2);
        System.out.println();
        System.out.println(order3);

    }
}