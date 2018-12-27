package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
		
public static void main(String args[]) {

	ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
	HelloWorld hw1 = (HelloWorld) ac.getBean("helloworld");
	hw1.SetMessage("Setting with hw1");
	hw1.showMessage();
	HelloWorld hw2 = (HelloWorld) ac.getBean("helloworld");
	
	hw2.showMessage();
}		
	
}
