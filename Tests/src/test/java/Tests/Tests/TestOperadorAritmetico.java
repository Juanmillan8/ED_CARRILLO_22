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


public class TestOperadorAritmetico {
	
	
	
	@Test
	@DisplayName("Aqui compruebo que al sumar 1 + 1 me devuelva 2")
	void TestSumaIgual2(){
		
		
		
		assertTrue(OperadorAritmetico.suma(1, 1)==2);
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que al sumar 20 + 34 me devuelva 54")
	void TestSumaIgual54(){
		
		
		
		assertTrue(OperadorAritmetico.suma(20, 34)==54);
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que al sumar -12 + 58 me devuelva 46")
	void TestSumaIgual46(){
		
		
		
		assertTrue(OperadorAritmetico.suma(-12, 58)==46);
		
	} 
	
	@Test
	@DisplayName("Aqui compruebo que al sumar -10 + -10 me devuelva -20")
	void TestSumaIgualMenos20(){
		
		
		
		assertTrue(OperadorAritmetico.suma(-10, -10)==-20);
		
	}
	

	
	@Test
	@DisplayName("Aqui compruebo que al dividir 2 entre 2 me devuelva 1")
	void TestDivisionIgual1() throws Exception{
		
		
		
		assertTrue(OperadorAritmetico.division(2, 2)==1);
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que al dividir 15 entre 4 me devuelva 3")
	void TestDivisionIgual3() throws Exception{
		
		

		assertTrue(OperadorAritmetico.division(15, 4)==3);

	}
	
	@Test
	@DisplayName("Aqui compruebo que al dividir 8 entre 13 me devuelva 0")
	void TestDivision8Entre13() throws Exception{
		
		

		assertTrue(OperadorAritmetico.division(8, 13)==0);

	}
	
	@Test
	@DisplayName("Aqui compruebo que al dividir -6 entre 4 me devuelva -1")
	void TestDivisionNegativo() throws Exception{
		
		

		assertTrue(OperadorAritmetico.division(-6, 4)==-1);

	}
	
	@Test
	@DisplayName("Aqui compruebo que al dividir -12 entre 9 me devuelva 1")
	void TestDivision1() throws Exception{
		
		

		assertTrue(OperadorAritmetico.division(-12, -9)==1);

	}
	

	
	@Test
	@DisplayName("Aqui compruebo que al introducir un divisor igual a 0 me salte la excepcion")
	void TestDivisionException() throws Exception{
		
	

		try {
			OperadorAritmetico.division(3, 0);
	        fail("El calculo es " +OperadorAritmetico.division(3, 0));
	    } catch (Exception e) {
	        System.out.println("ERROR: el divisor no puede ser 0");
	    }

	}
}
