package com.spring.core.chap03.computer;

public class SamsungKeyboard implements Keyboard {
    @Override
    public void info() {
        System.out.println("삼성 키보드입니다.");
    }
}
