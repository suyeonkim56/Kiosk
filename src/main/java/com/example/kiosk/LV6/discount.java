package com.example.kiosk.LV6;

public enum discount {
    국가유공자(10), 군인(5), 학생(3), 일반(0);

    private final double discountpercent;

    discount(double discountpercent) {
        this.discountpercent = discountpercent;
    }

    public double getDiscountpercent() {
        return discountpercent;
    }
}
