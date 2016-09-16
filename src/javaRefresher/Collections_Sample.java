package javaRefresher;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import org.junit.Test;

public class Collections_Sample {
	public ArrayList<String> list;
	
	public void Attendance(){
		list = new ArrayList();
		System.out.println("Enter the strength of the class: ");
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		System.out.println("\nEnter the student names: ");
		while(n!=0)
		{
			list.add(reader.next());
			n--;
		}
	}
	
	public void SortNameList(ArrayList list){		
		Collections.sort(list);
		Iterator iterator=list.iterator();
		System.out.println("\nSorted List of Names:");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void testSortName()
	{
		Attendance();
		SortNameList(list);
		assertEquals(list.get(0),"Adam");
		assertEquals(list.get(4),"Zoe");
	}
}

