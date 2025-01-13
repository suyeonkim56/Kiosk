package com.example.kiosk.LV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuItem menu1 = new MenuItem(6.9,"ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menu2 = new MenuItem(8.9,"SmokeShack","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menu3= new MenuItem(6.9,"Cheeseburger","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menu4 = new MenuItem(5.4,"Hamburger","비프패티를 기반으로 야채가 들어간 기본버거");

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(menu1);
        menuItems.add(menu2);
        menuItems.add(menu3);
        menuItems.add(menu4);

        Scanner sc = new Scanner(System.in);

        int input;
        int i=1;
        System.out.println("[ SHAKESHACK MENU ]");
        for (MenuItem menuItem : menuItems) {
            System.out.println(i++ + ". " + menuItem.getName() + "  | W" + menuItem.getPrice() + " | "+menuItem.getExplain());
        }
        System.out.println("0. 종료      | 종료");
        input = sc.nextInt();

        if (input == 1) {
            MenuItem temp = menu1;
            System.out.println("1. " + temp.getName() + "   | W "+temp.getPrice()+" | "+temp.getExplain());
        } else if (input == 2) {
            MenuItem temp = menu2;
            System.out.println("2. " + temp.getName() + "   | W "+temp.getPrice()+" | "+temp.getExplain());
        } else if (input == 3) {
            MenuItem temp = menu3;
            System.out.println("3. " + temp.getName() + "   | W "+temp.getPrice()+" | "+temp.getExplain());
        } else if (input == 4) {
            MenuItem temp = menu4;
            System.out.println("4" + temp.getName() + "   | W "+temp.getPrice()+" | "+temp.getExplain());
        } else if (input == 0) {
            System.out.println("프로그램이 종료되었습니다.");
        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요");
        }
    }
}
