package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import exceptions.*;

public class Market {
	
	private List<Person> persons;
	private int attemps;
	
	public Market() {
		persons = new ArrayList<Person>();
		attemps = 0;
	}
	
	public String addPerson(int t, String n) {
		String message = "";
		try {		
			int d = LocalDate.now().getDayOfMonth();
			char a =n.charAt(n.length()-2);
			String nu = ""+a;
			int num = Integer.parseInt(nu);
			boolean pday = isPairDay(d);
			boolean npday = isPairDay(num);
			if((pday==false && npday==false) || (pday==true && npday==false)) {
				throw new DayException("Today you can't enter to the market");
			}
			Person newPerson = new Person(t,n);
			persons.add(newPerson);
			message = "The person has been added correctly";
		}
		catch(YoungerException exc) {
			message = "The person can't be added, "+exc.getMessage();
		}
		catch(DayException exc) {
			message = "Can not been added, "+exc.getMessage();
		}
		finally {
			attemps++;
		}
		return message;
		}
			
			
			
		
	public boolean isPairDay(int n) {
		boolean p = false;
		if(n%2==0) {
			p=true;
		}
		return p;
	
	}
	public int getAttemps() {
		return attemps;
	}
	public List<Person> getPersons(){
		return persons;
	}
	

}
