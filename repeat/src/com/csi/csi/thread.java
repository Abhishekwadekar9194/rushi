package com.csi.csi;

public class thread extends Thread{
	public static void main(String[] args) {
		
	
int i;
for(i=1;i<10;i++){
	try {
		sleep(2458);
		System.out.println(i);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
}