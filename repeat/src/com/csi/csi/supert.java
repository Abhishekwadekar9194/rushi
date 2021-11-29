package com.csi.csi;
class abhi{
	
	 static void set(int id){
		System.out.println(""+id);
	}
}
public class supert extends abhi{
	 void net(java.lang.String string){
		super.set(2588);
		System.out.println(string);
	}
public static void main(String[] args) {
	set(456);
	supert s=new supert();
	s.net("abhi");
}
}
