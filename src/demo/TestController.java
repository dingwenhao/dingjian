package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;

import oecp.framework.util.FileUtil;

public class TestController extends Controller {
     public void index(){
    	 setAttr("ss","中华民族到了最危险的时刻");
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
     public void  settime(){
    	 render("jishi.html");
     }
     public void Online(){
    	 render("online.html");
    	
     }
     public void ex(){
    	 render("excel.htm");
     }
     public void  excel() throws FileNotFoundException, IOException{
    	 UploadFile u=getFile("eee","D://hello");
    	 String extention=FileUtil.getExtention(u.getFileName());
    	 Workbook wb=null;
    	 if(extention.equalsIgnoreCase("xls")){
 			wb=new HSSFWorkbook(new FileInputStream(u.getFile()));
 		}else{
 			wb = new XSSFWorkbook(new FileInputStream(u.getFile()));
 		}
    	 Sheet sheet=wb.getSheetAt(0);
    	 List<Row> rows=new ArrayList<Row>();
 		System.out.println(sheet.getLastRowNum()+">>>>>>>");
 		for(int i=0;i<sheet.getLastRowNum();i++){
 			Row row=sheet.getRow(i);
 			
 			System.out.println(row.getCell(1));
 		}
 		render("excel.htm");
     }
     
}
