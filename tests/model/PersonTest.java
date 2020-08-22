package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {
	
	private Market mark;
	
	public void setupStage1(){
		mark = new Market();
	}
		
	public void setupStage2(){
		mark = new Market();
		mark.addPerson("ti", "21356984");
	}
	
	@Test
	public void testAddPerson() {
		setupStage1();
		
		mark.addPerson("ti", "21356298");
		
		assertEquals(1,mark.getPersons().size());
		assertEquals("cc",mark.getPersons().get(0).getType());
		assertEquals(21356298,mark.getPersons().get(0).getNumber());
				
	}
	
	
}
