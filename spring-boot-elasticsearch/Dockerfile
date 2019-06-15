FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG CLUSTER_NODES=localhost:9300
ARG CLUSTER_HOST=localhost
ENV CLUSTER_NODES=$CLUSTER_NODES
ENV CLUSTER_HOST=$CLUSTER_HOST
ARG REST_URI=localhost:9200
COPY build/libs/*.jar app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]
CMD java -jar /app.jar  --spring.data.elasticsearch.cluster-nodes=$CLUSTER_NODES --elasticsearch.cluster.host=$CLUSTER_HOST --spring.elasticsearch.rest.uris=$REST_URI