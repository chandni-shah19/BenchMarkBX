package org.benchmarx.core;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.benchmarx.familiestopersons.Decisions;
import org.eclipse.emf.ecore.util.EcoreUtil;

import Families.FamilyRegister;
import Persons.Person;
import Persons.PersonRegister;
import Persons.PersonsFactory;

public class HelperPersonTest {
	
	public Comparator<PersonRegister> personsComparator;
	public BenchmarxUtil util;
	public BXTool<FamilyRegister, PersonRegister, Configurator<Decisions>> tool;
	
	public void createHomer(PersonRegister eObject) {
		Person person = PersonsFactory.eINSTANCE.createMale();
		person.setName("Simpson, Homer");
		eObject.getPersons().add(person);
	}
	
	public void birthdayChangeOfHomer(PersonRegister eObject) {
		Person person = eObject.getPersons().get(0);
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
	
	public void firstNameChangeOfHomer(PersonRegister eObject) {
		Person person = eObject.getPersons().get(0);
		assertTrue(person.getName().equals("Simpson, Homer"));
		
		person.setName("Simpson, HomerX");
	}
	
	public void familyNameChangeOfLisa(PersonRegister register) {
		Person person = register.getPersons().get(2);
		assertTrue(person.getName().equals("Simpson, Lisa"));
		
		person.setName("SimpsonS, Lisa");
	}
	
	public void fullNameChangeOfHomer(PersonRegister register) {
		Person person = register.getPersons().get(0);
		assertTrue(person.getName().equals("Simpson, Homer"));
		
		person.setName("SimpsonS, HomerX");
	}
	
	public void deleteMarge(PersonRegister register) {
		Person person = register.getPersons().get(1);
		assertTrue(person.getName().equals("Simpson, Marge"));
		
		EcoreUtil.delete(person);
	}
}
