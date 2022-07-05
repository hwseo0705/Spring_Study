package com.spring.core.chap02.config;

import com.spring.core.chap02.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링 컨테이너에 스프링 빈을 등록하는 설정 파일
@Configuration
public class HotelConfig {

    // 빈등록 장식 - 생성자 주입, 세터 주입
    @Bean
    public Chef chef() {
        return new KimuraChef();
    }

    @Bean(name = "sc")
    public Course sushiCourse() {
        return new SushiCourse();
    }


    @Bean(name = "fc")
    public Course frenchCourse() {
        return new FrenchCourse();
    }


    @Bean(name = "res") // set the name of the bean, if not it's going to be the name of the method
    public Restaurant restaurant() {
        // 생성자 주입 (constructor injection)
        // EasternRestaurant er = new EasternRestaurant(chef(), sushiCourse());

        // 수정자 주입 (setter injection)
        EasternRestaurant er = new EasternRestaurant();
        er.setChef(chef());
        er.setCourse(sushiCourse());
        return er;
    }

    @Bean
    public Hotel hotel() {

        return new Hotel(restaurant(), chef());
    }
}
