package com.example.kiosk.LV6;

import java.util.List;

public class Menu {
    private List<MenuItem> menus;
    private String category;

    // 생성자
    public Menu(List<MenuItem> menuItems, String category) {
        this.menus = menuItems;
        this.category = category;
    }

    //getter and setter
    public List<MenuItem> getMenus() {
        return menus;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    //메뉴들 출력
    public void printMenus(Menu menu) {
        System.out.println("[ " + menu.getCategory() + " MENU ]");
        int i = 1;
        for (MenuItem menuItem : menus) {
            System.out.println(i++ + ". " + menuItem.getName());
        }
        System.out.println("0. 뒤로가기      | 뒤로가기");
    }

    //선택한 메뉴 출력
    public void printMenu(Menu menu, int index) {
        System.out.println("선택한 메뉴: " + menu.getMenus().get(index).getName() + " | W" + menu.getMenus().get(index).getPrice() + " | " + menu.getMenus().get(index).getExplain());
    }
}
