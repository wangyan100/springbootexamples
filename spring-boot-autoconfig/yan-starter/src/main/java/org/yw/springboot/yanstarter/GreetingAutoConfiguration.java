package org.yw.springboot.yanstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //enanble configuration
@EnableConfigurationProperties(GreetingProperties.class)//map configuration property on class
@ConditionalOnClass(GreetingService.class)
@ConditionalOnProperty//according to condition to initialize autoconfiguration class
        (
                name = "greeting.enabled",
                havingValue = "true",
                matchIfMissing = true//missing check
        )
public class GreetingAutoConfiguration {

    //application.properties  mapped on GreetingPropertiesProperties
    @Autowired
    private GreetingProperties greetingProperties;


    @Bean//create instance of GreetingService
    @ConditionalOnMissingBean(GreetingService.class)//If instance does not exist, it will be initialized and added into SpringContext
    public GreetingService greetingService()
    {
        System.out.println(">>>The GreetingService Not Found，Execute Create New Bean.");
        GreetingService greetingService = new GreetingService();


        greetingService.setDisplay(greetingProperties.isDisplay()); //set isDisplay according property

        if(greetingService.isDisplay()){
            greetingService.setMessage(greetingProperties.getMessage());//set message from property
        }else{
            greetingService.setMessage("display is false, hidden greeting message  ");//set message from property
        }
        return greetingService;
    }
}
