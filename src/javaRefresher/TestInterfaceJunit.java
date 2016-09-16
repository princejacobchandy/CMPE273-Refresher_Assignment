package javaRefresher;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestInterfaceJunit{
	
	private Interface obj1,obj2,obj3;

	@Before
	public void setUp(){
	obj1 = new Interface_Rectangle();
	obj2 = new Interface_Triangle();
	}
	@Test
	public void testAdder() {
		double result = obj1.area(3,4);
		assertEquals(result,12,0);
	}
	@Test
	public void testMultiplier() {
		double result = obj2.area(2,4);
		assertEquals(result,4,0);
	}
}
