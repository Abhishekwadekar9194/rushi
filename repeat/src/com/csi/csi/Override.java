package com.csi.csi;
abstract class abc{
	void set(){
		System.out.println("csi");
	}
}
class bvc extends abc{
	void set(){
		//super.set();
		System.out.println("pune");
	}
}
public class Override {
	public static void main(String[] args) {
		abc b=new bvc();
		b.set();
	}


}
