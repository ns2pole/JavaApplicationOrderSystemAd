package org.example;

import java.util.List;

public class StaffManager {
    public static List<Staff> staffList = List.of(
            new Staff(1,"山田"),
            new Staff(2,"中津")
    );

    public static Staff getById(int staffId) {
        for(int i = 0; i < staffList.size(); i++) {
            if(staffList.get(i).id == staffId) {
                return staffList.get(i);
            }
        }
        throw new IllegalArgumentException("スタッフが存在しません。");
        // スタッフがいませんのエラーを返す？
    }
}
