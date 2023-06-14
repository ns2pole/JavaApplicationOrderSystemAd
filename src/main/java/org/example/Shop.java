package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    static List<Table> tables;

    public static int[] getUsingTableNumbers() {
        List<Integer> usingTableNumbers = new ArrayList<Integer>();
        for (int i = 0; i < tables.size(); i++) {
            if (tables.get(i).isUsing) {
                usingTableNumbers.add(tables.get(i).number);
            }
        }
        return usingTableNumbers.stream().mapToInt(Integer::intValue).toArray();
    }

}
