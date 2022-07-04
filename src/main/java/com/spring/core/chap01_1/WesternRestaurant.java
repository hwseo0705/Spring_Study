package com.spring.core.chap01_1;

public class WesternRestaurant implements Restaurant {

    private Chef chef;
    private Course course;

    @Override
    public void reserve() {
        course.combineMenu();
    }

    public WesternRestaurant() {
        this.chef = new JuanChef();
        this.course = new FrenchCourse();
    }

    @Override
    public void order() {
        chef.cook();
    }
}
