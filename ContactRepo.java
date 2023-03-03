package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Contact;

public interface ContactRepo extends CrudRepository<Contact, String> {

}
