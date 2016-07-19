package com.yin.myproject.security.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("当前请求销毁" + sre.getServletRequest().getServletContext().getContextPath());
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("当前请求创建" + sre.getServletRequest().getServletContext().getContextPath());
	}

}
