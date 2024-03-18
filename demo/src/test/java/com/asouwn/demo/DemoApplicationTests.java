package com.asouwn.demo;

import com.asouwn.demo.common.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    User u;

    @Test
    void contextLoads() {

        System.out.println( u);
    }

}
