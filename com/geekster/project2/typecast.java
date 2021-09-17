package com.geekster.project2;
import java.util.*;

public class typecast {
	
	public static void main(String args[]) {
		System.out.println("Enter the string that is an int to be converted to int");
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();    //storing it as string
		
		int y= Integer.parseInt(b);
		
		System.out.println("the String to int conversion using parsing:"+y );
		
		// Typecasting (implicit)
		
		System.out.println("Enter the int to be converted to Double ");
		
		int i=sc.nextInt();        // int to double
		double d=i;
		System.out.println("Typecasting(inplicit) from int to double "+d);
		
		System.out.println("Enter the int to be converted to long ");
		
		int j =sc.nextInt();        // int to long
		long l=j;
		System.out.println("Typecasting(inplicit) from int to long "+l);
		
		// Typecasting (explicit)
		
		System.out.println("Enter the long to be converted to int ");  // long to int
		long lo=sc.nextLong();
		int k=(int) lo;
		System.out.println("Typecasting(explicit) from long to int "+k);
		
		System.out.println("Enter the float to be converted to int ");  // float to int
		float f=sc.nextFloat();
		int q=(int) f;
		System.out.println("Typecasting(explicit) from float to int "+q);
		
		
		
		
		
		
		
		
	}

}
