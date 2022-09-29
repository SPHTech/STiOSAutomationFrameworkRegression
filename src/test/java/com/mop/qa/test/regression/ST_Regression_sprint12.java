package com.mop.qa.test.regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mop.qa.pageobject.StraitTimes_ios_objects;
import com.mop.qa.testbase.TestBase;

public class ST_Regression_sprint12 extends TestBase{
	
	StraitTimes_ios_objects STObj =null;
	@AfterMethod
	public void Launch_and_Close_app() throws Exception{
		appiumDriver.closeApp();
		appiumDriver.launchApp();
	}

	
	
	@Test(priority=0)
	public void Sprint12_TC_7464_7975_7944_ST() {
		STObj=selectTools5();
		try {
			STObj.onboarding();
			STObj.TC_7464_7975_7944_share_from_bookmark_page_should_work();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority=1)
	public void Sprint12_TC_7960_Homepage_UI_navigation_is_fine() {
		STObj=selectTools5();
		try {
			STObj.onboarding();
			STObj.TC_7960_Homepage_UI_navigation_is_fine();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void Sprint12_TC_7932_Homepage_MoreLink() {
		STObj=selectTools5();
		try {
			STObj.onboarding();
			STObj.TC_7932_Homepage_MoreLink();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test(priority=3)
	public void Sprint12_TC_7929_Opinion_Correspontants_articles() {
		STObj=selectTools5();
		try {
			STObj.onboarding();
			STObj.TC_7929_Opinion_Correspontants_articles();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority=4)
	public void Sprint12_TC_7905_LatestTab_navigate_article_page() {
		STObj=selectTools5();
		try {
			STObj.onboarding();
			STObj.TC_7905_LatestTab_navigate_article_page();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority=5)
	public void Sprint12_TC_7969_share_of_epaper_should_work() {
		STObj=selectTools5();
		try {
			STObj.onboarding();
			STObj.TC_7969_share_of_epaper_should_work();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority=6)
	public void Sprint12_TC_7998_emailCustomer() {
		STObj=selectTools5();
		try {
			STObj.onboarding();
			STObj.TC_7998_emailCustomer();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}