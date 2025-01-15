package com.example.kiosk.lv6;

public class MenuItem {
    private double price;
    private String name;
    private String explain;

    //생성자
    public MenuItem(double price, String name, String explain) {
        this.price = price;
        this.name = name;
        this.explain = explain;
    }

    //getter setter
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getExplain() {
        return explain;
    }

}

