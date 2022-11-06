package com.live.system.controller;

import com.live.common.security.utils.SecurityUtils;
import org.junit.jupiter.api.*;




class TestControllerTest {

    @BeforeEach
    void setUp() {
        System.out.printf("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    void test() {
        System.out.println(SecurityUtils.encryptPassword("123456"));
    }
}