package javaRefresher;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.Test;
public class Arrays {
	public int[] array;
	int n;
	
	public void readMarks()
	{
	Scanner reader = new Scanner(System.in);  	
	System.out.println("Enter a number of courses: ");
	n = reader.nextInt();
	array = new int[n];
	System.out.println("Enter the marks: ");
	for (int i=0; i<n; i++)
	{
	array[i]=reader.nextInt();
	}
	}
	
	public int totalMarks(){
		int sum=0;
		for (int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		System.out.println("Total marks: " + sum + "\n");
		return sum;
	}
	
	public int avgMarks(){
		int avg=0;
		avg=(totalMarks())/n;
		System.out.println("Average marks: " + avg + "\n");
		return avg;
	}
	 @Test
	    public void testLargest() {
		 readMarks();
		 assertEquals(totalMarks(),460);
		 assertEquals(avgMarks(),92); 
	 }

}
