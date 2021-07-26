package com.jacdev.udemyoauth.api.ResourceServer.model;

import org.springframework.context.annotation.Bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder	
public class Album {

	private String userId, 
	id,title, description, url;
	
}


