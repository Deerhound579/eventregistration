package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Person table in the database
public class Person {
	private String name;

	public void setName(String value) {
		this.name = value;
	}

	@Id //style, put on the attributes
	public String getName() {
		return this.name;
	}
}
