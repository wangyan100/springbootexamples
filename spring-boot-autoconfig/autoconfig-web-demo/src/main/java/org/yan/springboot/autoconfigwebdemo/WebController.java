package org.yan.springboot.autoconfigwebdemo;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yw.springboot.yanstarter.GreetingService;
@Controller
public class WebController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        greetingService.getMessage();
        model.put("message", greetingService.getMessage());
        return "index";
    }

}