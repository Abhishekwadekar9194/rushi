package com.csi.csi;
class var{
void set(){
	System.out.println("hello");
}
}
public class staticconcept {
public static void main(String[] args) {
	var v=new var();
	v.set();
	abc();
	System.gc();
}
static void abc(){
	System.out.println("static method");
}
}
