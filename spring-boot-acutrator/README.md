

### Spring Boot Actuator 

This article shows you how to use Spring Boot Actuator to monitor your Application

We will use SpringBoot+ElastichSearch as example , which you could find source code at

https://github.com/wangyan100/springbootexamples/tree/master/spring-boot-elasticsearch 

Spring Boot's Actuator provides many production-level features such as monitoring and measuring Spring Boot applications. These features of Actuator are available through numerous REST interfaces, remote shells, and JMX.

#### set up Actuator 

- import dependency  
  ![1](./screenshot/1.png)
  
- config Endpoint
  ![2](./screenshot/2.png)
  
- start elastichsearch and SpringBootApplication, you could use Actuator as below to monitor Application running status as below shown
  ![3](./screenshot/3.png)$$
  
- it shows application info
  ![4](./screenshot/4.png)
    
- it shows elasticsearch status , diskspace and so on. 
  ![5](./screenshot/5.png)


#### implement your own micrometer count

- create handyCounter, when create new handy method is called, handyCounter increases 1
  ![6](./screenshot/6.png)
  
- to using Postmann to call REST API to call create new handy method
  ![7](./screenshot/7.png)
  
- browse actuator prometheus endpoint, you can see handyCounter is 1 now
  ![8](./screenshot/8.png)




