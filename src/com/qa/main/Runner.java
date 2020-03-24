package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		HelloWorld1 helloWorld1 = new HelloWorld1();
		helloWorld1.printHelloWorld();
		
		HelloWorld2 helloWorld2 = new HelloWorld2();
		helloWorld2.printHelloWorld();
		
		HelloWorld3 helloWorld3 = new HelloWorld3();
		helloWorld3.printString("Hello World! 3");
		
		HelloWorld4 helloWorld4 = new HelloWorld4();
		System.out.println(helloWorld4.returnString("Hello World! 4"));
	}

}
