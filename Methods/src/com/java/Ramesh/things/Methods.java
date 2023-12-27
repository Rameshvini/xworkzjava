package com.java.Ramesh.things;
import java.util.Scanner;
public class Methods {
	
	public static void main(String []args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER YOUR NAME");
	String name=scan.nextLine();
	System.out.println("ENTER YOUR YEAR OF BIRTH");
	int yob=scan.nextInt();
	greet(name);
	int res=calculatingAge(yob);
	System.out.println("you are "+res+ " years old");
	}
	public static void greet(String name)
	{
	System.out.println("Hello "+name);
	}
	public static int calculatingAge(int yob)
	{
		return 2023-yob;
	
	}
	}




