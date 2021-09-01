package com.zhuravishkin.springregistrydesignpattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringRegistryDesignPatternApplicationTests {

    @Test
    void contextLoads() {
        SpringRegistryDesignPatternApplication.main(new String[]{});
        assertTrue(true);
    }

}
