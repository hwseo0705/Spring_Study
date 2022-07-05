package com.spring.core.chap03;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Setter @Getter
@Component
public class EasternRestaurant implements Restaurant {

    private Chef chef;
    private Course course;

    /*@Autowired // 생성자 자동 주입 명시
    public EasternRestaurant(@Qualifier("kc") Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }*/

    public EasternRestaurant(Chef chef, Course course) {
        System.out.println("\n\n\n");
        System.out.println("Eastern 생성자 호출!");
        System.out.println("\n\n\n");
        this.chef = chef;
        this.course = course;
    }

    @Override
    public void reserve() {
        course.combineMenu();
    }

    @Override
    public void order() {
        chef.cook();
    }

    @Autowired // 수정자 주입
    @Qualifier("kc")
    public void setChef(Chef chef) {
        System.out.println("\n\n\n");
        System.out.println("Eastern setChef 호출!");
        System.out.println("\n\n\n");
        this.chef = chef;
    }

    @Autowired
    public void setCourse(Course course) {
        System.out.println("\n\n\n");
        System.out.println("Eastern setCourse 호출!");
        System.out.println("\n\n\n");
        this.course = course;
    }
}
