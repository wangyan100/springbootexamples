package org.yw.springbootelasticsearch;

import java.net.InetAddress;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootElasticsearchApplication {

    @Value("${elasticsearch.cluster.host}")
    public String clusterhost;
    @Value("${elasticsearch.cluster.port}")
    public int clusterport;


    @Bean
    public Client client() {
        TransportClient client = null;
        try {
            System.out.println("host:" + clusterhost + "port:" + clusterport);
            client = new PreBuiltTransportClient(Settings.EMPTY)
                    .addTransportAddress(new TransportAddress(InetAddress.getByName(clusterhost), clusterport));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return client;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootElasticsearchApplication.class, args);
    }

}
