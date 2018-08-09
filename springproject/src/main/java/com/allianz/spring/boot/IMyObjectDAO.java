package com.allianz.spring.boot;

import org.springframework.data.repository.CrudRepository;

public interface IMyObjectDAO extends CrudRepository<MyObject, Long> {

}
