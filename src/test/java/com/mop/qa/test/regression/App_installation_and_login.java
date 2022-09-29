package com.mop.qa.test.regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.mop.qa.pageobject.StraitsTimes_IOS;
import com.mop.qa.testbase.TestBase;

public class App_installation_and_login extends TestBase {

	StraitsTimes_IOS STobj  = null;

 	
//	@AfterMethod
	public void Launch_and_Close_app() throws Exception{
		appiumDriver.closeApp();
		appiumDriver.launchApp();
	}
	
	
	@Test(priority = 1)     
	public void Sprint12_TC_7980_Splash_screen_Verify_user_is_able_to_see_the_splash_screen() throws Exception{
		STobj  = toSelectTools();
		
		    	STobj .TC_7980_Splash_screen_Verify_user_is_able_to_see_the_splash_screen();


	}
	
	@Test(priority = 2)     
	public void Sprint12_TC_7931_App_Installation_App_name_should_be_Straits_Times() throws Exception{
		STobj  = toSelectTools();
		
		    	STobj .TC_7931_App_Installation_App_name_should_be_Straits_Times();


	}

	@Test(priority = 3)     
	public void Sprint12_TC_7987_Login_MOE_User_Full_subscriber() throws Exception{
		STobj  = toSelectTools();
		
		    	STobj .TC_7987_Login_MOE_User_Full_subscriber();


	}
	
	@Test(priority = 4)     
	public void Sprint12_TC_7894_Latest_Tab_Should_be_able_to_share() throws Exception{
		STobj  = toSelectTools();
		
		    	STobj .TC_7894_Latest_Tab_Should_be_able_to_share();


	}
	
	@Test(priority = 5)     
	public void Sprint12_TC_7965_article_Listing_Page_share_via_author_Share() throws Exception{
		STobj  = toSelectTools();
		
		    	STobj .TC_7965_article_Listing_Page_share_via_author_Share();


	}

	
	@Test(priority = 6)     
	public void Sprint12_TC_7966_Article_listing_page_Via_Elastic_search_Share() throws Exception{
		STobj  = toSelectTools();
		
		    	STobj .TC_7966_Article_listing_page_Via_Elastic_search_Share();


	}
	

	@Test(priority = 7)     
	public void Sprint12_TC_8000_Article_listing_page_Via_Section_pages_Share() throws Exception{
		STobj  = toSelectTools();
		
		    	STobj .TC_8000_Article_listing_page_Via_Section_pages_Share();


	}
	
	@Test(priority = 8)     
	public void Sprint12_TC_7950_Article_Details_page_Ads() throws Exception{
		STobj  = toSelectTools();
		
		    	STobj .TC_7950_Article_Details_page_Ads();


	}


	


}
