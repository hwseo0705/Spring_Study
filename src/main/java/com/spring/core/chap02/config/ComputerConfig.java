package com.spring.core.chap02.config;

import com.spring.core.chap02.computer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfig {

    @Bean
    public Keyboard keyboard() {
        return new SamsungKeyboard();
    }

    @Bean
    public Monitor monitor() {
        return new SamsungMonitor();
    }

    @Bean
    public Mouse mouse() {
        return new LogitecMouse();
    }

    @Bean
    public Computer computer() {
        return new Computer(keyboard(), mouse(), monitor());
    }

}
