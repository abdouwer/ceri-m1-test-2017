package fr.univavignon.rodeo;



import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

import org.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class IEnvironmentTest {
	
	IEnvironment environment;
	static List<ISpecie> maListeSpec;
	
	 
	@Before
	public  void getInstance(){
		
	
		environment=mock(IEnvironment.class);
		
	when(environment.getAreas()).thenReturn(1);
	ISpecie specie = ISpecifieTest.getTestInstance();
	maListeSpec= new ArrayList();
	maListeSpec.add(specie);
	when(environment.getSpecies()).thenReturn(maListeSpec);
	when(specie.getName()).thenReturn("MyEnvironement");

	}
	@Test
	public void testBla(){
		
	assertEquals(1,environment.getAreas());
	System.out.println(environment.getSpecies());
	

	}


}
