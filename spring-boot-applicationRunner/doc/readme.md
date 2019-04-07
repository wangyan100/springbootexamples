# How to initialize SpringBoot Application's resources in different orders



Your springboot application will be started from class with @SpringBootApplication , but if your project contains serveal different resources and you need to initialize them in different orders. How to acheive this?



You could use ApplicationRunner or CommandLineRunner to do this.  I will use below example to show you how to do this.

 

 