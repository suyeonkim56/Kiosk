package com.example.kiosk.lv6;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Menu {
    private List<MenuItem> menus;
    private String category;

    // 생성자
    public Menu(List<MenuItem> menuItems, String category) {
        this.menus = menuItems;
        this.category = category;
    }

    //getter
    public List<MenuItem> getMenus() {
        return menus;
    }

    public String getCategory() {
        return category;
    }


    //메뉴들 출력
    public void printMenus(Menu menu) {
        System.out.println("[ " + menu.getCategory() + " MENU ]");
        AtomicInteger i = new AtomicInteger(1);
        menu.menus.forEach(item -> System.out.println(i.getAndIncrement() + ". " + item.getName()));
        System.out.println("0. 뒤로가기      | 뒤로가기");
    }

    //선택한 메뉴 출력
    public void printMenu(Menu menu, int index) {
        System.out.println("선택한 메뉴: " + menu.getMenus().get(index).getName() + " | W" + menu.getMenus().get(index).getPrice() + " | " + menu.getMenus().get(index).getExplain());
    }
}
