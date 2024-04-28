package com.ps.jwt.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.ps.jwt.model.Authority;

public interface AuthorityRepository extends CrudRepository<Authority, Long> {

    Set<Authority> findByCustomer_Id(long id);
}
