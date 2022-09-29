package com.mop.qa.test.regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.mop.qa.pageobject.StraitsTimes_IOS;
import com.mop.qa.testbase.TestBase;

public class ST_Epaper extends TestBase {

	StraitsTimes_IOS STobj  = null;

	//@AfterMethod
	public void Launch_and_Close_app() throws Exception{
		appiumDriver.closeApp();
		appiumDriver.launchApp();
	}
	
	 
	
	@Test(priority = 1)     
	public void Sprint12_TC_7900_ePaper_Download_archived_eaper() throws Exception{
		STobj  = toSelectTools();
		
		    	STobj .TC_7900_ePaper_Download_archived_eaper();


	}
	
	@Test(priority = 2)     
	public void Sprint12_TC_7913_ePaper_Read_archived_eaper() throws Exception{
		STobj  = toSelectTools();
		
		    	STobj .TC_7913_ePaper_Read_archived_eaper();


	}


	


}
