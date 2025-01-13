package com.example.kiosk.LV4;

import java.util.ArrayList;
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

    public void setmenus(List<MenuItem> menus) {
        this.menus = menus;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
