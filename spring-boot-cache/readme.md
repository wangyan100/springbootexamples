# SpringBoot Cache

This guide walks you through the process of enabling caching and the process of removing caching on a Spring managed bean.

## What you’ll build

You’ll build an application that enables caching  on a simple book repository, and you can also remove caching by SpringBoot's scheuduled  task .



- enable Caching on SpringBoot Application

  ![Screenshot 2019-05-05 at 10.41.02](doc/screenshot1.png)



- put results into cache on Dao Implementation 

  ![Screenshot 2019-05-05 at 11.08.03](doc/screenshot2.png)



- start your SpringBoot Application, if you try to get results twice, firstly they are not retrieved from cache, second time they will be retrieved from cache as expected.

  

  ![Screenshot 2019-05-05 at 11.17.43](doc/screenshot3.png)



- enable scheudle on SpringBoot Application, and inject the CacheManager.

  ![Screenshot 2019-05-05 at 11.27.31](doc/screenshot4.png)



- define Scheudled Task to clear cache regularly. ![Screenshot 2019-05-05 at 11.32.36](./doc/screenshot5.png)

- start  your SpringBoot Application, after cache is cleared, results will not be retrieved from cache.  

![Screenshot 2019-05-05 at 11.37.22](doc/screenshot6.png)





- Reference 

  https://spring.io/guides/gs/caching/