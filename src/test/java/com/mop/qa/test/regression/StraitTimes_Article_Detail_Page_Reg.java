package com.mop.qa.test.regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mop.qa.pageobject.StraitTimesIOS;
import com.mop.qa.testbase.TestBase;

public class StraitTimes_Article_Detail_Page_Reg extends TestBase {

	StraitTimesIOS STIOS  = null;


	@AfterMethod
	public void Launch_and_Close_app() throws Exception{
		appiumDriver.closeApp();
		appiumDriver.launchApp();
	}

	@Test(priority=1)
	public void Sprint12_TC_8002_Article_Headline() throws Exception{
		STIOS=selectTools4();

		STIOS.Sprint12_TC_8002_Article_Headline();


	}

	@Test(priority=2)
	public void Sprint12_TC_7973_Article_Detail_Page_BookMark() throws Exception{
		STIOS=selectTools4();


		STIOS.Sprint12_TC_7973_Article_Detail_Page_BookMark();


	}
	@Test(priority=4)
	public void Sprint12_TC_7956_Article_Detail_Page_AuthorHead() throws Exception{
		STIOS=selectTools4();



		STIOS.Sprint12_TC_7956_Article_Detail_Page_AuthorHead();


	}

	@Test(priority=5)
	public void Sprint12_TC_7979_Article_Detail_Page_AuthorHead_Author_Page() throws Exception{
		STIOS=selectTools4();


		STIOS.Sprint12_TC_7979_Article_Detail_Page_AuthorHead_Author_Page();

	}

	@Test(priority=6)
	public void Sprint12_TC_7995_Article_Detail_Page_AuthorHead_Designation() throws Exception{
		STIOS=selectTools4();

		STIOS.Sprint12_TC_7995_Article_Detail_Page_AuthorHead_Designation();


	}

	@Test(priority=7)
	public void Sprint12_TC_7983_Article_Detail_Page_More_On_This_Topic() throws Exception{
		STIOS=selectTools4();


		STIOS.Sprint12_TC_7983_Article_Detail_Page_More_On_This_Topic();


	}

	@Test(priority=8)
	public void Sprint12_TC_7984_Article_Detail_Page_More_From_StraitTimes() throws Exception{
		STIOS=selectTools4();


		STIOS.Sprint12_TC_7984_Article_Detail_Page_More_From_StraitTimes();


	}


	@Test(priority=9)
	public void Sprint12_TC_7952_Article_Detail_Page_More_From_Web() throws Exception{
		
		STIOS=selectTools4();
		STIOS.Sprint12_TC_7952_Article_Detail_Page_More_From_Web();

	}


	@Test(priority=10)
	public void Sprint12_TC_7981_Article_Details_page_Published_or_Updated() throws Exception{
		
		STIOS=selectTools4();
		STIOS.Sprint12_TC_7981_Article_Details_page_Published_or_Updated();

	}

	@Test(priority=11)
	public void Sprint12_TC_7951_Share_with_without_scrolling() throws Exception{
	
		STIOS=selectTools4();
		STIOS.Sprint12_TC_7951_Share_with_without_scrolling();

	}

	@Test(priority=12)
	public void Sprint12_TC_7961_Article_details_page_with_embedded_image() throws Exception{
	
		STIOS=selectTools4();
		STIOS.Sprint12_TC_7961_Article_details_page_with_embedded_image();
	}

	@Test(priority=13)
	public void Sprint12_TC_7968_Article_details_page_Podcast_sharing() throws Exception{

		STIOS=selectTools4();
		STIOS.Sprint12_TC_7968_Article_details_page_Podcast_sharing();

	}

	@Test(priority=14)
	public void Sprint12_TC_7512_Article_listing_page_via_section_page_bookmark() throws Exception{
		
		STIOS=selectTools4();
		STIOS.Sprint12_TC_7512_Article_listing_page_via_section_page_bookmark();

	}

	@Test(priority=15)
	public void Sprint12_TC_7971_Article_listing_page_via_section_pages_more_link_on_sectionpage() throws Exception{
		
		STIOS=selectTools4();
		STIOS.Sprint12_TC_7971_Article_listing_page_via_section_pages_more_link_on_sectionpage();

	}

	@Test(priority=16)
	public void Sprint12_TC_7949_epaper_Auto_DL_turn_Off() throws Exception{
		
		STIOS=selectTools4();
		STIOS.Sprint12_TC_7949_epaper_Auto_DL_turn_Off();
		
	}

	@Test(priority=17)
	public void Sprint12_TC_7893_epaper_clear_all_download() throws Exception{		
		
		STIOS=selectTools4();
		STIOS.Sprint12_TC_7893_epaper_clear_all_download();

	}
	/*@Test(priority=18)
	public void Sprint12_TC_7907_epaper_Delete_Individual(){
		STIOS=selectTools4();
		try {
			STIOS.Terms();

			STIOS.Sprint12_TC_7907_epaper_Delete_Individual();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}*/
	@Test
	public void TC_7904_Bookmark_Swipe_left_to_delete_bookmark() throws Exception{
		
		STIOS=selectTools4();
		STIOS.TC_7904_Bookmark_Swipe_left_to_delete_bookmark();

	}

	@Test
	public void TC_8005_Article_Listing_Page_Via_authors_Authorspage() throws Exception{
		
		STIOS=selectTools4();
		STIOS.TC_8005_Article_Listing_Page_Via_authors_Authorspage();

	}

	@Test
	public void TC_7992_Article_Listing_Page_Via_authors_Bookmark() throws Exception{
		
		STIOS=selectTools4();
		STIOS.TC_7992_Article_Listing_Page_Via_authors_Bookmark();

	}
}
