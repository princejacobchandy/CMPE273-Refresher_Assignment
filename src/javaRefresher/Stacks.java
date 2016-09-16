package javaRefresher;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class Stacks {
	public static Stack<String> rackDVD = new Stack<String>();
	
	public static void newDVD(String titleDVD){
		if(rackDVD.size()<5){
		rackDVD.push(titleDVD);
		System.out.println(titleDVD + " have been added to the rack! It's at the top of the rack..\n");
		}
		else{
		System.out.println("Couldn't add " + titleDVD + "!.. DVD rack is currently full!\n");	
		}	
	}

	public static String useDVD(){
		if(rackDVD.size()!=0){
		String nextDVD=rackDVD.pop();	
		System.out.println(nextDVD + " have been removed from the DVD rack.. \n");
		return nextDVD;
		}
		else {
		System.out.println("DVD rack empty ! Please try later..\n");
		return null;
		}	
	}
	
	
@Test
public void testQueues(){
	newDVD("Metallica");	
	newDVD("Iron Maiden");
	newDVD("Linkin Park");
	newDVD("Greenday");
	newDVD("Coldplay");
	newDVD("U2");
	assertEquals("Coldplay",useDVD());
	newDVD("U2");
	assertEquals("U2",useDVD());
	assertEquals("Greenday",useDVD());
	assertEquals("Linkin Park",useDVD());
	assertEquals("Iron Maiden",useDVD());
	assertEquals("Metallica",useDVD());
	assertEquals(null,useDVD());
}
}

