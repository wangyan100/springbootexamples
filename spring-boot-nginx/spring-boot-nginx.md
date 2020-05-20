# Deploy SpringBoot as Service with Nginx Reverse Proxy

In this example we show you how to deploy SpringBoot as Service with Nginx Reverse Proxy

We assume you are using Ubutun, with JDK and Nginx installed already.



### Install SpringBoot as Service

- write a service script for the SpringBoot Application

  ![1](spring-boot-nginx.assets/1.png)

- use below commands to manage the service that you just create

  ```sudo systemctl start upappmanager
  sudo systemctl start upappmanager
  
  sudo systemctl status upappmanager
  
  sudo systemctl stop upappmanager
  
  sudo systemctl restart upappmanager
  
  ```

### Config Reverse Proxy

- Nginx config to map forward the request upstream to the SpringBoot Application

```
##/etc/nginx/conf.d/upappmanager.conf
 
server {
        listen 80;
        listen [::]:80;
				# here you could also use subdomain
        server_name example.com;
        # here you could also use context, e.g  location /<context>
        location / {
             proxy_pass http://localhost:8080/;
             proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
             proxy_set_header X-Forwarded-Proto $scheme;
             proxy_set_header X-Forwarded-Port $server_port;
        }
}
```

- use below commands to test and restart nginx to make changes take effect

  ```
  # check nginx configuration 
  sudo nginx -t 
  
  # if there is no error, restart nginx to make changes take effect
  sudo systemctl restart nginx
  
  ```

  

  ### As you can see, it is working! 

  ![image-20200520214007042](spring-boot-nginx.assets/image-20200520214007042.png)