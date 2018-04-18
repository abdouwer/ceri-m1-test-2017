package fr.univavignon.rodeo;


import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

import org.junit.*;
import org.mockito.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import java.util.*;

public class ISpecifieTest {
	
	ISpecie specie;
	List<IAnimal> list;
	
	@Before
	public  void getInstance(){
		specie=mock(ISpecie.class);
	when(specie.getArea()).thenReturn(1);
	when(specie.getName()).thenReturn("MyArea");

	}
	@Test
	public void testBlabla(){
	assertEquals(1,specie.getArea());
	System.out.println(specie.getArea());
	}

}
