package com.chat_app.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collation= "room")
@Getter
@Setter
public class Room {

	private String id;
	private String roomId;
}
