package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;

import static java.util.Arrays.*;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class Application {

    @Bean
    public CacheManager cacheManager() {
        SimpleCacheManager cm = new SimpleCacheManager();
        cm.setCaches(Arrays.asList(
                new ConcurrentMapCache("books")
               ));
        return cm;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
