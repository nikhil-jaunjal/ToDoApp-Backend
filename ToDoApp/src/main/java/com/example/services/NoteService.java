package com.example.services;

import com.example.models.NoteEntity;

public interface NoteService {

	Object saveNote(NoteEntity noteEntity) throws Exception;
	
	Object deleteNote(Long id) throws Exception;
	
	Object getNote(Long id) throws Exception;
	
	Object getAllNotes() throws Exception;
	
	Object getNotesByUserId(Long id) throws Exception;
	
}
