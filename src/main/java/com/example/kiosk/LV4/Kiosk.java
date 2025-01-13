package com.example.kiosk.LV4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private Menu burgers;
    private Menu drinks;
    private Menu desserts;

    public Kiosk(Menu burgers, Menu drinks, Menu desserts) {
        this.burgers = burgers;
        this.drinks = drinks;
        this.desserts = desserts;
    }


    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[MAIN MENU]");
            System.out.println("1. " + burgers.getCategory());
            System.out.println("2. " + drinks.getCategory());
            System.out.println("3. " + desserts.getCategory());
            System.out.println("0. 종료      | 종료");
            int input = sc.nextInt();
            // 햄버거 선택
            if (input == 1) {
                System.out.println("[ " + burgers.getCategory() + " MENU ]");
                for (int i = 0; i < burgers.getmenus().size(); i++) {
                    System.out.println((i + 1) + ". " + burgers.getmenus().get(i).getName());
                }
                System.out.println("0. 뒤로가기      | 뒤로가기");
                input = sc.nextInt();
                if (input == 0) {
                    continue;
                } else if (input < burgers.getmenus().size() && input > 0) {
                    System.out.println("선택한 메뉴: " + burgers.getmenus().get(input - 1).getName().toString() + " | W" + burgers.getmenus().get(input - 1).getPrice() + " | " + burgers.getmenus().get(input - 1).getExplain());
                } else {
                    System.out.println("없는 메뉴를 선택하셨습니다. 다시 선택해주세요.");
                }
            } else if (input == 2) { // 음료수 선택
                System.out.println("[ " + drinks.getCategory() + " MENU ]");
                for (int i = 0; i < drinks.getmenus().size(); i++) {
                    System.out.println((i + 1) + ". " + drinks.getmenus().get(i).getName());
                }
                System.out.println("0. 뒤로가기      | 뒤로가기");
                input = sc.nextInt();
                if (input == 0) {
                    continue;
                } else if (input < drinks.getmenus().size() && input > 0) {
                    System.out.println("선택한 메뉴: " + drinks.getmenus().get(input - 1).getName() + " | W" + drinks.getmenus().get(input - 1).getPrice() + " | " + drinks.getmenus().get(input - 1).getExplain());
                } else {
                    System.out.println("없는 메뉴를 선택하셨습니다. 다시 선택해주세요.");
                }
            } else if (input == 3) {
                System.out.println("[ " + desserts.getCategory() + " MENU ]");
                for (int i = 0; i < desserts.getmenus().size(); i++) {
                    System.out.println((i + 1) + ". " + desserts.getmenus().get(i).getName());
                }
                System.out.println("0. 뒤로가기      | 뒤로가기");
                input = sc.nextInt();
                if (input == 0) {
                    continue;
                } else if (input < desserts.getmenus().size() && input > 0) {
                    System.out.println("선택한 메뉴: " + desserts.getmenus().get(input - 1).getName() + " | W" + desserts.getmenus().get(input - 1).getPrice() + " | " + desserts.getmenus().get(input - 1).getExplain());
                } else {
                    System.out.println("없는 메뉴를 선택하셨습니다. 다시 선택해주세요.");
                }
            } else if (input == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            }
        }
    }
}
