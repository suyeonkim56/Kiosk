package com.example.kiosk.LV6;


import java.util.List;

public class main {
    public static void main(String[] args) {
        //햄버거 메뉴
        MenuItem menu1 = new MenuItem(6.9, "ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menu2 = new MenuItem(8.9, "SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menu3 = new MenuItem(6.9, "Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menu4 = new MenuItem(5.4, "Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거");

        //음료수 메뉴
        MenuItem menu5 = new MenuItem(3.0, "Cola", "펩시입니다.");
        MenuItem menu6 = new MenuItem(3.0, "Soda", "칠성사이다입니다.");

        //디저트 메뉴
        MenuItem menu7 = new MenuItem(3.0, "Cookie", "달콤한 쿠키입니다.");
        MenuItem menu8 = new MenuItem(2.5, "French Fries", "짭쪼름한 감자튀김입니다.");

        //메뉴 이름들 모음
        List<String> categories = List.of("BURGERS", "DRINKS", "DESSERTS");

        //Menu 객체 생성
        List<MenuItem> burgers = List.of(menu1, menu2, menu3, menu4);
        List<MenuItem> drinks = List.of(menu5, menu6);
        List<MenuItem> dessert = List.of(menu7, menu8);
        Menu Burgers = new Menu(burgers, "BURGERS");
        Menu Drinks = new Menu(drinks, "DRINKS");
        Menu Desserts = new Menu(dessert, "DESSERTS");

        //Kiosk 객체 생성
        Kiosk Kiosk = new Kiosk(Burgers, Drinks, Desserts);

        //작동 시작
        Kiosk.start();
    }
}
