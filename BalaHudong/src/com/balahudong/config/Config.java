package com.balahudong.config;

import java.util.Properties;

import com.balahudong.controller.IndexController;
import com.balahudong.controller.LoginCheckController;
import com.balahudong.controller.SendMessageController;
import com.balahudong.routes.AdminRoutes;
import com.balahudong.routes.FrontRoutes;
import com.balahudong.routes.RemoteRoutes;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;

public class Config extends JFinalConfig {

	public Properties loadProp(String pro, String dev) {
		try {
			return loadPropertyFile(pro);
		} catch (Exception e) {
			return loadPropertyFile(dev);
		}
	}

	@Override
	public void configConstant(Constants me) {
		loadProp("a_little_config_pro.txt", "a_little_config.txt");
		me.setDevMode(getPropertyToBoolean("devMode", false));
		me.setDevMode(me.getDevMode());
	}

	@Override
	public void configRoute(Routes me) {
		me.add(new AdminRoutes());
		me.add(new FrontRoutes());
		me.add(new RemoteRoutes());
	}

	@Override
	public void configPlugin(Plugins me) {

	}

	@Override
	public void configInterceptor(Interceptors me) {

	}

	@Override
	public void configHandler(Handlers me) {

	}

}
