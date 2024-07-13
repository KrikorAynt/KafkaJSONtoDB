package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaJSONtoDB{

	public static void main(String[] args) {
		SpringApplication.run(KafkaJSONtoDB.class, args);
	}

}
// zookeeper-server-start.bat C:\kafka_2.13-3.7.1\config\zookeeper.properties
// kafka-server-start.bat C:\kafka_2.13-3.7.1\config\server.properties
// kafka-console-producer.bat --topic your_topic_name --bootstrap-server localhost:9092