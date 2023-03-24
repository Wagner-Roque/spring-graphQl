package com.wagner.graphql.resolver;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.wagner.graphql.input.PersonInput;
import com.wagner.graphql.model.Person;
import com.wagner.graphql.repository.PersonRepository;

@Component
public class PesonResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Collection<Person> findAllPeople(){
		return personRepository.findAll();
	}
	
	public Person savePerson(PersonInput input) {
		return personRepository.save(new Person(input.getName(), input.getAge(), input.getGender()));
	}
}
