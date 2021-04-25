package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.NoteEntity;
import com.example.serviceImpl.NoteServiceImpl;

@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
@RequestMapping("/notes")
public class NoteController {
	
	@Autowired
	private NoteServiceImpl noteServiceImpl;
	
	@GetMapping
	public Object getAllNotes() throws Exception{
		return noteServiceImpl.getAllNotes();
	}
	
	@GetMapping("/{id}")
	public Object GetNote(@PathVariable Long id) throws Exception{
		return noteServiceImpl.getNote(id);
	}
	
	@GetMapping("/user/{id}")
	public Object getNotesByUserId(@PathVariable Long id) throws Exception{
		return noteServiceImpl.getNotesByUserId(id);
	}
	
	@PostMapping
	public Object saveNote(@RequestBody NoteEntity noteEntity) throws Exception {
		return noteServiceImpl.saveNote(noteEntity);
	}
	
	@PutMapping
	public Object updateNote(@RequestBody NoteEntity noteEntity) throws Exception{
		return noteServiceImpl.saveNote(noteEntity);	
	}
	
	@DeleteMapping("/{id}")
	public Object deleteNote(@PathVariable Long id) throws Exception{
		return noteServiceImpl.deleteNote(id);
	}

}
