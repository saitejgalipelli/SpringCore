package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString
@Component("per")
public class Person {
    @Value("${per.id}")
	private String pid;
    @Value("saitej")
	private String pname;
    @Value("26")
	private String age;
}
