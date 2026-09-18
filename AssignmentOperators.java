package com.bca;

import java.util.Scanner;

public class AssignmentOperators {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int a = sc.nextInt();
	a += 10;
	System.out.println("After += 10:"+ a);
	a -=5;
	System.out.println("After -= 5"+ a);
	a*= 2;
	System.out.println("After *= 2:"+ a);
	a /=3;
    System.out.println("After /= 3:"+ a);
    a %= 2;
    System.out.println("After %= 2:"+ a);
    sc.close();
	}

}
