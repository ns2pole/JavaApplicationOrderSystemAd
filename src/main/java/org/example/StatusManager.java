package org.example;
import static org.example.Status.*;

public class StatusManager {

    //レジの会計ボタンを押したら以下が動く
    public static void pay(Order o) {
        o.status = ISPAID;
    }

    //手持ちのハンディのオーダー送信ボタンを押したら以下が動く
    public static void orderSend(Order o) {
        o.status = WAITING_FOR_SERVING;
    }

    //手持ちのハンディの「座席と人数」登録ボタンを押したら以下が動く
    public static void takeSeat(int tableNum, int guestNum) {
        TableManager.tables.get(tableNum).isUsing = true;
        TableManager.tables.get(tableNum).guestNum = guestNum;
    }

}
