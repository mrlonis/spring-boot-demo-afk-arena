package com.mrlonis.springdataoperations;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDataOperationsApplication.class)
@ActiveProfiles("test")
public class SpringDataOperationsApplicationTests {

    @Test
    public void contextLoads() {

    }
}
