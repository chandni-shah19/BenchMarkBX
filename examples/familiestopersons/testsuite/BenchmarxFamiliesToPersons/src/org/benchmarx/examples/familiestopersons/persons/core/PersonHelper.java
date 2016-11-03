package org.benchmarx.examples.familiestopersons.persons.core;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.util.EcoreUtil;

import Persons.Person;
import Persons.PersonRegister;
import Persons.PersonsFactory;

public class PersonHelper {
	
	private Person getFromRegister(String name, PersonRegister register) {
		Optional<Person> person = register.getPersons().stream()
				.filter(p -> p.getName().equals(name))
				.findAny();
				
		assertTrue(person.isPresent());
		return person.get();
	}
	
	public void createHomer(PersonRegister register) {
		Person person = PersonsFactory.eINSTANCE.createMale();
		person.setName("Simpson, Homer");
		register.getPersons().add(person);
	}
	
	public void birthdayChangeOfHomer(PersonRegister register) {
		Person person = getFromRegister("Simpson, Homer", register);
		
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
		Person person = getFromRegister("Simpson, Homer", register);
		person.setName("Simpson, HomerX");
	}
	
	public void firstNameChangeOfBart(PersonRegister register) {
		Calendar cal = Calendar.getInstance();
		cal.set(2013, Calendar.JANUARY, 9, 10, 11, 12); 
		Date date = cal.getTime();
		
		for(int i =0;i<register.getPersons().size();i++)
		{
				if(register.getPersons().get(i).getBirthday().toString().equals(date.toString()))
				{
					register.getPersons().get(i).setName("Simpson, BartX");
				}
		}
		
	}

	public void familyNameChangeOfLisa(PersonRegister register) {
		Person person = getFromRegister("Simpson, Lisa", register);
		person.setName("Jetson, Lisa");
	}
	
	public void familyNameChangeOfShweta(PersonRegister register) {
		Person person = getFromRegister("Bachchan, Shweta", register);
		person.setName("Nanda, Shweta");
	}
	
	public void fullNameChangeOfHomer(PersonRegister register) {
		Person person = getFromRegister("Simpson, Homer", register);
		person.setName("Jetson, Elroy");
	}
	
	public void fullNameChangeOfBart(PersonRegister register) {
		Person person = getFromRegister("Simpson, Bart", register);
		person.setName("Orbit, Henry");
	}
	
	public void fullNameChangeOfOtherBart(PersonRegister register) {
		Calendar cal = Calendar.getInstance();
		cal.set(2013, Calendar.JANUARY, 9, 10, 11, 12); 
		Date date = cal.getTime();
		
		for(int i =0;i<register.getPersons().size();i++)
		{
				if(register.getPersons().get(i).getBirthday().toString().equals(date.toString()))
				{
					register.getPersons().get(i).setName("Orbit, Henry");
				}
		}
	}
	
	public void deleteMarge(PersonRegister register) {
		Person person = getFromRegister("Simpson, Marge", register);
		EcoreUtil.delete(person);
	}
	
	public void deleteHomer(PersonRegister register) {
		Person person = getFromRegister("Simpson, Homer", register);
		EcoreUtil.delete(person);
	}
	
	public void createBart(PersonRegister register) {
		Person person = PersonsFactory.eINSTANCE.createMale();
		person.setName("Simpson, Bart");
		register.getPersons().add(person);
	}
	
	public void createOtherBart(PersonRegister register) {
		Person person = PersonsFactory.eINSTANCE.createMale();
		person.setName("Simpson, Bart");
		
		Calendar cal = Calendar.getInstance();
		cal.set(2013, Calendar.JANUARY, 9, 10, 11, 12); 
		Date date = cal.getTime();
		
		person.setBirthday(date);
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
		Person person = getFromRegister("Bachchan, Shweta", register);
		person.setName("Nanda, Shweta");
	}
}
