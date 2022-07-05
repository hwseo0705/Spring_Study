package com.spring.core.chap03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 자동 빈 등록
@Component
public class Hotel {

    private final Restaurant restaurant;
    private final Chef headChef;

    // 생성자 주입 사용시 생성자가 딱 한개면 @Autowired 없이도 자동으로 생성자 주입을 수행
    @Autowired // 자동 의존성 주입
    public Hotel(@Qualifier("easternRestaurant") Restaurant restaurant, @Qualifier("kc") Chef headChef) {
        System.out.println("\n\n\n");
        System.out.println("Hotel 생성자 호출!");
        System.out.println("\n\n\n");
        this.restaurant = restaurant;
        this.headChef = headChef;
    }

    public void inform() {
        System.out.printf("우리 호텔의 레스토랑은 %s이며, 헤드쉐프는 %s입니다.\n"
                , restaurant.getClass().getSimpleName(), headChef.getClass().getSimpleName());
        restaurant.reserve();
    }
}
