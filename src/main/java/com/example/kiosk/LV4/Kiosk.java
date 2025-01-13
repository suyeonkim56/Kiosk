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
            //상위 카테고리 출력
            System.out.println("[MAIN MENU]");
            System.out.println("1. " + burgers.getCategory());
            System.out.println("2. " + drinks.getCategory());
            System.out.println("3. " + desserts.getCategory());
            System.out.println("0. 종료      | 종료");

            //숫자 입력
            int input = sc.nextInt();


            // 햄버거 선택
            if (input == 1) {
                burgers.printMenus(burgers);
                int choice = sc.nextInt();
                if (choice == 0) {
                    continue;
                } else if (choice <= burgers.getmenus().size() && choice > 0) {
                    System.out.println("선택한 메뉴: " + burgers.getmenus().get(choice - 1).getName() + " | W" + burgers.getmenus().get(choice - 1).getPrice() + " | " + burgers.getmenus().get(choice - 1).getExplain());
                } else {
                    System.out.println("없는 메뉴를 선택하셨습니다. 다시 선택해주세요.");
                }
            }
            // 음료수 선택
            else if (input == 2) {
                drinks.printMenus(drinks);
                int choice = sc.nextInt();
                if (choice == 0) {
                    continue;
                } else if (choice <= drinks.getmenus().size() && choice > 0) {
                    System.out.println("선택한 메뉴: " + drinks.getmenus().get(choice - 1).getName() + " | W" + drinks.getmenus().get(choice - 1).getPrice() + " | " + drinks.getmenus().get(choice - 1).getExplain());
                } else {
                    System.out.println("없는 메뉴를 선택하셨습니다. 다시 선택해주세요.");
                }
            }
            //디저트 입력
            else if (input == 3) {
                desserts.printMenus(desserts);
                int choice = sc.nextInt();
                if (choice == 0) {
                    continue;
                } else if (choice <= desserts.getmenus().size() && choice > 0) {
                    System.out.println("선택한 메뉴: " + desserts.getmenus().get(choice - 1).getName() + " | W" + desserts.getmenus().get(choice - 1).getPrice() + " | " + desserts.getmenus().get(choice - 1).getExplain());
                } else {
                    System.out.println("없는 메뉴를 선택하셨습니다. 다시 선택해주세요.");
                }
            }
            // 0 입력
            else if (input == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            //잘못된 숫자 입력
            else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            }
        }
    }
}
