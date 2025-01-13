package com.example.kiosk.LV2;

public class MenuItem {
    private double price;
    private String name;
    private String explain;

    //생성자
    public MenuItem(double price, String name, String explain){
        this.price =price;
        this.name = name;
        this.explain = explain;
    }

    //getter setter
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

}
