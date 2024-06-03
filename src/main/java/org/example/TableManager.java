package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.Status.ISPAID;
import static org.example.Status.WAITING_FOR_SERVING;

public class TableManager {
    static List<Table> tables = List.of(
            new Table(0),
                new Table(1),
                new Table(2),
                new Table(3),
                new Table(4)
        );
    ;


    //手持ちのハンディの「座席と人数」登録ボタンを押したら以下が動く
    public static void take(int tableNum, int guestNum) {
        tables.get(tableNum).isUsing = true;
        tables.get(tableNum).guestNum = guestNum;
    }

    //手持ちのハンディの「座席と人数」登録ボタンを押したら以下が動く
    public static void reset(int tableNum) {
        tables.get(tableNum).isUsing = false;
        tables.get(tableNum).guestNum = 0;
    }

    public static List<Integer> getUsingTableNumbers() {
        List<Integer> usingTableNumbers = new ArrayList<Integer>();
        for (int i = 0; i < tables.size(); i++) {
            if (tables.get(i).isUsing) {
                usingTableNumbers.add(tables.get(i).number);
            }
        }
        return usingTableNumbers;
    }

}
