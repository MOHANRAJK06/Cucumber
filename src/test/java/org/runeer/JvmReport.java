package org.runeer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	 public static void GeneratJvmreport(String jvm) {
			

				File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\jvm");
				
				Configuration con = new Configuration(f,"Bobs Application");
				
				con.addClassifications("BrowserName", "CH");
				
				con.addClassifications("Browseverson", "107");
				
				List <String>  li = new ArrayList <String> ();
				
				li.add(jvm);
				
				ReportBuilder r = new ReportBuilder(li,con);
				
				r.generateReports();
		}


}
