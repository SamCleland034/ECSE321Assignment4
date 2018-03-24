package ca.mcgill.ecse321.assignment4.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import computation.Computation;

public class ComputationTestDivideMultiply {

	Computation computation;

	@Before
	public void setUp() {
	    computation = new Computation();		
	}
    
    @Test
	public void testDivide() {
	    double divideResult = computation.divide(2, 5);
	    assertEquals(0.4d, divideResult, 0.0d);
	}
	
    @Test
	public void testMultiply() {
    	int multiplyResult = computation.multiply(2, 5);
	    assertEquals(10, multiplyResult);
	}

}
