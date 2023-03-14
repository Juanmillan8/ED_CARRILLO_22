package Tests.Tests;

import java.util.Map;
import java.util.Vector;
import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.CoreMatchers.not;
import org.hamcrest.Matcher;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;
import org.hamcrest.core.StringContains;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.*;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Tests.Tests.OperadorAritmetico.*;


public class TestPila {

	
	
	
	@Test
	@DisplayName("Aqui compruebo que si yo añado un elemento a la pila, la pila no esté vacia")
	void TestPilaEmpty(){
		
		
		Pila a = new Pila();
		
		
		a.push(10);
		
		assertFalse(a.isEmpty());
		
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si yo añado un elemento a la pila que no esté entre 2 y 20 no se añadira nada")
	void TestPilaVaciaRango(){
		
		
		Pila a = new Pila();
		
		
		a.push(1);
		a.push(30);
		
		assertTrue(a.isEmpty());
		
		
	}
	
	
	@Test
	@DisplayName("Aqui compruebo que a sea un objeto de la clase pila")
	void TestAesPila(){
		
		
		Pila a = new Pila();
		
		assertThat(a, is((instanceOf(Pila.class))));

		
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que el metodo isEmpty devuelva un tipo booleano")
	void TestIsEmptyEsBoolean(){
		
		
		Pila a = new Pila();
		
		assertThat(a.isEmpty(), is((instanceOf(Boolean.class))));

		
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si llamo al metodo pop sin antes haber insertado nada en la pila, dicho metodo "
			+ "me devuelva null")
	void TesPilaNull(){
		
		
		Pila a = new Pila();
		
		assertTrue(a.pop()==null);

		
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que el metodo pop me devuelve el ultimo elemento que he añadido")
	void TesPilaPopUltimo(){
		
		int ultimoElemento=12;
		Pila a = new Pila();
		
		a.push(10);
		a.push(12);
		a.push(13);
		a.push(ultimoElemento);
		assertTrue(a.pop()==ultimoElemento);

		

		
		
	}
	
	
	
	@Test
	@DisplayName("Aqui compruebo que si llamo al metodo pop dicho metodo me saca el ultimo elemento que haya "
			+ "en la pila")
	void TesPilaPopNull(){
		
		
		Pila a = new Pila();
		
		a.push(10);
		
		assertTrue(a.pop()==10);
		assertTrue(a.pop()==null); 
		

		 
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que el metodo top devuelva el ultimo numero que he añadido a la pila")
	void TesTop(){
		
		
		Pila a = new Pila();
		
		a.push(12);
		a.push(13);
		a.push(14);
		a.push(15);
		
		assertTrue(a.top()==15);

		

		 
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que el metodo top no me quite el ultimo elemento como ocurre con el metodo pop")
	void TesTopNoNull(){
		
		
		Pila a = new Pila();

		a.push(15);
		
		assertTrue(a.top()==15);
		assertFalse(a.top()==null); 
		
		

		 
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si llamo al metodo top con una pila vacia dicho metodo me devuelva null")
	void TesTopNull(){
		
		
		Pila a = new Pila(); 


		assertTrue(a.top()==null);
		
		

		 
		
	}
	
	
}
