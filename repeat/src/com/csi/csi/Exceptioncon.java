package com.csi.csi;

public class Exceptioncon {
public static void main(String[] args) {
    int age=115;
    
    try {
		if(age<=18){
			System.out.println("not able for vote");
			throw new notablethevote(null);
			
		}else{
			System.out.println("able for vote");
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
