package com.example.kiosk.LV5;

import java.util.List;

public class Menu {
    private List<MenuItem> menus;
    private String category;

    // 생성자
    public Menu(List<MenuItem> menuItems, String category)
    {
        this.menus = menuItems;
        this.category = category;
    }

    public List<MenuItem> getmenus() {
        return menus;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void printMenus(Menu menu){
        System.out.println("[ " + menu.getCategory()+" MENU ]");
        int i=1;
        for (MenuItem menuItem : menus) {
            System.out.println(i++ + ". " + menuItem.getName());
        }
        System.out.println("0. 뒤로가기      | 뒤로가기");
    }
}
