package com.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore1/confi1.xml");
         Employee e =  (Employee) context.getBean("emp1");
         System.out.println(e.getId());
         System.out.println(e.getName());
         System.out.println(e.getAddress().getCity());
         System.out.println(e.getAddress().getStreet());
         System.out.println(e.getAddress().getPincode());
         System.out.println(e);
	}

}
