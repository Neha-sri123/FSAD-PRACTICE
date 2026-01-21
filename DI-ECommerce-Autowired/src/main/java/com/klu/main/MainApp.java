package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klu.config.AppConfig;
import com.klu.model.Order;

public class MainApp {

	private static ApplicationContext cn;

	public static void main(String[] args) {
		cn = new AnnotationConfigApplicationContext(AppConfig.class);
		Order or=cn.getBean(Order.class);
		or.display();
		
		
		

	}

}