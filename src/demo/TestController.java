package demo;

import java.util.HashMap;
import java.util.Map;

import com.jfinal.core.Controller;

public class TestController extends Controller {
     public void index(){
    	 setAttr("ss","�л����嵽����Σ�յ�ʱ��");
    	 render("/test/index.html");
     }
     
     public void so(){
    	 Map<String ,String> map=new HashMap<String,String>();
    	 map.put("ddd", "sfsdf");
    	 map.put("dfd", "dgffd");
    	 renderJson(map);
     }
     public void mobile(){
    	 render("mobile.html");
     }
     public void typeof(){
    	 render("typeof.html");
     }
     public  void welcome(){
    	 render("welcome.html");
     }
}
