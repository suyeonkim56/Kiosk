package com.example.kiosk.LV4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menus;

    // 생성자
    public Menu(List<MenuItem> menuItems)
    {
        this.menus = menuItems;
    }

    public List<MenuItem> getmenus() {
        return menus;
    }

    public void setmenus(List<MenuItem> menus) {
        this.menus = menus;
    }




}
