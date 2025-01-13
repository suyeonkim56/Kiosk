package com.example.kiosk.LV6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basket {
    List<MenuItem> basket = new ArrayList<>();

    //생성자
    public void setBasket(List<MenuItem> basket) {
        this.basket = basket;
    }

    //getter
    public List<MenuItem> getBasket() {
        return basket;
    }

    //장바구니에 추가
    public void addItem(MenuItem item){
        Scanner sc = new Scanner(System.in);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        int answer = sc.nextInt();
        if(answer == 1)
        {
            basket.add(item);
            System.out.println(item.getName()+" 이 장바구니에 추가되었습니다.");
        } else if (answer == 2) {
        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        }
    }

    //장바구니 초기화
    public void resetItem(){
        basket.clear();
    }

    //장바구니 계산
    public void calItem(){
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (MenuItem menuItem : basket) {
            sum += menuItem.getPrice();
        }

        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        System.out.println("[ Orders ]");
        for (MenuItem menuItem : basket) {
            System.out.println("선택한 메뉴: " + menuItem.getName() + " | W" + menuItem.getPrice() + " | " + menuItem.getExplain());
        }
        System.out.println("[ Total ]");
        System.out.println("W" + sum);
        System.out.println("1. 주문      2. 메뉴판");


        int accept = sc.nextInt();
        if(accept == 1)
        {
            System.out.println("주문이 완료되었습니다. 금액은 W " +sum + "입니다.");
        } else if (accept == 2) {

        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요");
        }
    }
}