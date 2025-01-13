package com.example.kiosk.LV3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems = new ArrayList<>();

    public Kiosk(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int input;
            int i=1;
            System.out.println("[ SHAKESHACK MENU ]");
            for (MenuItem menuItem : menuItems) {
                System.out.println(i++ + ". " + menuItem.getName() + "  | W" + menuItem.getPrice() + " | "+menuItem.getExplain());
            }
            System.out.println("0. 종료      | 종료");
            input = sc.nextInt();
            if (input == 1) {
                MenuItem temp = getMenuItems().get(input-1);
                System.out.println("1. " + temp.getName() + "   | W "+temp.getPrice()+" | "+temp.getExplain());
            } else if (input == 2) {
                MenuItem temp = getMenuItems().get(input-1);
                System.out.println("2. " + temp.getName() + "   | W "+temp.getPrice()+" | "+temp.getExplain());
            } else if (input == 3) {
                MenuItem temp = getMenuItems().get(input-1);
                System.out.println("3. " + temp.getName() + "   | W "+temp.getPrice()+" | "+temp.getExplain());
            } else if (input == 4) {
                MenuItem temp = getMenuItems().get(input-1);
                System.out.println("4." + temp.getName() + "   | W "+temp.getPrice()+" | "+temp.getExplain());
            } else if (input == 0) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            }
        }
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItems(MenuItem addItem) {
        menuItems.add(addItem);
    }
}
