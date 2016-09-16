package javaRefresher;

public class Interface_Triangle implements Interface {

	public double area(int length, int breadth) {
		double area=(.5)*length*breadth;
		System.out.println("Interface_Triangle: Area = " + (area));
		return (area);
	}
}