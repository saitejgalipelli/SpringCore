package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer implements ApplicationContextAware {
	private String name;
	private int jerseyNo;
	private String beanId;// to just CricketBat obj bean id
	private ApplicationContext ctx;

	public Cricketer() {
		System.out.println("Cricketer 0-param Constructor");
	}

	public void setName(String name) {
		System.out.println("Cricketer.setName()");
		this.name = name;
	}

	public void setJerseyNo(int jeseryNo) {
		System.out.println("Cricketer.setJeseryNo()");
		this.jerseyNo = jeseryNo;
	}

	public void setBeanId(String beanId) {
		System.out.println("Cricketer.setBeanId()");
		this.beanId = beanId;
	}
	// It is the method of ApplicationContextAware injection not a setter method
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
       System.out.println("Cricketer.setApplicationContext()"); 
       this.ctx=ctx;
	}
	public void bowling() {
		System.out.println("Cricketer.bowling()");
		System.out.println("Mr." + name + " with having jerseyNo " + jerseyNo + " is bowling");
	}

	public void feilding() {
		System.out.println("Cricketer.feilding()");
		System.out.println("Mr." + name + " with having jerseyNo " + jerseyNo + " is feilding");
	}

	public void batting() {
		System.out.println("Mr." + name + "  with having jerseyNo " + jerseyNo + " is batting");
		// DependencyLookup to get CricketBat object only in the batting
		// create an extra IOC container
		CricketBat bat = ctx.getBean(beanId, CricketBat.class);
		// use CricketBat object
		int score = bat.scoreRuns();
		System.out.println("Cricket runs are  " + score);

	}


}
