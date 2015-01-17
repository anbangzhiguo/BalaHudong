package com.balahudong.routes;

import com.balahudong.controller.SendMessageController;
import com.jfinal.config.Routes;

public class RemoteRoutes extends Routes{

	@Override
	public void config() {
		add("/sendMessage", SendMessageController.class);		
	}

}
