package com.balahudong.controller;

import com.balahudong.interceptors.LoginCheckInerceptors;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

@Before(LoginCheckInerceptors.class)
public class LoginCheckController extends Controller{
	public void index(){
		render("/WEB-INF/pages/main.html");
	}
}
