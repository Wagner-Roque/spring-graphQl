package com.wagner.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wagner.graphql.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
