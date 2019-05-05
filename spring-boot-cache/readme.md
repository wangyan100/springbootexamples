# SpringBoot Cache

This guide walks you through the process of enabling caching 

and the process of removing caching on a Spring managed bean

## What you’ll build

You’ll build an application that enables caching  on a simple book repository.

and you can also remove caching by SpringBoot's scheuduled  task  



- enable Caching on SpringBoot Application

  ![Screenshot 2019-05-05 at 10.41.02](./doc/Screenshot 2019-05-05 at 10.41.02.png)



- put results into cache on Dao Implementation 

  ![Screenshot 2019-05-05 at 11.08.03](doc/Screenshot 2019-05-05 at 11.08.03.png)



- start your SpringBoot Application, if you try to get results twice, firstly they are not retrieved from cache, second time they will be retrieved from cache as expected.

  

  ![Screenshot 2019-05-05 at 11.17.43](doc/Screenshot 2019-05-05 at 11.17.43.png)



- enable scheudle on SpringBoot Application, and inject the CacheManager

  ![Screenshot 2019-05-05 at 11.27.31](doc/Screenshot 2019-05-05 at 11.27.31.png)



- define Scheudled Task to clear cache regularly. ![Screenshot 2019-05-05 at 11.32.36](./doc/Screenshot 2019-05-05 at 11.32.36.png)

- start  your SpringBoot Application, after cache is cleared, results will be retrieved not from cache.  

![Screenshot 2019-05-05 at 11.37.22](doc/Screenshot 2019-05-05 at 11.37.22.png)





- Reference 

  https://spring.io/guides/gs/caching/