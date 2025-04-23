package day7string;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class StringDemo {

	public static void main(String[] args) {
		                    //  012345678
//		String name=new String("Alice Ben");
//		    // ref =     Object
//		System.out.println("Length Function of java.lang.String class "+name.length());   //length             length()
//											 //keyword            function
//											 //size of array      size of string
//		int arr[]= {10,20,30};
//		System.out.println("Length Keyword "+arr.length);
//		
//		System.out.println(name.charAt(3));
//		
//		System.out.println(name.indexOf('e'));
//		
//		System.out.println(name.lastIndexOf('e'));
		
		String email1="alice@enumtech.in";
		String email2="ben@enumtech.in";
		String email3="chris@gmail.com";
		
		
		//clean code practices
//		if(email3.endsWith(StringConstants.COMPANYNAME))
//		{
//			System.out.println("Valid email ");
//		}
//		else
//		{
//			System.out.println("Invalid email ");
//		}
		
		System.out.println(email1.endsWith(StringConstants.COMPANYNAME)?"Valid emailllll ":"Invalid emaillllll ");
	                 //012
		String name="my name is mahendra singh honi";
//		int counter=0;
//		for(int i=0;i<name.length();i++)
//		{
//			if(name.charAt(i)==' ')
//			{
//			counter++;	
//			}
//		}
//	
//		System.out.println("Number of words are "+(counter+1));
//		
		
//		String words[]=name.split(" ");
//		System.out.println("Number of words are "+ words.length);
		
		//verbose
		
		System.out.println("Number of words areeeeee "+ name.split(" ").length);
		
		
		//name.contains("is")
		System.out.println(name.contains("his")?"String Found":"String Not Found");
		
		
		int age=19;
		String sname1="Ben";
		double height1=5.10;
		
		//My name is Alice, I am 18 years old, my height is 5.10 feets
		//System.out.println("My name is "+sname+", I am "+age+" years old, my height is "+height+" feets");
		System.out.println(String.format("My name is %s, I am %d years old, my height is %.2f feets",sname1,age,height1));
		System.out.println(String.format("My name is %s, I am %d years old, my height is %.2f feets",sname1,getAge(),height1));
		System.out.println(String.format(getString(),StringConstants.STUDENT_NAME,getAge(),StringConstants.STUDENT_HEIGHT));
		
		displayBillNewPro();
		
		
		String pname="Mahendra Singh Dhoni";
		
		pname=pname.replace("Singh", "Kumar");
		System.out.println(pname);
		
	}

	public static int getAge()
	{
		return 21;
	}
	
	public static String getString()
	{
		return "My name is %s, I am %d years old, my height is %.2f feets";
	}
	
	public static void displayBill()
	{
		System.out.println(String.format("%-10s","Prod Name") + String.format("%-5s","Price"));
		System.out.println(String.format("%-10s","Tie") + String.format("%5s","$500"));
		System.out.println(String.format("%-10s","Belt") + String.format("%5d",700));
		System.out.println(String.format("%-10s","Trousers") + String.format("%5d",1500));
		System.out.println(String.format("%-10s","Total") + String.format("%5d",2700));
		
		
	}
	
	public static void displayBillNew()
	{
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        System.out.println(String.format("%-15s %20s", "Prod Name", "Price"));
        System.out.println(String.format("%-15s %20s", "Tie", currencyFormat.format(1000000)));
        System.out.println(String.format("%-15s %20s", "Belt", currencyFormat.format(700)));
        System.out.println(String.format("%-15s %20s", "Trousers", currencyFormat.format(1500)));
        System.out.println(String.format("%-15s %20s", "Total", currencyFormat.format(2700)));
	}
	
	public static void displayBillNewPro()
	{
		 Locale indiaLocale = new Locale("en", "IN");
	     Currency currency = Currency.getInstance(indiaLocale);

        System.out.println(String.format("%-15s %20s", "Prod Name", "Price"));
        System.out.println(String.format("%-15s %20s", "Tie", currency.getSymbol(indiaLocale)+Integer.toString(getTiePrice())));
        System.out.println(String.format("%-15s %20s", "Belt", currency.getSymbol(indiaLocale)+Integer.toString(15000)));
        System.out.println(String.format("%-15s %20s", "Trousers", currency.getSymbol(indiaLocale)+Integer.toString(100000)));
        System.out.println(String.format("%-15s %20s", "Total", currency.getSymbol(indiaLocale)+Integer.toString(1000000)));
	}
	
	
	public static int getTiePrice()
	{
		return 5000;
	}
	
	
}
 


/*
 Option A
Tie500
Belt700
Trousers1500
Total2700

Option B
Prod name Price    //left alignment
Tie       500
Belt      700
Trousers  1500
Total     2700

Option C
Prod name Price    //right alignment
       Tie500
      Belt700
  Trousers1500
     Total2700
*/