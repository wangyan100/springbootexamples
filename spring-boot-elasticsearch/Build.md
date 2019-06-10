
## docker build 
- gradle clean build 
- docker build  -t wangyan100/springbootelastic --build-arg CLUSTER_NODES=192.168.1.199:9300 --build-arg CLUSTER_HOST=192.168.1.199 .
or 
- docker build  -t wangyan100/springbootelastic . 
- docker run -e CLUSTER_NODES=192.168.1.199:9300 -e CLUSTER_HOST=192.168.1.199 -p 8080:8080 wangyan100/springbootelastic

## push docker image (wangyan100/springbootelastic) to docker hub
- create wangyan100/springbootelastic as repository at docker hub website, of course you need register an account at docker hub website
- docker login
  - enter docker hub's username and password 
- docker tag <image_id> wangyan100/springbootelastic:latest 
- docker push wangyan100/springbootelastic:latest

## deployment on k8s(minikube locally)

- requirement 
  - install elasticsearch 6.4.3  on minikube pod
  - install springboot app (docker image yan/springbootels ) on minikube pod
  - springboot app should be able to communicate with elastichsearch 
  - user should be able to communication with springboot and elasticsearch via REST call

- current setup
  - virtualbox 
  - minikube
  - minikube addons enable ingress
  - kubernetes-helm 
  
- deploy on minikube
  - minikube start
  - minikube config set vm-driver virtualbox
  - kubectl config use-context minikube
  - kubectl cluster-info
  
  - kubectl create -f elasticsearch-deployment.yaml 
  - kubectl create -f springbootapp-deployment.yaml 
  - kubectl apply -f <dir_of_yaml_files>
  - kubectl get deployments (check deployment successful or not)
  - kubectl get pod
  - kubectl logs <pod id> (check logs)
  - kubectl delete pods <pod id>
  - kubectl delete deployment <label name>
  - kubectl describe service springbootelastic
  - kubectl get service
  - minikube service <service_name>
  
  - http://<IP>:<NODE_PORT>/actuator
  
  minikube service springbootelastic --url

- question how to deploy service yaml?
- in deployment yaml, you need to replace value for CLUSTER_NODES and CLUSTER_HOST
  

11

Simply call this command.

1/Get all available services:

kubectl get service -o wide
2/ Then you can delete any services like this:

kubectl delete svc <YourServiceName>

https://www.baeldung.com/spring-boot-minikube
https://hackernoon.com/local-kubernetes-setup-with-minikube-on-mac-os-x-eeeb1cbdc0b

https://docs.docker.com/engine/reference/commandline/container_ls/ 

https://juejin.im/post/5ab61075f265da23a2290ff8