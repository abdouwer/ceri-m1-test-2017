package fr.univavignon.rodeo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;
import fr.univavignon.rodeo.api.ISpecie;

import org.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class IGameStateProviderTest {

	static IGameStateProvider gameStateProvider;
	static List<ISpecie> maListeSpec;
	IAnimal boeuf =new IAnimalTest().getTestInstance();
	String nameG="gameState";
	IGameState gameState =new IGameStateTest().getTestInstance();
	@Before
	public  void getInstance(){
		
	

		when(gameState.getName()).thenReturn("MonGameState");
		
		
		gameStateProvider=mock(IGameStateProvider.class);
	
		when(gameStateProvider.get(nameG)).thenReturn(gameState);

	
	doThrow(new IllegalArgumentException()).when(gameStateProvider).save(gameState);
	}
	@Test
	public void testBla(){
		
		assertEquals(gameState,gameStateProvider.get(nameG));
	
	

	}
	
}
