package org.yw.springboot.autoconfig.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.yw.springboot.yanstarter.GreetingService;

@Component
public class DemoRunner implements ApplicationRunner {

    @Autowired
    private GreetingService greetingService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("greetingService greeting to " + greetingService.getMessage());
    }
}