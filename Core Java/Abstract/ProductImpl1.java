package com.evergent.corejava.Abstract;

public class ProductImpl1 extends Product{	
	//We cannot create object of abstract class but we can create reference to it. 
	
	public void newProduct() {
		System.out.println("New Product");
	}
	
	public void show() {
		System.out.println("Local method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Product prod = new Product();
		Product pr = new ProductImpl1();
		pr.newProduct();
	}


}
