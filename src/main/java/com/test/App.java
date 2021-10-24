package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(//factory design
				 "spring.xml" );

		EmployeeBean employee = (EmployeeBean) context.getBean("employee");
		EmployeeBean employee1 = (EmployeeBean) context.getBean("employee"); //by default spring beans are singleton in scope
		System.out.println(employee == employee1);
		System.out.println(employee.getFullName());

		employee.applyJob();
//		System.out.println(employee.getDepartmentBean().getDeptName());

	}
}
