package org.benchmarx.examples.athometoweb.athome.core;

import static org.junit.Assert.assertTrue;
import java.util.Optional;
import org.eclipse.emf.ecore.util.EcoreUtil;

import AtHome.AtHomeFactory;
import AtHome.Directory;
import AtHome.File;
import AtHome.FileSystemElement;

public class AtHomeHelper {
	public void createJanDirectory(Directory eobject){
		Directory directory = AtHomeFactory.eINSTANCE.createDirectory();
		directory.setName("Jan");
		eobject.getSubDirs().add(directory);
	}
	
	public void createFilePalindrome(Directory eobject){
		Directory directory = eobject.getSubDirs().get(0);
		assertTrue(directory.getName().equals("Jan"));
		
		File file1 = AtHomeFactory.eINSTANCE.createFile();
		file1.setName("palindrome.jpg");
		file1.setPicture("pictureOfPalindromeCat");	
		directory.getFiles().add(file1);
	}
	
	public void createFileGamer(Directory eobject){
		Directory directory = eobject.getSubDirs().get(0);
		assertTrue(directory.getName().equals("Jan"));
		
		File file2 = AtHomeFactory.eINSTANCE.createFile();
		file2.setName("gamer.jpg");
		file2.setPicture("pictureOfGamer");	
		directory.getFiles().add(file2);
	}
	
	public void createMayDirectoryWithFile(Directory eobject){
		Directory directory = AtHomeFactory.eINSTANCE.createDirectory();
		directory.setName("May");
		eobject.getSubDirs().add(directory);
		
		File file = AtHomeFactory.eINSTANCE.createFile();
		file.setName("froghead.jpg");
		file.setPicture("PictureOfFrogHead");
		directory.getFiles().add(file);
	}
	
	public void directoryJanNameChangeEmpty(Directory eobject) {
		Directory directory = eobject.getSubDirs().get(0);
		assertTrue(directory.getName().equals("Jan"));
		
		directory.setName("Man");
	}
}
