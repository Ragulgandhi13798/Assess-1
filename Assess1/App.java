package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/confi.xml");
        Student s = (Student) context.getBean("std");
        System.out.println(s.getId());
        System.out.println(s.getSubject());
        System.out.println(s.getPhone());
        System.out.println(s.getMarks());
    }
}
