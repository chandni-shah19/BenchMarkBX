package org.benchmarx.examples.familiestopersons.persons.core;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.ecore.util.EcoreUtil;

import Persons.Person;
import Persons.PersonRegister;
import Persons.PersonsFactory;

public class PersonHelper {
	
	public void createHomer(PersonRegister register) {
		Person person = PersonsFactory.eINSTANCE.createMale();
		person.setName("Simpson, Homer");
		register.getPersons().add(person);
	}
	
	public void birthdayChangeOfHomer(PersonRegister register) {
		Person person = register.getPersons().get(0);
		assertTrue(person.getName().equals("Simpson, Homer"));
		
		Calendar cal = Calendar.getInstance();
		cal.set(2013, Calendar.JANUARY, 9, 10, 11, 12); 
		Date date = cal.getTime();
		person.setBirthday(date);
	}
	
	public void createMarge(PersonRegister register) {
		Person person = PersonsFactory.eINSTANCE.createFemale();
		person.setName("Simpson, Marge");
		register.getPersons().add(person);
	}
	
	public void createLisa(PersonRegister register){
		Person person = PersonsFactory.eINSTANCE.createFemale();
		person.setName("Simpson, Lisa");
		register.getPersons().add(person);
	}
	
	public void firstNameChangeOfHomer(PersonRegister register) {
		Person person = register.getPersons().get(0);
		assertTrue(person.getName().equals("Simpson, Homer"));
		
		person.setName("Simpson, HomerX");
	}
	
	public void familyNameChangeOfLisa(PersonRegister register) {
		Person person = register.getPersons().get(2);
		assertTrue(person.getName().equals("Simpson, Lisa"));
		
		person.setName("Jetson, Lisa");
	}
	
	public void fullNameChangeOfHomer(PersonRegister register) {
		Person person = register.getPersons().get(0);
		assertTrue(person.getName().equals("Simpson, Homer"));
		
		person.setName("Jetson, Elroy");
	}
	
	public void deleteMarge(PersonRegister register) {
		Person person = register.getPersons().get(1);
		assertTrue(person.getName().equals("Simpson, Marge"));
		
		EcoreUtil.delete(person);
	}
	
	public void deleteHomer(PersonRegister register) {
		Person person = register.getPersons().get(0);
		assertTrue(person.getName().equals("Simpson, Homer"));
		
		EcoreUtil.delete(person);
	}
	
	public void createBart(PersonRegister register) {
		Person person = PersonsFactory.eINSTANCE.createMale();
		person.setName("Simpson, Bart");
		register.getPersons().add(person);
	}
	
	public void createAmitabh(PersonRegister register) {
		Person person = PersonsFactory.eINSTANCE.createMale();
		person.setName("Bachchan, Amitabh");
		register.getPersons().add(person);		
	}
	
	public void createJaya(PersonRegister register) {
		Person person = PersonsFactory.eINSTANCE.createFemale();
		person.setName("Bachchan, Jaya");
		register.getPersons().add(person);
	}

	public void createAbhishek(PersonRegister register) {
		Person person = PersonsFactory.eINSTANCE.createMale();
		person.setName("Bachchan, Abhishek");
		register.getPersons().add(person);	
	}
	
	public void createShweta(PersonRegister register) {
		Person person = PersonsFactory.eINSTANCE.createFemale();
		person.setName("Bachchan, Shweta");
		register.getPersons().add(person);
	}
	
	public void familyNameChangeShweta(PersonRegister register) {
		Person person = register.getPersons().get(7);
		assertTrue(person.getName().equals("Bachchan, Shweta"));
		
		person.setName("Nanda, Shweta");
	}
}
