package com.tutorialspoint;

public class HelloWorld {
	
	private String message;
	public HelloWorld() {
		message = "Not yet set";
	}
	
	public void SetMessage(String message) {
		this.message = message;
	}
	
	public void showMessage() {		
		System.out.println(this.message);		
	}
	
}
