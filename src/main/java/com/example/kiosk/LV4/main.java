package com.example.kiosk.LV4;


import java.util.List;

public class main {
    public static void main(String[] args) {
        MenuItem menu1 = new MenuItem(6.9,"ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menu2 = new MenuItem(8.9,"SmokeShack","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menu3= new MenuItem(6.9,"Cheeseburger","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menu4 = new MenuItem(5.4,"Hamburger","비프패티를 기반으로 야채가 들어간 기본버거");

        List<MenuItem> menuItems = List.of(menu1, menu2, menu3, menu4);

        Kiosk Kiosk = new Kiosk(menuItems);
        Kiosk.start();
    }
}
