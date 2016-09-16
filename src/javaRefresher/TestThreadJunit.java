package javaRefresher;

import org.junit.Test;

public class TestThreadJunit {
		
	    Thread1 obj1;
	    Thread2 obj2;
	
		@Test
		public void ThreadJunit() {
		obj1 = new Thread1();
		obj2 = new Thread2();
		obj1.start();
		obj2.start();

		} 
	}
