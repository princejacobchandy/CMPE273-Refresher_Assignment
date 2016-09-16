package javaRefresher;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Generics {

	public static double Average(List<? extends Number> num_list) {
		
		double avg,sum=0.0;
		
		for(Number no: num_list)
		{
			sum+= no.doubleValue();
		}
		avg=sum/(num_list.size());
		System.out.println("Average is: " + avg);
		return avg;
	    
	}

	
	@Test
	public void test() {
		assertEquals(Average(Arrays.asList(1,2,3,4)),2.5,0);
	    assertEquals(Average(Arrays.asList(1.1,2.2,3.3,4.4)),2.75,0);
	    assertEquals(Average(Arrays.asList(1L,2L,3L,5L)),2.75,0);
	}
}
