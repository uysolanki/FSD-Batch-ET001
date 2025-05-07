package day14static;

import static java.lang.Math.*;  //imported all the static methods & data

public class StaticImportDemo {

	public static void main(String[] args) {
		
		int jaipur=100;
		int pune=1400;
		
		int distance=abs(jaipur-pune);
		System.out.println(distance);
		
		int radius=5;
		double area=PI*radius*radius;
		System.out.println("Area of Circe "+area);
		
		System.out.println(sqrt(25));
		
		System.out.println(log10(1000));
	}

}


//78.50000 cr
//78.53981

//   1000      100         10         =		1
//   ---        --         --
//   10        10          10
 