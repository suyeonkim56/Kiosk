package com.example.kiosk.LV5;

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

            //카테고리 숫자 입력
            int input = sc.nextInt();

            // 햄버거 선택
            if (input == 1) {
                burgers.printMenus(burgers);
                int choice = sc.nextInt();
                if (choice == 0) {
                    continue;
                } else if (choice <= burgers.getMenus().size() && choice > 0) {
                    burgers.printMenu(burgers, choice - 1);
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
                } else if (choice <= drinks.getMenus().size() && choice > 0) {
                    drinks.printMenu(drinks, choice - 1);
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
                } else if (choice <= desserts.getMenus().size() && choice > 0) {
                    desserts.printMenu(desserts, choice - 1);
                } else {
                    System.out.println("없는 메뉴를 선택하셨습니다. 다시 선택해주세요.");
                }
            }
            //0 입력
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
