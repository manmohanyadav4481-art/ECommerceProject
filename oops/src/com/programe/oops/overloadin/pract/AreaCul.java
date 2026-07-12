package com.programe.oops.overloadin.pract;

class Area {
	void findArea (int side) {
		System.out.println("Square : "+side*side);
	}

void findArea (int l, int b) {
	System.out.println("Rectangle : "+(l*b));
}
}
class AreaCul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Area are = new Area ();
   are.findArea(2);
   are.findArea(3, 5);
	}

}

