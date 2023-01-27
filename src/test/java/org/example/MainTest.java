package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MainTest {

    @Test
    @Order(1)
    void a2() {
        System.out.println("2");
    }

    @Test
    @Order(2)
    void a1() {
        System.out.println("1");
    }

    @Test
    @Order(3)
    void a3() {
        System.out.println("3");
    }
}