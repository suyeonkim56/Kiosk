package com.example.kiosk.lv6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Basket {
    private List<MenuItem> basket = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    //생성자
    public void setBasket(List<MenuItem> basket) {
        this.basket = basket;
    }

    //getter
    public List<MenuItem> getBasket() {
        return basket;
    }

    //장바구니에 추가
    public void addItem(MenuItem item) {
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        int answer = sc.nextInt();
        if (answer == 1) {
            basket.add(item);
            System.out.println(item.getName() + " 이 장바구니에 추가되었습니다.");
        } else if (answer == 2) {
            System.out.println("메뉴판으로 돌아갑니다.");
        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        }
    }

    //장바구니에서 삭제
    public void removeItem(MenuItem item)
    {
        System.out.println("위 메뉴를 장바구니에 삭제하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        int answer = sc.nextInt();
        if (answer == 1) {
            basket.removeIf(menuItem -> menuItem.getName().equals(item.getName()));
            System.out.println(item.getName() + " 이 장바구니에 삭제되었습니다.");
        } else if (answer == 2) {
            System.out.println("메뉴판으로 돌아갑니다.");
        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        }
    }
    //장바구니 초기화
    public void resetItem() {
        basket.clear();
    }

    //장바구니 계산
    public double calItem() {
        double sum = 0;
        AtomicInteger i = new AtomicInteger(1);
        for (MenuItem menuItem : basket) {
            sum += menuItem.getPrice();
        }

        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        System.out.println("[ Orders ]");
        basket.forEach(item -> System.out.println("선택한 메뉴: " + item.getName() + " | W" + item.getPrice() + " | " + item.getExplain()));
        System.out.println("[ Total ]");
        System.out.println("W " + sum);
        System.out.println("1. 주문      2. 메뉴판");
        return sum;
    }

    //할인 계산
    public void calculation(int discountNumber, double sum) {
        if (discountNumber == 1) {
            double finalSum = sum - (Discount.국가유공자.getDiscountpercent() * sum / 100);
            System.out.println("주문이 완료되었습니다. 금액은 W " + String.format("%.1f", finalSum) + " 입니다.");
        } else if (discountNumber == 2) {
            double finalSum = sum - (Discount.군인.getDiscountpercent() * sum / 100);
            System.out.println("주문이 완료되었습니다. 금액은 W " + String.format("%.1f", finalSum) + " 입니다.");
        } else if (discountNumber == 3) {
            double finalSum = sum - (Discount.학생.getDiscountpercent() * sum / 100);
            System.out.println("주문이 완료되었습니다. 금액은 W " + String.format("%.1f", finalSum) + " 입니다.");
        } else if (discountNumber == 4) {
            double finalSum = sum - (Discount.일반.getDiscountpercent() * sum / 100);
            System.out.println("주문이 완료되었습니다. 금액은 W " + String.format("%.1f", finalSum) + " 입니다.");
        }
    }
}
