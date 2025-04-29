package com.tns.sriindu.basics.typesofvar;

public class TypeOfVar {
	
	//instance variable 
	int num1;
	TypeOfVar(int num1){
		this.num1=num1;
	}
	//static variable
	static int num3;
	void display() {
		//local variable
		int num2=40;
		System.out.println("the instance variable is"+num1);
		System.out.println("the local variable is "+num2);
		System.out.println("the static variable is "+num3);
	}
	
	//type casting ==high-low
	//int x=10;
	//short y=short(x);
	
	//local variables are belong to only that method,when we create a obj and call that method then it executes 
	//when we declare instance variables we can give values through object ,because instance means it related to objects not the local variables
	//we can use instance variables in function ,also,when we pass value it reflects that value
	//static variables are which are declared as static ,means if we want same name for different objects we declare it as static and access via class name 
	//used for static memory management

}
