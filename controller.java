package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Repo.ContactRepo;
import com.example.demo.model.Contact;

@RestController
public class controller 
{
	@Autowired
	ContactRepo repo;
	
	

	@GetMapping("/user/{userid}")
	public List<Contact> view(@PathVariable String userid)
	{
		List<Contact> contact= (List<Contact>) repo.findAll();
		return contact.stream().filter(con->con.getUserid().equals(userid)).collect(Collectors.toList()); 
	}
	
	@PostMapping("/addContact")
	public Contact addContact(@RequestBody Contact contact)
	{
		repo.save(contact);
		return contact;
	}
	
	@GetMapping("/getContact")
	public List<Contact> view()
	{
		List<Contact> contact= (List<Contact>) repo.findAll();
		return contact;
	}
	
}
