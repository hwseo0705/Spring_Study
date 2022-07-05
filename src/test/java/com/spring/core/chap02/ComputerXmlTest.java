package com.spring.core.chap02;

import com.spring.core.chap02.computer.Computer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ComputerXmlTest {

    GenericXmlApplicationContext ac = new GenericXmlApplicationContext("ComputerConfig.xml");

    @Test
    @DisplayName("xml 설정파일에 등록된 빈들을 조회해야 한다.")
    void findBean() {
        Computer computer = ac.getBean(Computer.class);
        computer.showSpec();
    }
}
