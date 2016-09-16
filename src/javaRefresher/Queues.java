package javaRefresher;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

public class Queues {
	public static Queue<String> bankQ = new LinkedList<String>();

	public static void newCustomer(String custName){
		if(bankQ.size()<10){
		System.out.println("Welcome " + custName + "! Please wait in Queue.. Teller will call you shortly.. \n");
		bankQ.offer(custName);
		}
		else{
		System.out.println("Teller Unavailable & Queue Full; Please take appointment and come back later!\n");	
		}	
	}
	
	public static String tellerAvailable(){
		if(bankQ.size()!=0){
		String nextCustomer=bankQ.poll();	
		System.out.println("Teller Available! Next Customer: " + nextCustomer + "\n");
		return nextCustomer;
		}
		else {
		System.out.println("Teller Available; Queue Empty\n");
		return null;
		}	
	}
		
	@Test
	public void testQueues(){
		newCustomer("Daby");
		tellerAvailable();
		newCustomer("Shankar");
		newCustomer("Roshan");
		assertEquals(tellerAvailable(),"Shankar");
		newCustomer("Mahesh");
		newCustomer("George");
		assertEquals(tellerAvailable(),"Roshan");
		assertEquals(tellerAvailable(),"Mahesh");
		assertEquals(tellerAvailable(),"George");
		assertEquals(tellerAvailable(),null);
	}
	
}	
	
	/*public static void main(String args[]){
	newCustomer("Daby");
	tellerAvailable();
	newCustomer("Shankar");
	newCustomer("Roshan");
	tellerAvailable();
	newCustomer("Mahesh");
	newCustomer("George");
	tellerAvailable();
	tellerAvailable();
	tellerAvailable();
	tellerAvailable();
	}*/




