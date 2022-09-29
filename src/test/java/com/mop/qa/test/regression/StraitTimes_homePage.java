package com.mop.qa.test.regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.mop.qa.pageobject.StraitsTimes_IOS;
import com.mop.qa.testbase.TestBase;

public class StraitTimes_homePage extends TestBase {

	StraitsTimes_IOS STobj  = null;

 	
//	@AfterMethod
	public void Launch_and_Close_app() throws Exception{
		appiumDriver.closeApp();
		appiumDriver.launchApp();
	}
	
	
	
	@Test(priority = 1)
	public void Sprint11_TC_7924_Verify_user_can_navigate_to_article_page_from_homepage(){
		STobj  = toSelectTools();
		try {
			STobj.close_and_open();
			STobj .TC_7924_Verify_user_can_navigate_to_article_page_from_homepage();


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	@Test(priority = 2)
	public void Sprint11_TC_7978_TabUI(){
		STobj  = toSelectTools();
		try {
			
			STobj .TC_7978_TabUI();


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


}
