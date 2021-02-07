package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString
@Component("per1")
//@PropertySource(value = "com/nt/commons/myFile.properties")
//@PropertySource(value = "com/nt/commons/myFile2.properties")


@PropertySource(value = {"com/nt/commons/myFile.properties","com/nt/commons/myFile2.properties"})
public class Person1 {
    @Value("${per.id}")
	private String pid;
    @Value("${per.name}")
	private String pname;
    @Value("${per.age}")
	private String age;
    @Value("${os.name}")
    private String os;
    @Value("${Path}")
    private String path;
}
