package com.mrlonis.springbootdemoafkarena;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SpringBootDemoAFKArenaApplication.class)
@ActiveProfiles("test")
public class SpringBootDemoAFKArenaApplicationTests {

    @Test
    public void contextLoads() {

    }
}
