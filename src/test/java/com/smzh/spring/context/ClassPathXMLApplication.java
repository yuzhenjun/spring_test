/**
 * 
 */
package com.smzh.spring.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jun
 *
 */
public class ClassPathXMLApplication {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpa=new ClassPathXmlApplicationContext("classpath:");
		cpa.getBean("aa");
	}

}
