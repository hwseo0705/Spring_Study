package com.spring.core.chap01_2;

import com.spring.core.chap01_2.config.HotelManager;
import org.junit.jupiter.api.Test;

public class HotelTest {

    @Test
    void objectTest() {
        HotelManager hm = new HotelManager();
        Hotel hotel = hm.hotel();
        hotel.inform();
    }
}
