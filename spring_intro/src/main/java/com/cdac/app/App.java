package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.Calculator;
import com.cdac.component.Car;
import com.cdac.component.CurrencyConvertor;
import com.cdac.component.HelloWorld;
import com.cdac.component.Login;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		HelloWorld hw= (HelloWorld) ctx.getBean("hello");
		System.out.println(hw.sayHello("Anurag"));
		
		System.out.println("------------------------------------------");
		
	//	Calculator c=(Calculator) ctx.getBean("calc"); First Way
		
		Calculator c=ctx.getBean("calc",Calculator.class);
		System.out.println(c.add(50, 20));
		System.out.println(c.sub(50, 20));
		
		System.out.println("------------------------------------------");
		CurrencyConvertor cc=new CurrencyConvertor();
		System.out.println(cc.convert("USD", "INR", 650));
		System.out.println(cc.convert("GBP", "INR", 650));
		
		System.out.println("------------------------------------------");
		Car car = (Car) ctx.getBean("car");
		car.drive();
		
		Login login=(Login) ctx.getBean("login");
		System.out.println(login.isValidUser("anuvanjare", "Anu@358"));
		
		
	}

}
