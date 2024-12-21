package com.chat_app.exceptions;

public class RoomAlreadyExistsException extends RuntimeException {

	public RoomAlreadyExistsException(String message) {
		super(message);
	}
}
