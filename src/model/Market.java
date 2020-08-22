package model;

import java.util.ArrayList;
import java.util.List;

public class Market {
	
	private List<Person> persons;
	
	public Market() {
		persons = new ArrayList<Person>();
	}
	
	public void addPerson(String t, String n) {
		
		Person exist = null;
		for (int i = 0; i < persons.size() && exist==null; i++) {
			Person actual = persons.get(i);
			if(actual.getNumber().equals(n)) {
				exist = actual;
			}
			else {
				Person newPerson = new Person(t, n);
				persons.add(newPerson);
			}
		}
		
	}
	public List<Person> getPersons(){
		return persons;
	}
	

}
