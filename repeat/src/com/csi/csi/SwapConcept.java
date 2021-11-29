package com.csi.csi;

import java.util.Scanner;

public class SwapConcept {
public static void main(String[] args) {
	int a;
	int b;
	int temp;
	Scanner  sc=new Scanner(System.in);
	System.out.println("Enter the value");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("After Swapping"+a+"   "+b);
	temp=a;
	a=b;
	b=a;
	System.out.println("Before Swapping"+a+"   "+b);
}
}
