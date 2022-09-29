package com.mop.qa.test.regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.mop.qa.pageobject.StraitsTimes_IOS;
import com.mop.qa.testbase.TestBase;

public class Article_Listing_Page extends TestBase {

	StraitsTimes_IOS STobj  = null;


	@AfterMethod
	public void Launch_and_Close_app() throws Exception{
		appiumDriver.closeApp();
		appiumDriver.launchApp();
	}



	@Test(priority = 1)     
	public void Sprint12_TC_7965_article_Listing_Page_share_via_author_Share() throws Exception{
		STobj  = toSelectTools();

		STobj .TC_7965_article_Listing_Page_share_via_author_Share();


	}


	@Test(priority = 2)     
	public void Sprint12_TC_7966_Article_listing_page_Via_Elastic_search_Share() throws Exception{
		STobj  = toSelectTools();

		STobj .TC_7966_Article_listing_page_Via_Elastic_search_Share();


	}


	@Test(priority = 3)     
	public void Sprint12_TC_8000_Article_listing_page_Via_Section_pages_Share() throws Exception{
		STobj  = toSelectTools();

		STobj .TC_8000_Article_listing_page_Via_Section_pages_Share();


	}


}
