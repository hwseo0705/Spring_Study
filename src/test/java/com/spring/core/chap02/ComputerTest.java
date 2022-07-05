package com.spring.core.chap02;

import com.spring.core.chap02.computer.*;
import com.spring.core.chap02.config.ComputerConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class ComputerTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ComputerConfig.class);

    @Test
    @DisplayName("설정파일에 등록한 Computer 빈을 가져와야 한다.")
    void findBeanTest() {

        Computer computer = ac.getBean(Computer.class);
        computer.showSpec();

    }


    @Test
    @DisplayName("등록된 빈의 타입으로 빈을 가져와야 한다.")
    void findBeanByType() {

        Keyboard keyboard = ac.getBean(Keyboard.class);
        keyboard.info();

        assertInstanceOf(SamsungKeyboard.class, keyboard);
    }

    @Test
    @DisplayName("등록된 빈의 이름으로 빈을 가져와야 한다.")
    void findBeanByName() { // 이름만으로 가져오는거는 잘 안씀

        Monitor monitor = (Monitor) ac.getBean("monitor");
        assertInstanceOf(SamsungMonitor.class, monitor);
    }

    @Test
    @DisplayName("컨테이너에서 조회한 빈은 단 하나의 객체여야 한다.")
    void singleton() { // create shared instance even though new was called multiple times, singleton bean
        Monitor m1 = ac.getBean(Monitor.class);
        Monitor m2 = ac.getBean(Monitor.class);
        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);

        assertEquals(m1, m2);
    }
}
