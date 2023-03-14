package Tests.Tests;

import java.util.Map;
import java.util.Vector;
import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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



public class TestBoa {
	
	
	
	@ParameterizedTest
	@DisplayName("Aqui realizo diferentes pruebas parametrizadas")
	@ValueSource (strings="Manzana")
	public void TestParametrizado(String a){
		
		Boa b1 = new Boa("Juan", 12, a);
		 boolean resultado = b1.isHealthy();
		 
		 assertTrue(b1.isHealthy()==false);
		
	}
	
	
	

}
