package com.example.kiosk.lv6;

public enum Discount {
    국가유공자(10), 군인(5), 학생(3), 일반(0);

    private final double discountpercent;

    Discount(double discountpercent) {
        this.discountpercent = discountpercent;
    }

    public double getDiscountpercent() {
        return discountpercent;
    }
}
