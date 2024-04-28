package com.ps.jwt.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ps.jwt.model.Notice;


@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {

}
