package kum.TDD;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SuperNumberTest {
	
	SuperNumber superNumber;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testNumberSimple(){
		SuperNumber superNumber = new SuperNumber(6);
		assertTrue(superNumber.toDivide(3));
	}
	
	@Test
	public void testArraytoSimpleNumber(){
		SuperNumber superNumber = new SuperNumber(6);
		int[] array ={1, 2, 3, 6};
		assertThat(superNumber.arraySimpl(), is(array));
		
	}
	
	@Test
	public void testNumberNotMinus(){
		thrown.expect(IllegalArgumentException.class);
		new SuperNumber(-5);
	}
	

}
