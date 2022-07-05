package com.spring.core.chap02;

public class WesternRestaurant implements Restaurant {

    private Chef chef;
    private Course course;

    @Override
    public void reserve() {
        course.combineMenu();
    }

    public WesternRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    @Override
    public void order() {
        chef.cook();
    }
}
