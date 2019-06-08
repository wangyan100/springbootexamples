
## docker build 
- gradle clean build 
- docker build -t wangyan100/springbootelastic .
- docker run -p 8080:8080 wangyan100/springbootelastic

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

-https://hackernoon.com/local-kubernetes-setup-with-minikube-on-mac-os-x-eeeb1cbdc0b 
