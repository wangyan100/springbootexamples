
### Implement your own auto configuration 

Here we use a demo to show you how to implement your own auto configuration.
You basically just need do 3 things

-  Write Java Config
     ```
     @Configuration
     ```
- Add condition
    ```
    @Conditional
    ```
- Locating Auto-configuration Candidates
    ```
    META-INF/spring.factories
    ````