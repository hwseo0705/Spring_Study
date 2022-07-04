package com.spring.core.chap01_1;

public class Hotel {

    private Restaurant restaurant;
    private Chef headChef;

    public Hotel() {
        this.restaurant = new EasternRestaurant();
        this.headChef = new KimChef();
    }

    public void inform() {
        System.out.printf("우리 호텔의 레스토랑은 %s이며, 헤드쉐프는 %s입니다.\n"
                , restaurant.getClass().getSimpleName(), headChef.getClass().getSimpleName());
        restaurant.reserve();
    }
}
