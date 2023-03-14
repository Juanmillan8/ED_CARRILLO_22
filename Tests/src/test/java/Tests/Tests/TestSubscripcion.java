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



public class TestSubscripcion {

	
	
	
	@Test
	@DisplayName("Aqui compruebo que si tengo una subscripcion de 10 euros en 10 meses y llamo al metodo precioPorMes "
			+ "la cantidad que me devuelva sea 1")
	void TestPrecioPorMesIgual1(){
		
 
		
		Subscripcion c1 = new Subscripcion(10, 10);

		
		
		assertTrue(c1.precioPorMes()==1);
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si tengo una subscripcion de 10 euros en 20 meses y llamo al metodo precioPorMes "
			+ "la cantidad que me devuelva sea 0.5")
	void TestPrecioPorMesIgualCeroCon5(){
		
 
		
		Subscripcion c1 = new Subscripcion(10, 20);

		
		
		assertTrue(c1.precioPorMes()==0.5);
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si yo cancelo una subscripcion y llamo al metodo precioPorMes me devuelva 0, ya que "
			+ "he cancelado la subscripcion")
	void TestPrecioPorMesIgual0(){
		
 
		
		Subscripcion c1 = new Subscripcion(10, 20);

		c1.cancel();
		
		assertTrue(c1.precioPorMes()==0);
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si yo tengo una subscripcion con un precio de 0, al llamar al metodo precioPorMes "
			+ "me devuelva 0")
	void TestPrecio0(){
		 
 
		
		Subscripcion c1 = new Subscripcion(0, 12);

		
		assertTrue(c1.precioPorMes()==0);
		
	}
	
	
	
	
	
	
}
