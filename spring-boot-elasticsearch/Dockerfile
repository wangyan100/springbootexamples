FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY build/libs/*.jar app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]
CMD java -jar /app.jar  --spring.data.elasticsearch.cluster-nodes=$CLUSTER_NODES --elasticsearch.cluster.host=$CLUSTER_HOST