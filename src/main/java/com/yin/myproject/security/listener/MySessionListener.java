package com.yin.myproject.security.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent envent) {
		System.out.println("HttpSessionEvent 创建"+envent.getSession());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent envent) {
		System.out.println("HttpSessionEvent 销毁"+envent.getSession());
	}
}
