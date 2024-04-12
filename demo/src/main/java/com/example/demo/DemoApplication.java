package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
//		ConfigurableListableBeanFactory beanFactory = run.getBeanFactory();
//		Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
//		while (beanNamesIterator.hasNext())
//			System.out.println(beanNamesIterator.next());
	}
}