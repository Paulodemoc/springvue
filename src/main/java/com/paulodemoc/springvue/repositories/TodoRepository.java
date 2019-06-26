package com.paulodemoc.springvue.repositories;  

import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.paulodemoc.springvue.models.Todo;  

@RepositoryRestResource  
public interface TodoRepository extends JpaRepository<Todo, Long> {}