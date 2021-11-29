package com.csi.csi;

import java.util.Scanner;

public class SwapWithOutThird {
public static void main(String[] args) {
	int x;
	int y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the value");
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.println("After Swapping "+x+"  "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("Before Swapping "+x+"   "+y);
}
}
