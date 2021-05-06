package com.mrlonis.springbootdemoafkarena;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoAFKArenaApplication.class)
@ActiveProfiles("test")
public class SpringBootDemoAFKArenaApplicationTests {

    @Test
    public void contextLoads() {

    }
}
