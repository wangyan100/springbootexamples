package org.yw.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class OrderRunner1 implements ApplicationRunner {



    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("The OrderRunner1 is starting to initialize resource 1 ......");
    }
}