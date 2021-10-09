package com.guilhermepisco.springwebsockets.resources;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.guilhermepisco.springwebsockets.entities.Incident;

@Controller
public class IncidentResource {

	 @MessageMapping("/newincident")
	  @SendTo("/topic/newinc")
	  public ResponseEntity<Incident> greeting(Incident incObj) throws Exception {
	    //Thread.sleep(1000); // simulated delay
		 System.out.println("Message received!!!!!!!");
	    return ResponseEntity.ok(incObj);
	  }
	
}
