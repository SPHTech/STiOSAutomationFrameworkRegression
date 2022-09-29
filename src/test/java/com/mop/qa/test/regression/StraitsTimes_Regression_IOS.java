package com.mop.qa.test.regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.mop.qa.pageobject.StraitsTimes_IOS;
import com.mop.qa.testbase.TestBase;

public class StraitsTimes_Regression_IOS extends TestBase {

	StraitsTimes_IOS STobj = null;

 	
	  @Test(priority = 1) public void
	  TC_7909_Tutorials_screen_on_Bookmark_Settings_epaper() throws Exception {
	  
	  STobj = toSelectTools();
	  STobj.close_and_open();
	  STobj.straitsTimes_homepage();
	  
	  STobj.TC_7909_Tutorials_screen_on_Bookmark_Settings_epaper();
	  
	  }
	  
	  
	  @Test(priority = 2) public void
	  TC_7899_Bookmark_able_to_bookmark_from_listing_page() throws Exception {
	  
	  STobj = toSelectTools();
	  
	  STobj.TC_7899_Bookmark_able_to_bookmark_from_listing_page();
	  
	  }
	 

 	@Test(priority = 3)
 	public void TC_7908_Articles_Details_Scroll_Scrolling_through_articles_and_then_for_any_particular_article_try_to_access_full_article_page()
 			throws Exception {
 
 		STobj = toSelectTools();
 		STobj.close_and_open();
 		STobj.TC_7908_Articles_Details_Scroll_Scrolling_through_articles_and_then_for_any_particular_article_try_to_access_full_article_page();
 
 	}
 
 	@Test(priority = 4)
 	public void TC_7919_Article_listing_page_Via_Elastic_search_Article_page() throws Exception {
 
 		STobj = toSelectTools();
 
 		STobj.TC_7919_Article_listing_page_Via_Elastic_search_Article_page();
 
 	}
 
 	@Test(priority = 5)
 	public void TC_7920_ePaper_User_should_be_asked_to_login_to_view_epaper() throws Exception {
 
 		STobj = toSelectTools();
 
 		STobj.TC_7920_ePaper_User_should_be_asked_to_login_to_view_epaper();
 
 	}
 
 	@Test(priority = 6)
 	public void TC_7923_Articles_Details_Scroll_Verify_article_scroll() throws Exception {
 
 		STobj = toSelectTools();
 		STobj.close_and_open();
 		STobj.TC_7923_Articles_Details_Scroll_Verify_article_scroll();
 
 	}
 
 	@Test(priority = 7)
 	public void TC_7927_ePaper_Delete_downloaded_epaper() throws Exception {
 
 		STobj = toSelectTools();
 
 		STobj.TC_7927_ePaper_Delete_downloaded_epaper();
 
 	}
 
 	@Test(priority = 8)
 	public void TC_7928_Article_listing_page_Via_Elastic_search_keyword_search_Recent() throws Exception {
 
 		STobj = toSelectTools();
 
 		STobj.TC_7928_Article_listing_page_Via_Elastic_search_keyword_search_Recent();
 
 	}
 
 	@Test(priority = 9)
 	public void TC_7933_Article_listing_page_Via_Elastic_search_Recent_searches() throws Exception {
 
 		STobj = toSelectTools();
 		STobj.close_and_open();
 		STobj.TC_7933_Article_listing_page_Via_Elastic_search_Recent_searches();
 
 	}
 
 	@Test(priority = 10)
 	public void TC_7942_ePaper_user_should_be_able_to_download_epaper() throws Exception {
 
 		STobj = toSelectTools();
 
 		STobj.TC_7942_ePaper_user_should_be_able_to_download_epaper();
 
 	}
 
 	@Test(priority = 11)
 	public void TC_7946_Article_listing_page_Via_Elastic_search_Search_by_keyword() throws Exception {
 
 		STobj = toSelectTools();
 
 		STobj.TC_7946_Article_listing_page_Via_Elastic_search_Search_by_keyword();
 
 	}
 
 	@Test(priority = 12)
 	public void TC_7947_Article_listing_page_Via_Elastic_search_Search_by_article_headline() throws Exception {
 
 		STobj = toSelectTools();
 		 STobj.close_and_open();
 		STobj.TC_7947_Article_listing_page_Via_Elastic_search_Search_by_article_headline();
 
 	}
 
 	@Test(priority = 13)
 	public void TC_7954_Article_listing_page_Via_Elastic_search_Recent_searches_Delete() throws Exception {
 
 		STobj = toSelectTools();
 
 		STobj.TC_7954_Article_listing_page_Via_Elastic_search_Recent_searches_Delete();
 
 	}
 
 	@Test(priority = 14)
 	public void TC_7982_Article_listing_page_Via_Elastic_search_Keyword_search_Relevance() throws Exception {
 
 		STobj = toSelectTools();
 
 		STobj.TC_7977_Article_listing_page_Via_Elastic_search_Keyword_search_Relevance();
 
 	}
 
 	@Test(priority = 15)
 	public void TC_7977_Article_listing_page_Via_Elastic_search_Search_by_Category_Show_more_Less() throws Exception {
 
 		STobj = toSelectTools();
 
 		STobj.TC_7977_Article_listing_page_Via_Elastic_search_Search_by_Category_Show_more_Less();
 
 	}
 
 	@Test(priority = 16)
 	public void TC_7994_Article_listing_page_Via_Elastic_search_Search_by_Category() throws Exception {
 
 		STobj = toSelectTools();
 
 		STobj.TC_7994_Article_listing_page_Via_Elastic_search_Search_by_Category();
 
 	}

	
	  @Test(priority = 17) public void TC_7952_Article_Details_page_More_from_Web()
	  throws Exception {
	  
	  STobj = toSelectTools(); STobj.TC_7952_Article_Details_page_More_from_Web();
	  STobj.close_and_open();
	  
	  }
	 
	  @Test(priority = 18) public void
	  TC_7911_Latest_Tab_Should_should_load_without_errors() throws Exception {
	  
	  STobj = toSelectTools();
	  STobj.TC_7911_Latest_Tab_Should_should_load_without_errors();
	  
	  }
	  
	  @Test(priority = 19) public void
	  TC_7901_Latest_Tab_Should_be_able_to_bookmark() throws Exception {
	  
	  STobj = toSelectTools();
	  STobj.TC_7901_Latest_Tab_Should_be_able_to_bookmark();
	  
	  }
	  
	  @Test(priority = 20) public void TC_8009_straitTimes_login_reg_user_() throws
	  Exception {
	  
	  STobj.TC_8009_straitTimes_login_reg_user_();
	  
	  }
	  
	  @Test(priority = 21) public void
	  TC_7915_Bookmark_Enable_Disable_bookmark_from_listing_and_Article_detail_page
	  () throws Exception {
	  
	  STobj.
	  TC_7915_Bookmark_Enable_Disable_bookmark_from_listing_and_Article_detail_page
	  ();
	  
	  }
	  
	  @Test(priority = 22) public void
	  TC_7925_LogIn_ST_Lite_user_should_be_able_to_access_subscribed_article_but_cannot_access_epaper
	  () throws Exception {
	  
	  STobj.
	  TC_7925_LogIn_ST_Lite_user_should_be_able_to_access_subscribed_article_but_cannot_access_epaper
	  (); }
	  
	  @Test(priority = 23) public void TC_7934_LogIn_mysph_Login() throws Exception
	  { STobj.TC_7934_LogIn_mysph_Login();
	  
	  }
	  
	  @Test(priority = 24) public void TC_7903_Discover_Tab() throws Exception {
		  STobj = toSelectTools();
		  STobj.close_and_open();
		  STobj.TC_7903_Discover_Tab();
	  
	  }
	  
	  @Test(priority = 25) public void TC_7897_Discover_on_Home_Page() throws
	  Exception { 
		  STobj = toSelectTools();
		  STobj.close_and_open(); STobj.TC_7897_Discover_on_Home_Page();
	  
	  }
	 

	
	  @Test(priority = 26) public void
	  TC_7953_Article_Listing_page_via_Sections_page() throws Exception {
	  STobj.close_and_open(); STobj.TC_7953_Article_Listing_page_via_Sections_page();
	  
	  }
	  
	  @Test(priority = 27) public void
	  TC_7937_Article_Listing_page_via_Sections_page_Article_page() throws
	  Exception {
	  
	  STobj.TC_7937_Article_Listing_page_via_Sections_page_Article_page();
	  
	  }
	 
	  @Test(priority = 28) public void
	  TC_7926_Article_Listing_page_via_Sections_page_videos() throws Exception {
	  
	  STobj.TC_7926_Article_Listing_page_via_Sections_page_videos();
	  
	  }
	 
 
 	
 	

}
