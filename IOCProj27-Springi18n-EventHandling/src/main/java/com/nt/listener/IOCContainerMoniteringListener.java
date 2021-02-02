package com.nt.listener;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCContainerMoniteringListener implements ApplicationListener{
	private long start,end;

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event.toString().contains("RefreshedEvent")) {
			System.out.println("ApplicationContext -IOC container is started:"+new Date());
			start= System.currentTimeMillis();
		}
		else if(event.toString().contains("ClosedEvent")) {
			System.out.println("ApplicationContext-IOC container is stopped:"+new Date());
			end = System.currentTimeMillis();
			System.out.println("The ApplicationContext container is running mode for:"+(end-start)+"ms");
		}
	}

}
