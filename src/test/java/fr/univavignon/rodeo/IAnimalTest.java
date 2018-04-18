package fr.univavignon.rodeo;


import java.util.List;

import org.junit.Before;

import fr.univavignon.rodeo.api.IAnimal;

import org.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class IAnimalTest {

	static IAnimal animal;

	
	
	@Before
	public  void getInstance(){
		animal=mock(IAnimal.class);
	when(animal.isBoss()).thenReturn(false);
	when(animal.getName()).thenReturn("Mamadou");
	when(animal.getXP()).thenReturn(12);
	
	}
	
	public  static IAnimal getTestInstance(){
		animal=mock(IAnimal.class);
		when(animal.isBoss()).thenReturn(false);
		when(animal.getName()).thenReturn("Mamadou");
		when(animal.getXP()).thenReturn(12);
		
		
		return animal;	
	}
	

	@Test
	public void testBlabla(){
	assertEquals(false,animal.isBoss());
	System.out.println(animal.getXP());

    
	}
}
