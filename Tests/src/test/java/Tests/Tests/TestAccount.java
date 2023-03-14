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




public class TestAccount {
	
	
	 
	@Test
	@DisplayName("Aqui compruebo que si yo a una cuenta le inserto un balance inicial, su balance actual sea igual al inicial")
	void TestBalanceInicial(){
		
		float inicial=50;
		
		Account c1 = new Account("juan", 123456789, inicial);

		assertTrue(c1.getBalance()==inicial);
		 

		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si a una cuenta le ingreso una cantidad, su balance sea mayor que 0")
	void TestBalanceMayorQue0(){
		

		
		Account c1 = new Account("pepe", 17789, 0);

		c1.deposit(10);
		
		float cantidad=0;
		
		assertThat(c1.getBalance(), greaterThan(cantidad));
		 

		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si a una cuenta le ingreso una cantidad y a otra no le ingreso nada, ni le indico una cantidad "
			+ "inicial, el balance de la que le he insertado la cantidad sea mayor que el de la otra")
	void TestBalanceMayorQuec2(){
		

		
		Account c1 = new Account("roberto", 1089, 0);
		Account c2 = new Account("juani", 1999, 0);
		
		c1.deposit(10);
		
		float cantidad=0;
		
		assertThat(c1.getBalance(), greaterThan(c2.getBalance()));
		 

		
	}
	
	
	@Test
	@DisplayName("Aqui compruebo que si a una cuenta le ingreso una cantidad negativa, el metodo me "
			+ "devuelva false")
	void TestDepositFalse(){
		

		
		Account c1 = new Account("juan", 1669, 0);
		
		boolean resultado=c1.deposit(-80);
	
		
		assertTrue(resultado==false);


		
	}
	
	
	@Test
	@DisplayName("Aqui compruebo que si a una cuenta le ingreso una cantidad y posteriormente le retiro"
			+ " otra cantidad, la cantidad actual sea menor a la cantidad anterior")
	void TesRetirarMenorAnterior(){
		

		
		Account c1 = new Account("alex", 8259, 0);

		
		c1.deposit(50);
		
		float cantidadAnterior=c1.getBalance();
		
		c1.withdraw(10, 10);
		
		assertThat(c1.getBalance(), lessThan(cantidadAnterior));
		 

		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si quiero retirar una cantidad a una cuenta que no tiene ninguna "
			+ "cantidad insertada, su saldo siga siendo 0 y aparte, el metodo withdraw me devuelva false")
	void TesRetirarFalseY0(){
		

		
		Account c1 = new Account("aa", 1959, 0);

		
		
		boolean resultado=c1.withdraw(30, 0);
		
		assertTrue(resultado==false);
		float a=0;
		assertFalse(c1.getBalance()>0);
		

		
	}

	
	@Test
	@DisplayName("Este test es para comprobar que si yo le intento retirar una cantidad negativa, el "
			+ "metodo withdraw me devuelva false y la cantidad de la cuenta sea 0")
	void TestRetirarNegativo(){
		

		
		Account c1 = new Account("bb", 1889, 0);

		
		
		boolean resultado=c1.withdraw(-50, 0);
		
		assertTrue(resultado==false);
		float a=0;
		assertFalse(c1.getBalance()>0);
		

		
	}

	@Test
	@DisplayName("Aqui compruebo que el saldo actual de una cuenta sea la cantidad anterior menos la suma"
			+ " del amount y la tarifa")
	void TestRetirarCalculo(){
		

		
		Account c1 = new Account("cc", 100, 0);

		c1.deposit(50);
		
		float cantidadAnterior=c1.getBalance();
		
		float amountRetirar=10;
		float tarifaRetirar=10;
		
		c1.withdraw(amountRetirar, tarifaRetirar);
		
		assertTrue(c1.getBalance()==cantidadAnterior-(amountRetirar+tarifaRetirar));

		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si yo tengo dos cuentas con la misma cantidad y a una de ellas le retiro una cantidad, la cantidad "
			+ "actual de la cuenta a la que le he retirado sea menor a la otra cuenta")
	void TestRetirarc1Menorc2(){
		

		
		Account c1 = new Account("cc", 100, 50);
		Account c2 = new Account("dd", 455, 50);
		
		c1.withdraw(10, 10);
		
		assertThat(c1.getBalance(), lessThan(c2.getBalance()));

		
	}
	
	
	@Test
	@DisplayName("Aqui compruebo que al llamar al metodo addInterest el balance actual de la cuenta sea el balance"
			+ " inicial mas el calculo del interes")
	void TesInteres(){
		
		float cantidadInicial=50;
		
		Account c1 = new Account("ee", 1780, cantidadInicial);

		
		c1.addInterest();
		
		assertTrue(c1.getBalance()==cantidadInicial + (cantidadInicial * 0.045));
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si yo llamo al metodo addInterest en un cuenta a la que todavia no le he ingresado "
			+ "nada, su balance actual ea 0")
	void TesAddInterestIgualA0(){
		

		
		Account c1 = new Account("ff", 17550, 0);

		
		c1.addInterest();
		
		assertTrue(c1.getBalance()==0); 
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que si yo llamo al metodo addInterest en dos cuentas con diferente cantidad, el balance"
			+ " de la que tiene mas saldo, sea mayor al balance de la que tiene menos saldo")
	void TestAddInterestc2Mayorc1(){
		

		
		Account c1 = new Account("gg", 177750, 50);
		Account c2 = new Account("hh", 100750, 200);

		
		c1.addInterest();
		c2.addInterest();
		
		assertThat(c2.getBalance(), greaterThan(c1.getBalance()));
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que el metodo getBalance devuelva un tipo float")
	void TestGetBalanceIsFloat(){
		

		
		Account c1 = new Account("jj", 123750, 50);

		
		
		assertThat(c1.getBalance(), is((instanceOf(float.class))));
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que c1 sea un objeto de la clase Account")
	void Testc1IsAccount(){
		

		
		Account c1 = new Account("ss", 1099950, 50);

		
		
		assertTrue(( c1 instanceof Account ));
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que el metodo getAccountNumber devuelva un tipo long")
	void TestGetAccountNumberIsLong(){
		

		
		Account c1 = new Account("jl", 11150, 50);

		
		
		assertThat(c1.getAccountNumber(), is((instanceOf(long.class))));
		
	}
	
	@Test
	@DisplayName("Aqui compruebo que el metodo toString devuelva un tipo String")
	void TestToStringIsString(){
		

		
		Account c1 = new Account("hl", 1050, 50);

		
		
		assertThat(c1.toString(), is((instanceOf(String.class))));
		
	}
}
