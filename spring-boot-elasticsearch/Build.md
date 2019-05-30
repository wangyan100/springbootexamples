
## docker build 
- gradle clean build 
- docker build -t yan/springbootels .
- $ docker run -p 8080:8080 yan/springbootels

## deployment on k8s

- requirment 
  - install Install elasticsearch 6.4.3  on minikube pod
  - install springboot app (docker image yan/springbootels ) on minikube pod


- current setup
  - virtualbox 
  - minikube
  - minikube addons enable ingress
  - kubernetes-helm 

-https://hackernoon.com/local-kubernetes-setup-with-minikube-on-mac-os-x-eeeb1cbdc0b 
