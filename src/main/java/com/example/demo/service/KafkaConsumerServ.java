package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Message;
import com.example.demo.repository.MessageRepo;
import org.json.JSONObject;

@Service
public class KafkaConsumerServ {

    @Autowired
    private MessageRepo messageRepository;

    @KafkaListener(topics = "your_topic_name", groupId = "your_group_id")
    public void consume(String messageContent) {
    	try {
	        JSONObject json = new JSONObject(messageContent);
	        String content = json.getString("content");
	        Message message = new Message();
	        message.setContent(content);
	        messageRepository.save(message);
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}
