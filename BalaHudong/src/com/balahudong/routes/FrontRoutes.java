package com.balahudong.routes;

import com.balahudong.controller.IndexController;
import com.balahudong.controller.LoginCheckController;
import com.jfinal.config.Routes;

public class FrontRoutes extends Routes{
	@Override
	public void config() {
		add("/", IndexController.class);
		add("/login", LoginCheckController.class);
	}
}
