package demo;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;

public class Config extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		    me.setDevMode(true);

	}

	@Override
	public void configRoute(Routes me) {
		me.add("/test",TestController.class);
		

	}

	@Override
	public void configPlugin(Plugins me) {
		System.out.println("aa");
		System.out.println("sss");
		System.out.println("ssss");
		System.out.println("");
        System.out.println("fff");
		System.out.println("");
        System.out.println("gggggggg");
		


	}

	@Override
	public void configInterceptor(Interceptors me) {
		

	}

	@Override
	public void configHandler(Handlers me) {
		

	}
	
	public static  void main(String [] args){
		JFinal.start("WebRoot", 8001, "/", 5);
	}

}
