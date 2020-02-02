package ca.mcgill.ecse321.eventregistration.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.eventregistration.model.Person;

// CrudRepository has basic operations
public interface PersonRepository extends CrudRepository<Person, String>{

    // The method queries Person, and return a Person, by name.
    // Declare it, and it'll know what should do
    Person findPersonByName(String name);

}