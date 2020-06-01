package org.yan.springbootredisdemo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;
import org.yan.springbootredisdemo.model.User;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootRedisDemoApplicationTests {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void testForStringValue() throws Exception {
		stringRedisTemplate.opsForValue().set("key111", "value111");
		Assert.assertEquals("value111", stringRedisTemplate.opsForValue().get("key111"));
	}

	@Test
	public void testForObjValue() throws Exception {
		User user=new User("user1@email.com", "nicknameaaa", "aapassword", "useraaa","2020-05-30");
		ValueOperations<String, User> operations=redisTemplate.opsForValue();
		//save user with key useraaa
		operations.set("useraaa", user);
		//save user with key useraaa_x with timeout
		operations.set("useraaa_x", user,1, TimeUnit.SECONDS);

		// sleep time is longer than timeout
		Thread.sleep(2000);

		//key without timeout still exists
		if(redisTemplate.hasKey("useraaa")){
			System.out.println("key useraaa exists");
		}
        // key with timeout does not exist anymore
		if(redisTemplate.hasKey("useraaa_x")){
			System.out.println("key useraaa_x exists");
		}
		//fetch user based on key
		Assert.assertEquals("useraaa", operations.get("useraaa").getUserName());
	}
}
