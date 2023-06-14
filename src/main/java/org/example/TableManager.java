package org.example;

import static org.example.Status.ISPAID;
import static org.example.Status.WAITING_FOR_SERVING;

public class TableManager {

    //手持ちのハンディの「座席と人数」登録ボタンを押したら以下が動く
    public static void take(int tableNum, int guestNum) {
        Shop.tables.get(tableNum).isUsing = true;
        Shop.tables.get(tableNum).guestNum = guestNum;
    }

    //手持ちのハンディの「座席と人数」登録ボタンを押したら以下が動く
    public static void reset(int tableNum) {
        Shop.tables.get(tableNum).isUsing = false;
        Shop.tables.get(tableNum).guestNum = 0;
    }



}
