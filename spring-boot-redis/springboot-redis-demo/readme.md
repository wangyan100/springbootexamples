## SpringBoot with Redis Demo

Through this demo, I will show you how to integrate SpringBoot with Redis and how to use redis in Spring
Application for store data in Redis cache and how to use Redis for SpringBoot Web application's session managment
 
 
#### Set up Redis 
- run redis locally via docker 
```
docker run -d  --name redisHostPort -p 6379:6379 redis:latest
```

- access redis docker container

```
docker exec -it f67eac82c1f0 /bin/bash
```

- check redis 
```
redis-cli 
ping
```

- if you see as below screenshot, your redis is ready to use ...

 ![image](readme.assets/1.png)
 
- add dependency 
```

               <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-redis</artifactId>
		</dependency>
		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-pool2</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.session</groupId>
			<artifactId>spring-session-data-redis</artifactId>
		</dependency>

```