package com.mop.qa.test.regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.mop.qa.pageobject.StraitsTimes_IOS;
import com.mop.qa.testbase.TestBase;

public class Articles_detail_page extends TestBase {

	StraitsTimes_IOS STobj  = null;

 	
//	@AfterMethod
	public void Launch_and_Close_app() throws Exception{
		appiumDriver.closeApp();
		appiumDriver.launchApp();
	}
	
	 
	
	@Test(priority = 1)     
	public void Sprint12_TC_7950_Article_Details_page_Ads() throws Exception{
		STobj  = toSelectTools();
		
		    	STobj .TC_7950_Article_Details_page_Ads();


	}


	


}
