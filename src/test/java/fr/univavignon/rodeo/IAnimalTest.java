package fr.univavignon.rodeo;

import fr.univavignon.rodeo.api.IAnimal;

import org.junit.*;
import org.mockito.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class IAnimalTest {

	IAnimal animal;
	
	@Before
	public  void getInstance(){
		animal=mock(IAnimal.class);
	when(animal.isBoss()).thenReturn(false);
	when(animal.getName()).thenReturn("Mamadou");
	when(animal.getXP()).thenReturn(12);
	
	when(animal.isBoss()).thenReturn(true);
	when(animal.getName()).thenReturn("karim");
	when(animal.getXP()).thenReturn(12);
	
	when(animal.isBoss()).thenReturn(false);
	when(animal.getName()).thenReturn("Rus");
	when(animal.getXP()).thenReturn(12);
	}
	
	/*protected IAnimal getTestInstance(){
		return null;
		
	}*/
	
	@Test
	public void testBlabla(){
	assertEquals(false,animal.isBoss());
	System.out.println(animal.getXP());

	}
}
