package com.chat_app.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat_app.entities.Room;
import com.chat_app.exceptions.RoomAlreadyExistsException;
import com.chat_app.repositories.RoomRepository;
import com.chat_app.services.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepository roomRepository;

	@Override
	public Room createRoom(Room room) {

		// Check if the Room ID already exists in the database
		if (room.getId() != null && roomRepository.existsById(room.getId())) {
			throw new RoomAlreadyExistsException("Room with ID " + room.getId() + " already exists.");
		}

		// Save the new Room
		return roomRepository.save(room);
	}

}