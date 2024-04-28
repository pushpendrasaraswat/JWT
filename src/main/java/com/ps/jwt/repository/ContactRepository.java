package com.ps.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ps.jwt.model.Contact;


@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {


}
