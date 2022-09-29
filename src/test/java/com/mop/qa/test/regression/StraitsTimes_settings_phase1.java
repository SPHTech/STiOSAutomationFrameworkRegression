package com.mop.qa.test.regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.mop.qa.pageobject.StraitsTimes_IOS;
import com.mop.qa.testbase.TestBase;

public class StraitsTimes_settings_phase1 extends TestBase {

	StraitsTimes_IOS STobj = null;

	public void SanityTestSuite() throws Exception {
		STobj = selectTools2();
	}  
	@Test(priority=0)
	public void ST_Ios_TC_7957_App_Installation_verify_ST_logo() throws Exception {
		try{
			STobj = selectTools2();
			STobj.App_Installation_verify_ST_logo();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@Test(priority=1)
	public void ST_Ios_TC_7945_Settings_LogOut_LogIn_Button_should_display() throws Exception {
		try{
			STobj.Settings_LogOut_LogIn_Button_should_display();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@Test(priority=2)
	public void ST_Ios_TC_8008_Settings_Downloaded() throws Exception {
		try{
			STobj.close_and_open();
			STobj.Settings_Downloaded();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@Test(priority=3)
	public void ST_Ios_TC_7955_Settings_Autom_DL_Epaper() throws Exception {
		try{
			STobj.Settings_Autom_DL_Epaper();
		} catch (Exception e) {
			System.out.println(e);
		}
	} 
	@Test(priority=4)
	public void ST_Ios_TC_7941_Settings_News_Letters() throws Exception {
		try{    
			STobj.close_and_open();
			STobj.Settings_Version();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test(priority=5)
	public void ST_Ios_TC_7989_Settings_PrivacyPolicy() throws Exception {
		try{
			STobj.Settings_PrivacyPolicy();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@Test(priority=6)
	public void ST_Ios_TC_8013_Settings_Terms_Condition() throws Exception {
		try{
			STobj.Settings_Terms_Condition();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@Test(priority=7) 
	public void ST_Ios_TC_8007_Settings_Version_Number() throws Exception {
		try {
			STobj.Settings_Version_Number();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@Test(priority=8)
	public void ST_Ios_TC_7974_Settings_FAQS_and_HELP() throws Exception {
		try {
			STobj.Settings_FAQS_and_HELP();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@Test(priority=9)
	public void ST_Ios_TC_7991_Settings_Advertising_Inquiry() throws Exception {
		try{
			STobj.Settings_Advertising_Inquiry();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	@Test(priority=10)
	public void ST_Ios_TC_7958_Text_Size() throws Exception {
		try{	
			STobj.close_and_open();
			STobj.Settings_Text_Size();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


}
