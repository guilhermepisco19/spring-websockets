package com.guilhermepisco.springwebsockets.schedulers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ChartScheduler {

	@Autowired
	private SimpMessagingTemplate smt;
	
	@Scheduled(fixedDelay = 3000)
	public void sendRandomValue() {
		smt.convertAndSend("/topic/greetings", Math.random());
	}
}
