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
 
#### Set up SpringBoot with Redis 
- add dependency, spring-boot-starter-data-redis depends on spring-data-redis and lettuce which is redis client.
it is a scalable, its' Redis Connection could be shared by many threads.
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

- add SpringBoot Redis config
```
# REDIS
# redis database index
spring.redis.database=0  
# redis server address
spring.redis.host=localhost
# redis server port
spring.redis.port=6379  
# redis server password, default is empty
spring.redis.password=
# connection pool max size, default 8
spring.redis.lettuce.pool.max-active=8
# connection pool wait time, -1 means unlimited
spring.redis.lettuce.pool.max-wait=-1
# connection pool idle max connection size, default 8
spring.redis.lettuce.pool.max-idle=8
# connection pool idle min connection size, default is 0
spring.redis.lettuce.pool.min-idle=0

```

- add Cache config
