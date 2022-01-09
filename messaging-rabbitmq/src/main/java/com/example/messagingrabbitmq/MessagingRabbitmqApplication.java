package com.example.messagingrabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingRabbitmqApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(MessagingRabbitmqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleMessage sm = new SimpleMessage();
		sm.setName("firstMessage");
		sm.setDesc("simple description");
		rabbitTemplate.convertAndSend("MyTopicExchange", "topic", sm);
	}
}
