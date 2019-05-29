## Getting Started

This Example shows you how to use
ElasticsearchRepository , TransportClient to implement a SpringBoot + Elasticsearch CRUD Application


## Install elasticsearch 6.4.3 

- Download elasticsearch  6.4.3 (for spring2.1.4)
https://www.elastic.co/cn/downloads/elasticsearch

- Install it and run it, after it starts successfully, you could browse it like blow

![screenshot1](./doc/Screenshot1.png)

###  Implement ElasticsearchRepository CRUD 
- Create a SpringBoot Rest Application and set config for ElasticsearchRepository 
 
![screenshot2](./doc/Screenshot2.png)

- Create User as data model 
![screenshot3](./doc/Screenshot3.png)

- Create UserRepository
![screenshot4](./doc/Screenshot4.png)

- Create UserController which autowiring UserRepository to implement CRUD functionality 
![screenshot4.1](./doc/Screenshot4.1.png)
- Test ElasticsearchRepository CRUD functionality via REST (Postman)

    - Add user operation
![screenshot5](./doc/Screenshot5.png)

    - List user operation
![screenshot6](./doc/Screenshot6.png)

    - Delete user operation
![screenshot7](./doc/Screenshot7.png)

### Implement Elasticsearch TransportClient CRUD 

- Set config for TransportClient
![screenshot8](./doc/Screenshot8.png)

- Create Handy as data model 
![screenshot9](./doc/Screenshot9.png)

- Create HandyController which autowiring Client to implement CRUD functionality 
![screenshot10](./doc/Screenshot10.png)

- Test Elasticsearch TransportClient CRUD functionality via REST (Postman)
![screenshot11](./doc/Screenshot11.png)

    - Add Handy operation
![screenshot12](./doc/Screenshot12.png)

    - View Handy operation
![screenshot13](./doc/Screenshot13.png)

    - Delete Handy operation
![screenshot14](./doc/Screenshot14.png)

### Additional Links for reference


- https://cloud.tencent.com/developer/article/1066239 

- https://github.com/RajeshBhojwani/spring-boot-elasticsearch

- https://dzone.com/articles/elasticsearch-with-spring-boot-application

- https://dzone.com/articles/spring-boot-elasticsearch

- https://github.com/RajeshBhojwani/spring-boot-standalone-elasticsearch/blob/master/src/main/java/com/example/elasticsearch/controller/UserController.java

- https://piotrminkowski.wordpress.com/2019/03/29/elasticsearch-with-spring-boot/
