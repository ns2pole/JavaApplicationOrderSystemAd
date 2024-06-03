package org.example;

import java.util.Date;
import java.util.List;

//伝票の情報全てを表すクラス
public class Order {
    int orderId;
    List<Integer> menuIds;
    int guestNum;
    int tableNum;

    Status status = null;

    int staffId;

    Date date;

    Order(int orderId, List<Integer> menuIds, int guestNum, int tableNum, int staffId) {
        this.orderId = orderId;
        this.menuIds = menuIds;
        this.guestNum = guestNum;
        this.tableNum = tableNum;
        this.staffId = staffId;
        this.date = new Date();
    }

    public void add(int menuId) {
        this.menuIds.add(menuId);
    }



    public int getTotalAmount() {
        int amount = 0;

        for(int i = 0; i < menuIds.size(); i++) {
            amount = amount + MenuManager.getMenuById(menuIds.get(i)).price;
        }
        return amount;
    }

    @Override
    public String toString() {
        String str = "";
        str = str + "伝票番号:" + this.orderId + "\n";
        str = str + "スタッフ:" + StaffManager.getById(this.staffId).name + "\n";
        str = str + "時刻:" + this.date + "\n";
        str = str + "注文メニュー:" + "\n";
        for(int i = 0; i < this.menuIds.size(); i++) {
            str = str + MenuManager.getMenuById(this.menuIds.get(i)).name + "\n";
        }
        str = str + "卓番:" + this.tableNum + "\n";
        str = str + "人数:" + this.guestNum + "\n";
        str = str + "合計金額:" + this.getTotalAmount();
        return str;
    }
}
