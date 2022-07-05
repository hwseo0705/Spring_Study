package com.spring.core.chap03.config;

import com.spring.core.chap03.Chef;
import com.spring.core.chap03.Hotel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelAutoConfigTest {

    @Test
    @DisplayName("Component Annotation이 붙은 빈들이 등록되어야 한다.")
    void checkBeans() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(HotelAutoConfig.class);
        Hotel hotel = ac.getBean(Hotel.class);
        hotel.inform();
    }

    @Test
    @DisplayName("중복 빈이 등록되면 자동주입에 실패해야 한다.")
    void checkDuplicateBeans() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(HotelAutoConfig.class);
        Hotel hotel = ac.getBean(Hotel.class);
        hotel.inform();
    }
}