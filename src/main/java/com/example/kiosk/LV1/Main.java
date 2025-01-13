package com.example.kiosk.LV1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner 선언
        Scanner sc = new Scanner(System.in);
        //Scanner로 받을 int 선언
        int input;
        // 기본 문구 출력
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료      | 종료");

        //숫자 받기
        input = sc.nextInt();

        //받은 숫자에 따른 문구 출력 or 프로그램 종료
        if (input == 1) {
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        } else if (input == 2) {
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        } else if (input == 3) {
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        } else if (input == 4) {
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        } else if (input == 0) {
            System.out.println("프로그램이 종료되었습니다.");
        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요");
        }
    }
}