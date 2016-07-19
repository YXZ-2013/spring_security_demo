package com.yin.myproject.security.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyHttpSessionAttrributeListener implements HttpSessionListener, HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("session attribute add:" + event.getName() + " " + event.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("session attribute remove:" + event.getName() + " " + event.getValue());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("session attribute replace:" + event.getName() + " " + event.getValue());
	}

	@Override
	public void sessionCreated(HttpSessionEvent envent) {
		System.out.println("HttpSessionEvent 创建" + envent.getSession());
		HttpSession session = envent.getSession();
		session.setAttribute("123", "123");
		session.setAttribute("123", "345");
		session.removeAttribute("123");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent envent) {
		System.out.println("HttpSessionEvent 销毁" + envent.getSession());
	}

}
