package com.balahudong.interceptors;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

public class LoginCheckInerceptors implements Interceptor{
	@Override
	public void intercept(ActionInvocation ai) {
		
		System.out.println("Before action invoking");
		ai.invoke();
		System.out.println("After action invoking");
	}

}
