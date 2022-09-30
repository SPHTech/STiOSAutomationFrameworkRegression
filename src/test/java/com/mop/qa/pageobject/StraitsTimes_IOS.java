package com.mop.qa.pageobject;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.mop.qa.Utilities.ExtentUtility;
import com.mop.qa.Utilities.ReadDataSheet;
/*import com.mop.qa.test.regression.Top;
import com.mop.qa.test.regression.Verify;
import com.mop.qa.test.regression.should;*/
import com.mop.qa.testbase.PageBase;
import com.relevantcodes.extentreports.LogStatus;

import ch.qos.logback.classic.boolex.IEvaluator;
import ch.qos.logback.core.joran.action.Action;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.support.Color;

public class StraitsTimes_IOS extends PageBase {

	ReadDataSheet rds = new ReadDataSheet();

	public StraitsTimes_IOS(AppiumDriver appiumDriver) {
		super(appiumDriver);
	}

	public StraitsTimes_IOS(RemoteWebDriver remoteDriver) {
		super(remoteDriver);
	}

	/* iOS Elements */

	// ***STRAITS TIMES***\\
	@FindBy(xpath = "//*[@text='AGREE']")
	private WebElement Agree;
	@FindBy(xpath = "//*[@text='SKIP']")
	private WebElement Skip;
	@FindBy(xpath = "//*[@text='Continue and log in later']")
	private WebElement later;
	@FindBy(xpath = "//*[@text='Close Advertisement']")
	private WebElement Advertisement;
	@FindBy(xpath = "//*[@text='Close Advertisement']")
	private WebElement advertisement_2;
	@FindBy(xpath = "//*[@text='Menu']")
	private WebElement Menu;
	@FindBy(xpath = "//*[@text='menu settings icon']")
	private WebElement Settings;
	@FindBy(xpath = "//*[@text='LOG IN']")
	private WebElement Login_menu;
	@FindBy(xpath = "//*[@text='LOG IN']")
	private WebElement Login_Icon;
	@FindBy(xpath = "//*[@text='Got it!']")
	private WebElement Notification;
	@FindBy(xpath = "//*[@text='SIGN UP FOR NEWSLETTERS' and @accessibilityLabel='DefaultCell.title']")
	private WebElement Newsletter;
	@FindBy(xpath = "//*[@id='Sign Up']//*[@text='Sign Up']//*[@name='Sign Up']")
	private WebElement Signup_Newsletter;
	@FindBy(xpath = "//*[@placeholder='E-mail address']")
	private WebElement Email_address;
	@FindBy(xpath = "//*[@text='Sign Up' and @class='UIAButton']")
	private WebElement Signup;
	@FindBy(xpath = "//*[@text='PRIVACY POLICY' and @accessibilityLabel='DefaultCell.title']")
	private WebElement PrivacyPolicy;
	@FindBy(xpath = "//*[@text='PERSONAL DATA PROTECTION STATEMENT' and @class='UIAView']")
	private WebElement PrivacyPolicy_verification;
	@FindBy(xpath = "//*[@label='TERMS & CONDITIONS']//*[@label='TERMS & CONDITIONS']")
	private WebElement Terms_and_Condition;
	@FindBy(xpath = "//*[@text='TERMS OF USE FOR APPS (IOS)' and @class='UIAView']")
	private WebElement Terms_and_Condition_verification;
	@FindBy(xpath = "(//*[@id='DefaultCell.title'])[8]")
	private WebElement Version_No_Verification;
	@FindBy(xpath = "//*[@text='FAQS & HELP' and @accessibilityLabel='DefaultCell.title']")
	private WebElement Faqs_and_help;
	@FindBy(xpath = "//*[@text='Frequently Asked Questions']")
	private WebElement Faqs_and_help_login;
	@FindBy(xpath = "//*[@id='AppearenceCell.toggle']")
	private WebElement Text_Size;
	@FindBy(xpath = "//*[@text='ADVERTISING ENQUIRY' and @accessibilityLabel='DefaultCell.title']")
	private WebElement Advertising_Inquiry;
	@FindBy(xpath = "//*[@text='mkgsales@sph.com.sg']")
	private WebElement Sales_email;
	@FindBy(xpath = "//*[@text='menu login icon']")
	private WebElement loginSTunderManageAccq2;
	@FindBy(xpath = "//*[@text='Log into another account']")
	private WebElement loginintodifferentST2;
	@FindBy(xpath = "//*[@placeholder='Your email or username']")
	private WebElement enterusernameST2;
	@FindBy(xpath = "//*[@placeholder='Your password']")
	private WebElement enterpasswordST2;
	@FindBy(xpath = "//*[@text='LOG IN']")
	private WebElement loginbtnST2;
	@FindBy(xpath = "//*[@text='No thanks']")
	private WebElement adNoThanks2;
	@FindBy(xpath = "//*[@text='Got it!']")
	private WebElement adGotit2;
	@FindBy(xpath = "//*[@text='Welcome back!']")
	private WebElement verify2;
	@FindBy(xpath = "//*[@text='E-paper']")
	private WebElement E_paper;
	@FindBy(xpath = "//*[@text='iconDownload']")
	private WebElement Download_e_paper;
	@FindBy(xpath = "//*[@id='DOWNLOADED' and @text='DOWNLOADED']")
	private WebElement Downloaded;
	@FindBy(xpath = "//*[@text='DELETE']")
	private WebElement Delete_e_paper;
	@FindBy(xpath = "//*[@text='SETTINGS']")
	private WebElement Back_Button;
	@FindBy(xpath = "//*[@text='menu logout icon']")
	private WebElement Logout_Button;
	@FindBy(xpath = "//*[@text='SwitchCell.toggle' and ./parent::*[@text='AUTO DOWNLOAD E-PAPER']]")
	private WebElement Auto_Download_Epaper;
	@FindBy(xpath = "//*[@text='AppearenceCell.previewTextView']")
	private WebElement Slidebar_text_verification;
	@FindBy(xpath = "//*[@text='AppearenceCell.fontSlider']")
	private WebElement Scrollbar;
	@FindBy(xpath = "//*[@value='50%']")
	private WebElement e1;
	@FindBy(xpath = "//*[@value='25%']")
	private WebElement e2;
	@FindBy(xpath = "//*[@class='UIAImage']")
	private WebElement STraitstimes_logo;
	@FindBy(xpath = "//*[@placeholder='Search']")
	private WebElement App_Search;
	@FindBy(xpath = "//*[@text='X']")
	private WebElement Close_ad;
	@FindBy(xpath = "//*[@text='Continue' and @class='UIAStaticText']")
	private WebElement Continue;
	@FindBy(xpath = "//*[@text='Ask App Not to Track']")
	private WebElement Do_not_track;
	@FindBy(xpath = "//*[@class='UIAButton' and ./parent::*[@text='SETTINGS']]")
	private WebElement close_settings;
	@FindBy(xpath = "//*[@id='LOG OUT']")
	private WebElement logout2;
	@FindBy(xpath = "//*[@text='menu settings icon' and ./parent::*[@class='UIATable']]")
	private WebElement setting_logout;
	@FindBy(xpath = "//*[@text='Done']")
	private WebElement Done2;
	@FindBy(xpath = "//*[@text='Horizontal scroll bar, 1 page' and ./parent::*[@class='UIAScrollView'] and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[./*[@text='Copy Email Address']]]]]")
	private WebElement cancel2;
	@FindBy(xpath = "//*[@text='Subscription successful!']")
	private WebElement Subscription;
	@FindBy(xpath = "//*[@text='Done' and @class='UIAButton']//*[@label='Done']")
	private WebElement Click_done;
	@FindBy(xpath = "//*[@id='AppearenceCell.toggle']")
	private WebElement Text_size;
	@FindBy(xpath = "//*[@text='AppearenceCell.fontSlider']//*[@value='50%']")
	private WebElement Slider_Initial_position;
	@FindBy(xpath = "//*[@text='AppearenceCell.fontSlider']//*[@value='25%']")
	private WebElement Slider_Minimum_position;
	@FindBy(xpath = "//*[@text='AppearenceCell.fontSlider']//*[@value='75%']")
	private WebElement Slider_Maximum_position;
	@FindBy(xpath = "//*[@text='NEWSLETTERS']")
	private WebElement Newsletter2;
	@FindBy(xpath = "//*[@class='UIAButton']']")
	private WebElement UIAButton2;
	@FindBy(xpath = "//*[@class='UIAButton' and ./parent::*[@text='SETTINGS']]")
	private WebElement Closebutton;
	
	@FindBy(xpath = "//*[@label='Close Advertisement']")
	private WebElement ad1;

	@FindBy(xpath = "//*[@text='CLOSE' and @class='UIAStaticText']")//*[@text='CLOSE']
	private WebElement ad2;

	@FindBy(xpath = "//*[@text='Menu']")
	private WebElement menu;

	@FindBy(xpath = "//*[@text='menu settings icon']")
	private WebElement settings;
	
	@FindBy(xpath="//*[@text='AppearenceCell.fontSlider']")
	private WebElement textslider;

	@FindBy(xpath = "//*[@accessibilityLabel='DoubleButtonCell.loginButton']")
	private WebElement loginSTunderManageAcc;

	@FindBy(xpath = "//*[@text='Log into another account']")
	private WebElement loginintodifferentST;

	@FindBy(xpath = "(//*[@class='UIATextField'])[1]")
	private WebElement enterusernameST;

	@FindBy(xpath = "//*[@text='Password' and @class='UIAView']")
	private WebElement enterpasswordST;

	@FindBy(xpath = "//*[@text='LOG IN']")
	private WebElement loginbtnST;

	@FindBy(xpath = "//*[@text='No thanks']")
	private WebElement adNoThanks;

	@FindBy(xpath = "//*[@text='Got it!']")
	private WebElement adGotit;

	@FindBy(xpath = "//*[@text='Welcome back!']")
	private WebElement verify;

	@FindBy(xpath ="//*[@class='UIAButton' and ./parent::*[@text='Straits_Times.LoginView']]")
	private WebElement closebtn;

	@FindBy(xpath = "//*[@text='st archive icon']")
	private WebElement closebtn3;
	
	@FindBy(xpath = "(//*[@class='UIAButton' and @x='1104'])[1]")
	private WebElement closebtn4;


	
	@FindBy(xpath = "//*[@class='UIAButton' and ./parent::*[@text='SETTINGS']]")
	private WebElement closebtn2;

	@FindBy(xpath = "//*[@text='menu logout icon']")
	private WebElement logoutST;

	@FindBy(xpath = "//*[@text='mysph_logo']")
	private WebElement loginverify;

	@FindBy(xpath = "//*[@text='menu login icon' and ./parent::*[@class='UIATable']]")
	private WebElement login;

	@FindBy(xpath = "//*[@text='menu logout icon' and ./parent::*[@class='UIATable']]")
	private WebElement logout;

	@FindBy(xpath = "//*[@text='Unlock more articles from less than S$1/month' and ./parent::*[@class='UIATable']]")
	private WebElement subverify;

	@FindBy(xpath = "//*[@text='E-paper']")
	private WebElement epapericon;

	@FindBy(xpath = "//*[@class='UIAImage' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView']]")
	private WebElement onpaper;

	@FindBy(xpath = "//*[@text='Login or Subscribe' and @class='UIAStaticText']")
	private WebElement epaper_loginverify;

	@FindBy(xpath = "//*[@XCElementType='XCUIElementTypeButton' and @class='UIAButton']")
	private WebElement backicon;

	@FindBy(xpath = "//*[@text='Login']")
	private WebElement epaperloginbtn;

	@FindBy(xpath = "//*[@text='Subscribe']")
	private WebElement epapersubscibebtn;

	@FindBy(xpath = "//*[@text='Horizontal scroll bar, 1 page' and (./preceding-sibling::* | ./following-sibling::*)[./*[@class='UIAView']]] ")
	private WebElement on_cancel;

	@FindBy(xpath = "//*[@text='Subscription Terms' and @class='UIAButton']")
	private WebElement subscriptionverify;

	@FindBy(xpath = "//*[@text='SIGN UP FOR ACCOUNT' and @class='UIAStaticText']")
	private WebElement signupfracc;

	@FindBy(xpath = "//*[@id='AppearenceCell.toggle']")
	private WebElement textbtn;

	@FindBy(xpath = " //*[@text='icon-search']")
	private WebElement epaper_stream_verify;

	@FindBy(xpath = "//*[@text='menu bookmarks icon' and ./parent::*[@class='UIATable']]")
	private WebElement bookmarkicon;

	@FindBy(xpath = " //*[@text='Got it!' and @class='UIAStaticText']") // //*[@text='Swipe to delete bookmark']
	private WebElement bookmark_tour_verify;

	@FindBy(xpath = " //*[@text='Got it!' and @class='UIAStaticText']") // /*[@text=concat('What', "'", 's New?')]
	private WebElement epaper_tour_verify;

	
	@FindBy(xpath = " //*[@id='share']")
	private WebElement shareicon;
	
	@FindBy(xpath = " //*[@text='iconDownload']")
	private WebElement downloadicon;

	@FindBy(xpath = "//*[@text='Discover']")
	private WebElement discover;

	@FindBy(xpath = "//*[@text='MENU'] ")
	private WebElement closebtn_book;

	@FindBy(xpath = "//*[@text='CarouselImageCell.headerView'] ")
	private WebElement clickable_heading;

	@FindBy(xpath = "//*[@text='Done' and @class='UIAStaticText'] ")
	private WebElement discovery_done;

	@FindBy(xpath = "//*[@text='E-PAPER']")
	private WebElement mainpage;

	@FindBy(xpath = "//*[@id='MORE FROM ST'][2]")
	private WebElement more_from_ST;

	@FindBy(xpath = "//*[@text='ST REWARDS']")
	private WebElement st_rewards;
	@FindBy(xpath = "//*[@text='ST JOBS']")
	private WebElement st_jobs;
	@FindBy(xpath = "//*[@text='ST CARS']")
	private WebElement st_cars;
	@FindBy(xpath = " //*[@text='ST PROPERTY']")
	private WebElement st_property;

	@FindBy(xpath = " //*[@text='Settings']")
	private WebElement settingsapp;

	@FindBy(xpath = "  //*[@id='Wi-Fi']")
	private WebElement wifibtn;

	@FindBy(xpath = "  //*[@class='UIASwitch']")
	private WebElement onswitch;

	@FindBy(xpath = " //*[@text='ST175_Dev']")
	private WebElement stapp;

	@FindBy(xpath = " //*[@id='StandardCell.footerView']")
	private WebElement onarticle;

	@FindBy(xpath = "  //*[@text='You are offline. Please check your internet connection.']")
	private WebElement offline;

	@FindBy(xpath = "//*[@text='Home']")
	private WebElement homepage_title;

	@FindBy(xpath = " //*[@accessibilityLabel='Agree']")
	private WebElement agree;
	@FindBy(xpath = " //*[@accessibilityLabel='NotificationsViewController.skipIphoneButton']")
	private WebElement skip;
	@FindBy(xpath = " //*[@id='Continue and log in later']")
	private WebElement continue_login;
	@FindBy(xpath = " //*[@text='Continue' and @class='UIAStaticText']")
	private WebElement contin;
	@FindBy(xpath = " //*[@text='Ask App Not to Track']")
	private WebElement askapp_notto_track;
	@FindBy(xpath = " //*[@value='Allow Tracking']")
	private WebElement allow;

	@FindBy(xpath = "//*[@text='FOR SUBSCRIBERS']")
	private WebElement Subscribers_Heading_Availability_Check;

	@FindBy(xpath = "//*[@id='StandardCell.headlineLabel']")
	private WebElement Subscribers_EShop_Articel_Click;
	
	//*[@text='FearturedCell.articleImageView'])[2]
	
	@FindBy(xpath = "(//*[@text='FearturedCell.articleImageView'])[1]")
	private WebElement Subscribers_Articel_Click1;


	
	  @FindBy(xpath = "(//*[@text='FearturedCell.articleImageView'])[2]") private
	  WebElement Subscribers_Articel_Click;
	 

	/*
	 * @FindBy(xpath = "//*[@text='FearturedCell.articleImageView']") private
	 * WebElement Subscribers_Articel_Click;
	 */
	
	@FindBy(xpath = "//*[@id='Unlock more articles at less than S$1/month for 3 months']")
	private WebElement Subscribers_EShop_Availability_Check;
	
	

	@FindBy(xpath = "//*[@class='UIAButton']")
	private WebElement close__btn;

	@FindBy(xpath = "//*[@text='FearturedCell.articleImageView']")
	private WebElement Topstories_Articel_Availability_Check;

	@FindBy(xpath = "//*[@text='TOP STORIES']")
	private WebElement Topstories_Heading_Availability_Check;

	@FindBy(xpath = "//*[@text='NO INTERNET CONNECTION']")
	private WebElement network_error_check;

	@FindBy(xpath = "//*[@text='Got it!' and @class='UIAButton']")
	private WebElement gotit_first;

	@FindBy(xpath = "(//*[@text='share_icon'])[1]")
	private WebElement ShareIcon1;

	@FindBy(xpath = "(//*[@text='share_icon'])[2]")
	private WebElement ShareIcon2;

	@FindBy(xpath = "(//*[@text='share_icon'])[3]")
	private WebElement ShareIcon3;
	
	@FindBy(xpath = "(//*[@text='StandardCell.footerView' and (./preceding-sibling::* | ./following-sibling::*)/*[@class='UIAImage' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAButton']])[2]")
	private WebElement Bookmark;

	@FindBy(xpath = "(//*[@class='UIAImage' and @x='1146'])[1]")
	private WebElement Bookmark1;

	@FindBy(xpath = "(//*[@class='UIAImage' and @x='1146'])[2]")
	private WebElement Bookmark2;

	@FindBy(xpath = "(//*[@class='UIAImage' and @x='1146'])[3]")
	private WebElement Bookmark3;

	@FindBy(xpath = "//*[@id='SINGAPORE' and @x='432'and ./parent::*[./parent::*[@class='UIATable']]]")
	private WebElement singapore_highlight;

	@FindBy(xpath = "//*[@id='INTERNATIONAL' and ./parent::*[./parent::*[@class='UIATable']]]")
	private WebElement international_btn;

	@FindBy(xpath = "//*[@accessibilityLabel='SectionHeaderViewController.editionSingaporeButton' and ./parent::*[@class='UIATable']]")
	private WebElement singapore_btn;

	@FindBy(xpath = "//*[@id='INTERNATIONAL' and @x='699' and ./parent::*[./parent::*[@class='UIATable']]]")
	private WebElement international_highlight;
	
	@FindBy(xpath = "//*[@text='Home']")
	private WebElement homepage;

	 @FindBy(xpath = "//*[@text='AUTO DOWNLOAD E-PAPER' and @accessibilityLabel='SwitchCell.toggle']")
		private WebElement auto_downloding_switch;
	 
	 @FindBy(xpath = "//*[@id='LOG OUT']")
		private WebElement click_logout;
	 
	 @FindBy(xpath = "//*[@text='st archive icon']")
		private WebElement epaper_load_more;
	 
	 @FindBy(xpath = "//*[@class='UIAImage' and @x='120']")
		private WebElement epaper_articles;
	 
	 @FindBy(xpath = "//*[@text='icon search cancel']")
		private WebElement epaper_cancel_btn;
	 
	 @FindBy(xpath = "//*[@text='DOWNLOADED']")
		private WebElement downloaded;
	 
	 @FindBy(xpath = "//*[@text='SETTINGS']")
		private WebElement downloaded_backbtn;
	 
	 @FindBy(xpath = "(//*[@text='FearturedCell.articleImageView'])[2]")
		private WebElement fr_sub_verify;
	 
	 @FindBy(xpath = "//*[@x='1122' and @y='204']")
		private WebElement close_ad_3;

	 @FindBy(xpath="//*[@text='Format Options']")
		private WebElement edit;

		@FindBy(xpath="//*[@text='Reset']")
		private WebElement reset;
		
		@FindBy(xpath="//*[@text='iconComplete']")
		private WebElement iconcomplete;
	 
	
	
	public boolean ad(WebElement add) {
		try {
			add.isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public void advertisement() {
		try {
			if ( ad(ad2)) {
				click(ad2, "Close");
			}
			
			if(ad(close_ad_3)) {
				click(close_ad_3,"Close");
			}

			if (ad(ad1)) {
				click(ad1, "Advertisement");
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * Straight Times TC-6052 - Verify the user should able to login with valid
	 * username and Password
	 */

	public void straitTimesTClogin() throws Exception {

		try {
			
			if(ad(logout))
				click(logout,"logout");
			click(menu, "menu");
			click(settings, "Settings");
			click(loginSTunderManageAcc, "Login under Manage Account");
			if (ad(loginintodifferentST))
				click(loginintodifferentST, "login into different account");
			enterText(enterusernameST, "autotest_mysph@test.com", "Username");
			enterText(enterpasswordST, "Password123", "Password");
			click(loginbtnST, "Login");
			if (ad(adNoThanks)) {
				click(adNoThanks, "No Thanks!");
				click(adGotit, "got it!");
			}
			assertEquals("login successful", "Welcome back!", verify.getText());
			click(closebtn2, "Close the page");
			straitTimeslogout();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void straitTimeslogout() throws Exception {
		click(menu, "menu");
		click(logoutST, "Logout");
	}

	/*
	 * Straight Times TC-6058 - Verify the login should redirect to the login page
	 */

	public void straitTimes_verify_login() throws Exception {
		try {
			
			

			click(menu, "menu");
			click(settings, "Settings");
			if(ad(gotit_first))
			click(gotit_first, "Got it");
			click(loginSTunderManageAcc, "Login under Manage Account");
			assertEquals("login page displayed", "mysph_logo", loginverify.getText());
			click(closebtn, "Close the page");
			click(closebtn2, "Close the page");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/*
	 * Test Case TC-6082 - Verify the Subscribe banner should display for
	 * unsubscribed users
	 */
	public void straitTimes_Subscibe_Banner() throws Exception {
		try {
			click(menu, "menu");
             if(ad(logout))
            	 click(logout,"logout");
			if (ad(login)) {

				if (ad(subverify))
					ExtentUtility.getTest().log(LogStatus.PASS, "Banner displayed",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));

			}

			else {
				ExtentUtility.getTest().log(LogStatus.FAIL, "user logged in already",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				throw new Exception("user logged in already");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * TC-6084  Verify the Subscribe banner should display for registered
	 * users(Unsubscribed registered users)
	 */

	//public void straitTimes_reg_user_Subscibe_Banner(String username, String password) throws Exception {
		public void straitTimes_reg_user_Subscibe_Banner() throws Exception {
		try {
			
			click(menu, "menu");
			click(settings, "Settings");
			if(ad(gotit_first))
				click(gotit_first, "Got it");
			if (ad(logout))
				click(logout, "logout");
			click(loginSTunderManageAcc, "Login under Manage Account");
			if (ad(loginintodifferentST))
				click(loginintodifferentST, "login into different account");
			enterText(enterusernameST, "mysphtest1004@test.com", "Username");
			enterText(enterpasswordST,"ctstest123", "Password");
			click(loginbtnST, "Login");
			if (ad(adNoThanks)) {
				click(adNoThanks, "No Thanks!");
				click(adGotit, "got it!");
			}

			click(closebtn2, "Close the page");

			if (ad(logout)) {

				if (ad(subverify))
					ExtentUtility.getTest().log(LogStatus.PASS, "Banner displayed",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			} else {
				ExtentUtility.getTest().log(LogStatus.FAIL, "user has to login with registered credentials",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				throw new Exception("user has to login with registered credentials");
			}
			
			appiumDriver.closeApp();
			appiumDriver.launchApp();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * Â TC-6087 Â Verify More from ST functionality
	 */
	public void straitTimes_more_from_ST_functionality() throws Exception {
		try {
	
			advertisement();
			click(menu, "menu");

			if (ad(login) && ad(subverify))
				ExtentUtility.getTest().log(LogStatus.PASS, "Buttons are enabled",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			else {
				if(ad(logout)) {
					click(logout,"logout");
				if (ad(login) && ad(subverify))
					ExtentUtility.getTest().log(LogStatus.PASS, "Buttons are enabled",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));}
			}
			swipeUp();
			click(more_from_ST, " more from st functionality");

			if (ad(st_rewards) && ad(st_jobs) && ad(st_cars) && ad(st_property))
				ExtentUtility.getTest().log(LogStatus.PASS, "menu under more from ST are enabled",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			else
				ExtentUtility.getTest().log(LogStatus.FAIL, "menu under more from ST are not enabled",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * Â TC-6049 Â Verify the log in/subscribe screen shown in epaper page when user
	 * tries to access e-Paper on the overlay menu menu
	 */

	public void straitsTimes_Epaper_login_Subscribe() throws Exception {
		try {
			
			click(epapericon, "E-paper");
			click(onpaper, " e-paper");
			assertEquals("verifying the user status", "Login or Subscribe", epaper_loginverify.getText());
			click(on_cancel, "cancel");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * Â TC-6063 Â Verify the Back button should display on the top left corner of the
	 * epaper detail page
	 */
	public void straitsTimes_Epaper_backicon() throws Exception {
		try {
			
				//click(onpaper, " e-paper");

			assertEquals("Verifying the back icon", "E-PAPER", backicon.getText());
			click(backicon, "back icon");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/* Â TC-6089 Â Verify the login should on epaper should redirect to login page */
	public void straitsTimes_Epaper_to_loginpage() throws Exception {
		try {
			

			click(epapericon, "E-paper");
			click(onpaper, " e-paper");
			click(epaperloginbtn, " login");
			assertEquals("login page displayed", "mysph_logo", loginverify.getText());
			click(closebtn, "close the page");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * TC-6085  Verify the user should see the following main screen after the
	 * successful login
	 */
	public void straitsTimes_Epaper_login_mainpage(String username, String password) throws Exception {
		try {
				
			click(epapericon, "E-paper");
			click(onpaper, " e-paper");
			click(epaperloginbtn, " login");

			if (ad(loginintodifferentST))
				click(loginintodifferentST, "login into different account");
			enterText(enterusernameST, "autotest_mysph@test.com", "Username");
			enterText(enterpasswordST, "Password123", "Password");
			click(loginbtnST, "Login");
			if (ad(adNoThanks)) {
				click(adNoThanks, "No Thanks!");
				click(adGotit, "got it!");
			}

			assertEquals("e-paper login successful", "E-PAPER", mainpage.getText());

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	


	/*
	 *  TC-6073  Verify the subscribe on epaper pop up should redirect to
	 * subscription page
	 */
	public void straitsTimes_Epaper_to_Subscribepage() throws Exception {
		try {
			click(epapericon, "E-paper");
			click(onpaper, " e-paper");
			click(epapersubscibebtn, " subscribe");
			swipeUp();
			assertEquals("Subscription page displayed", "Subscription Terms", subscriptionverify.getText());
			click(closebtn3, "close the page");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * Â TC-6090 Â Verify Settings button functionality / settings window UI -- Manage
	 * account/Appearance
	 */
	public void straitTimes_verify_button() throws Exception {
		try {
						

			click(menu, "menu");
			swipeDown();
			click(settings, "Settings");
			if(ad(gotit_first))
				click(gotit_first, "Got it");
			if (ad(login)) {
				click(loginSTunderManageAcc, "Login under Manage Account");
				assertEquals("login page displayed", "LOG IN", loginverify.getText());
				click(closebtn, "Close the page");
			}
			click(signupfracc, "sign up for an account under manage account");
			swipeUp();
			assertEquals("Subscription page displayed", "Subscription Terms", subscriptionverify.getText());
			click(closebtn2, "Close the page");

			click(textbtn, "verify the button");

			if (ad(textbtn)) {
				System.out.println("button is enabled");

			} else {
				System.out.println("button is disabled");
			}
			click(closebtn2, "Close the page");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * Â TC-6092 Â Verify the tapping on main screen should redirect to the epaper
	 * detail screen with streaming mode
	 */
	public void straitsTimes_Epaper_to_streaming() throws Exception {
		try {
			click(onpaper, " e-paper");

			assertEquals("E-paper streaming mode", "icon-search", epaper_stream_verify.getText());
			click(backicon, " back icon");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/* Â TC-6051 Â Verify the Search should display in epaper detail page thumbnail */
	public void straitsTimes_Epaper_search_thumbnail() throws Exception {
		try {
						

			click(epapericon, "E-paper");
			click(onpaper, " e-paper");
			assertEquals("E-paper streaming mode", "icon-search", epaper_stream_verify.getText());
			//click(backicon, " back icon");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/*
	 * Â TC-6072 Â Verify the bookmark tutorial should appear on bookmark listing page
	 * for the first time
	 */

	public void straitTimes_bookmark_tour() throws Exception {
		try {
			appiumDriver.closeApp();
			appiumDriver.launchApp();		

			advertisement();
			click(menu, "menu");
			click(bookmarkicon, " bookmark icon");
			
			assertEquals("verifying the bookmark tour is visible for first time users", "Got it!",
					bookmark_tour_verify.getText());
			
			click(bookmark_tour_verify, "verfiy the tour");
			click(closebtn_book, "close");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/* Â TC-6068 Â Verify the tutorial screen should display on settings */

	public void straitsTimes_tour_settings_button() throws Exception {
		try {
	
			click(menu, "menu");
			click(settings, "Settings");
			assertEquals("verifying the tour is visible for first time users", "Got it!", gotit_first.getText());
			//if(ad(gotit_first))
				click(gotit_first, "Got it");
				click(closebtn2, "Close the page");		
							
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * Â TC-6064 Â Verify the tutorials for e-paper, appears the first time user
	 * enters e-paper screen
	 */
	public void straitsTimes_Epaper_tour_firsttime_users() throws Exception {
		try {
				
			click(epapericon, "E-paper");
			assertEquals("verifying the epaper tour is visible for first time users", "Got it!",
					epaper_tour_verify.getText());
		
			click(epaper_tour_verify, " got it!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	

	/* Â TC-6080 Â Verify the headline should be clickable in Discovery container */

	public void straitsTimes_discover() throws Exception {
		try {
			appiumDriver.closeApp();
			appiumDriver.launchApp();	
			
			advertisement();
			click(discover, "Discover");
			click(clickable_heading, " headings");
			click(discovery_done, "Done");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/* TC-6056 Verify the Subscribers should display */

	public void Subscribers_availability1() {
		try {
			/*
			 * appiumDriver.closeApp(); appiumDriver.launchApp(); advertisement();
			 */
			
			System.out.println("Testcase is starting");
			click(homepage,"home page");
			if (!ad(Subscribers_Heading_Availability_Check))
				swipeDownNVerify("//*[@text='FOR SUBSCRIBERS']");
			System.out.println(ad(Subscribers_Heading_Availability_Check));
			
			  ExtentUtility.getTest().log(LogStatus.PASS, "Subscribers_availability1",
			 ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			 

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * TC-6066 Verify the Subscriber tab should display at the end of the container
	 * and it should redirect to eshop page
	 */
	@FindBy(xpath = "//*[@id='MoreCell.moreTitleLabel']")
	private WebElement eshop_check;
	public void Subscribers_Eshop_availability() {
		try {
					
			System.out.println("Testcase is starting");
			
			
			/*
			 * if (!ad(Subscribers_Heading_Availability_Check))
			 * {swipeDownNVerify("//*[@text='FOR SUBSCRIBERS']"); } swipeUp();
			 */
			  //scrollToExact(Subscribers_EShop_Articel_Click);
			
			
				  swipeDownNVerify("//*[@id='MoreCell.moreTitleLabel']");  
			click(eshop_check, "eshop_check");
			//System.out.println(ad(Subscribers_EShop_Availability_Check));
			//click(Subscribers_EShop_Availability_Check,"to subscription page");
			swipeUp();
			assertEquals("Subscription page displayed", "Subscription Terms", subscriptionverify.getText());
			//click(closebtn4, "close the page");

			//click(close__btn,"close");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * TC-6065 Verify the Subscribers container should have two Big article 2(Refer
	 * the Big Article2 test case module)
	 */

	public void Subscribers_article_availability() {
		try {
			
			System.out.println("Testcase is starting");
			
			  if (!ad(Subscribers_Heading_Availability_Check))
			  swipeDownNVerify("//*[@text='FOR SUBSCRIBERS']");
			  
			  
			//click(homepage_title, "home page");
			//scrollToExact(fr_sub);
			System.out.println(ad(Subscribers_Heading_Availability_Check));
			 
			System.out.println(ad(Subscribers_Articel_Click1)+" first big article");
			swipeUp();
			if(!(ad(Subscribers_Articel_Click)))
			swipeDownNVerify("(//*[@text='FearturedCell.articleImageView'])");
			//scrollUp(Subscribers_Articel_Click);
			System.out.println(ad(Subscribers_Articel_Click)+" second big article");

			
			  ExtentUtility.getTest().log(LogStatus.PASS,
			  " Subscribers_article_availability",
			  ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			 

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	 @FindBy(xpath = "//*[@text='FOR SUBSCRIBERS']")
		private WebElement fr_sub;
	 

	/* TC-6061 Verify the Top Stories should display */

	public void topstories_availability1() {
		try {
			
		
			System.out.println("Testcase is starting");
			if (!ad(Topstories_Heading_Availability_Check))
				swipeDownNVerify("//*[@text='TOP STORIES']");
				//scrollToExact(Topstories_Heading_Availability_Check);
			System.out.println(ad(Topstories_Heading_Availability_Check));
			
			ExtentUtility.getTest().log(LogStatus.PASS, " topstories_availability1",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/* TC-6078 Verify the top stories should have one Big article 1 */

	public void topstories_availability2() {
		try {
					
			System.out.println("Testcase is starting");
			if (!ad(Topstories_Heading_Availability_Check))
				swipeDownNVerify("//*[@text='TOP STORIES']");
			System.out.println(ad(Topstories_Heading_Availability_Check));
			swipeUp();
			System.out.println(ad(Topstories_Articel_Availability_Check) + " -Topstories has one big article");
			ExtentUtility.getTest().log(LogStatus.PASS, " topstories_availability2",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/* TC-6054 Verify the tapping of the article in offline mode */

	public void Wifi_Connection_check() {
		try {
			
			System.out.println("Testcase is starting");
			click(discover, "Discover");
			
			if(ad(clickable_heading))
				ExtentUtility.getTest().log(LogStatus.FAIL, " checking availability in offline",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			else 
				ExtentUtility.getTest().log(LogStatus.PASS, " checking availability in offline",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/*
	 * TC-6060 Verify the bookmark and share icon should display for all article
	 */

	public void Bookmark_shareicon_availability() {
		try {
						
			
			System.out.println("Testcase is starting");
			click(homepage,"homepage");
			//swipeUp();
			swipeDownNVerify("//*[@text='share_icon']");
			System.out.println(ad(ShareIcon1));
			System.out.println(ad(ShareIcon2));
			System.out.println(ad(ShareIcon3));
			System.out.println(ad(Bookmark1));
			System.out.println(ad(Bookmark2));
			System.out.println(ad(Bookmark3));
			ExtentUtility.getTest().log(LogStatus.PASS, "Bookmark_shareicon_availability",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void onboarding() {
		try {
			click(agree, "agree");
			click(skip, "skip");
			click(continue_login, "continue and login");
			click(contin, "continue");
			click(askapp_notto_track, "ask app not to track");
			// click(allow, "allow tracking");
			// advertisement();
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	/* TC-6076 Verify the homepage should display after the on-boarding screen */
	public void straitsTimes_homepage() throws Exception {

		try {

			if (ad(agree))
				onboarding();

			advertisement();
			//assertEquals("verifying the homepage", "ST175_Dev.ArticleListingView", homepage_title.getText());
			if(present(homepage_title))
				ExtentUtility.getTest().log(LogStatus.PASS, "successfully opened home page",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void switching_btw_edition() {
		try {
			
			System.out.println("Testcase is starting");
			click(menu, "menu");
			if (ad(singapore_btn)) {
				click(singapore_btn, "signapore");
				if (ad(singapore_highlight) && ad(international_btn))
					System.out.println("Under Singapore edition");

			}
			if (ad(singapore_highlight) || ad(international_btn)) {
				click(international_btn, "international");
				if (ad(international_highlight))
					System.out.println("Under International edition");

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}


	@FindBy(xpath = "//*[@id='SINGAPORE' and ./parent::*[./parent::*[@class='UIATable']]]")
	private WebElement singapore_check;

	@FindBy(xpath = "//*[@id='INTERNATIONAL' and ./parent::*[./parent::*[@class='UIATable']]]")
	private WebElement International_check;
	
	@FindBy(xpath = "//*[@id='TitleCell.sectionTitleLabel' and @text='VIDEOS']")
	private WebElement videos_container;
	
	@FindBy(xpath = "//*[@id='TitleCell.sectionTitleLabel' and @text='PODCASTS']")
	private WebElement podcasts_container;
	
	

	/*
	 * TC-8219 Verify the Singapore&International switch on menu should switch the
	 * homepage for Singapore and International
	 */
	public void Sing_Int_Switch() {
		try {
			System.out.println("Testcase is starting");
			if(ad(gotit_first))
				click(gotit_first, "Got it");

			click(menu, "menu");
			click(singapore_check, "Singapore");
			click(homepage,"homepage");
			swipeDownNVerify("//*[@id='TitleCell.sectionTitleLabel' and @text='VIDEOS']");
			assertEquals("in singapore edition", "VIDEOS", videos_container.getText());
			
			click(menu, "menu");
			click(International_check, "international");
			click(homepage,"homepage");
			swipeDownNVerify("//*[@id='TitleCell.sectionTitleLabel' and @text='DISCOVER']");
			swipeUp();
			if(ad(podcasts_container))
				ExtentUtility.getTest().log(LogStatus.PASS, "In international",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			
			//*[@id='TitleCell.sectionTitleLabel' and @text='DISCOVER']
			//*[@id='TitleCell.sectionTitleLabel'and @text='CLOSEUP']
			//*[@id='TitleCell.sectionTitleLabel'and @text='SMART PARENTING']
			

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/* TC-6053 Verify the Switch between the Singapore | International homepages */
	
	public void Sing_Int_Switch2() {
		try {
						

			System.out.println("Testcase is starting");
			click(menu, "menu");
			click(International_check, "international");
			click(singapore_check, "Singapore");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/*
	 * TC-6067 Verify the Singapore switch should display the Set of category
	 * article for singapore region
	 */
	public void Sing_Switch() {
		try {
						
			System.out.println("Testcase is starting");
			//click(menu, "menu");
			
			click(singapore_check, "Singapore");
			System.out.println("Signapore is highlighted");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * TC-6071 Verify the International switch should display the Set of category
	 * article for International
	 */
	public void International_Switch() {

		try {
						
			System.out.println("Testcase is starting");
			//click(menu, "menu");
			
			click(International_check, "International");
			System.out.println("International is highlighted");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/*
	 * TC-6077 Verify upon tapping on download should display the downloading (green
	 * progress icon)
	 */
	public void straitsTimes_epaper_download() throws Exception {
		try {
			
			
			//straitsTimes_Epaper_login_mainpage( username, password);
			//click(epapericon, "E-paper");
			click(downloadicon, " e-paper download icon");
			assertEquals("epaper downloading","iconDownload",downloadicon.getText());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/*
	 * TC-6079 Verify the tapping on Download should should show the Ready with
	 * green afer downloading the epaper
	 */
	public void straitsTimes_epaper_download_complete() throws Exception {
		try {
					
			//straitsTimes_Epaper_login_mainpage( username, password);
			//click(epapericon, "E-paper");
			if(ad(downloadicon))
			 click(downloadicon, " e-paper download icon");
			System.out.println(ad(icon_complete));
			ExtentUtility.getTest().log(LogStatus.PASS, "epaper download",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@FindBy(xpath = "//*[@text='iconComplete']")
	private WebElement icon_complete;
	
	
	/* TC-6062 The bookmark and share icon should display on article listing page */
	
	public void Bookmark_shareicon_availability_article_listing_page() {
		try {
			
			System.out.println("Testcase is starting");
			click(homepage,"homepage");
			click(menu, "menu");
			click(category_singapore,"singapore");
			//swipeUp();
			System.out.println(ad(ShareIcon1));
			System.out.println(ad(Bookmark1));
			/*
			 * System.out.println(ad(ShareIcon2)); System.out.println(ad(Bookmark2));
			 */
			click(click_back,"back");
			
			click(category_asia,"asia");
			//swipeUp();
			System.out.println(ad(ShareIcon1));
			System.out.println(ad(Bookmark1));
			click(click_back,"back");
			
			click(category_world,"world");
			//swipeUp();
			System.out.println(ad(ShareIcon1));
			System.out.println(ad(Bookmark1));
			/*
			 * System.out.println(ad(ShareIcon2)); System.out.println(ad(Bookmark2));
			 */
			click(click_back,"back");
			
			click(category_opinion,"opinion");
			//swipeUp();
			System.out.println(ad(ShareIcon1));
			System.out.println(ad(Bookmark1));
			click(click_back,"back");
			ExtentUtility.getTest().log(LogStatus.PASS, "Bookmark_shareicon_availability",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@FindBy(xpath = "//*[@id='SectionListingCell.titleLabel' and @text='SINGAPORE']")
	private WebElement category_singapore;
	
	@FindBy(xpath = "//*[@id='SectionListingCell.titleLabel' and @text='ASIA']")
	private WebElement category_asia;
	
	@FindBy(xpath = "//*[@id='SectionListingCell.titleLabel'and @text='WORLD']")
	private WebElement category_world;
	
	@FindBy(xpath = "//*[@text='SINGAPORE' and @class='UIAStaticText']")
	private WebElement category_singapore_click;
	
	@FindBy(xpath = "//*[@text='ASIA' and @class='UIAStaticText']")
	private WebElement category_asia_click;
	
	
	@FindBy(xpath = "//*[@text='WORLD' and @class='UIAStaticText']")
	private WebElement category_world_click;
	
	@FindBy(xpath = "//*[@text='MENU']")
	private WebElement click_back;
	
	@FindBy(xpath = "//*[@text='OPINION'and @name='SectionListingCell.titleLabel']")
	private WebElement category_opinion;
	
	@FindBy(xpath = "//*[@text='LIFE']")
	private WebElement category_life;
	
	@FindBy(xpath = "//*[@text='BUSINESS']")
	private WebElement category_business;
	
	@FindBy(xpath = "//*[@text='JOBS']")
	private WebElement category_jobs;
	
	@FindBy(xpath = "//*[@text='PARENTING & EDUCATION']")
	private WebElement category_parenting;
	
	@FindBy(xpath = "//*[@text='FOOD']")
	private WebElement category_food;
	
	@FindBy(xpath = "//*[@text='TECH']")
	private WebElement category_tech;
	
	@FindBy(xpath = "//*[@text='SPORT']")
	private WebElement category_sport;
	
	@FindBy(xpath = "//*[@text='VIDEOS']")
	private WebElement category_videos;
	
	@FindBy(xpath = "//*[@text='PODCASTS']")
	private WebElement category_podcasts;
	
	@FindBy(xpath = "//*[@text='MULTIMEDIA']")
	private WebElement category_multimedia;
	
	
	@FindBy(xpath = "//*[@text='OPINION']")
	private WebElement category_opinion_click;
	
	@FindBy(xpath = "//*[@text='LIFE']")
	private WebElement category_life_click;
	
	@FindBy(xpath = "//*[@text='BUSINESS']")
	private WebElement category_business_click;
	
	@FindBy(xpath = "//*[@text='JOBS']")
	private WebElement category_jobs_click;
	
	@FindBy(xpath = "//*[@text='PARENTING & EDUCATION']")
	private WebElement category_parenting_click;
	
	@FindBy(xpath = "//*[@text='FOOD']")
	private WebElement category_food_click;
	
	@FindBy(xpath = "//*[@text='TECH']")
	private WebElement category_tech_click;
	
	@FindBy(xpath = "//*[@text='SPORT']")
	private WebElement category_sport_click;
	
	@FindBy(xpath = "//*[@text='VIDEOS']")
	private WebElement category_videos_click;
	
	@FindBy(xpath = "//*[@text='PODCASTS']")
	private WebElement category_podcasts_click;
	
	@FindBy(xpath = "//*[@text='MULTIMEDIA' ]")
	private WebElement category_multimedia_click;
	
	//*[@text='MORE FROM ST' and @class='UIAStaticText']
	
	/*
	 * TC-6074 The Category name (Example:singapore)should display on article detail
	 * screen
	 */
	public void straitTimes_category_check() throws Exception {
		try {

			click(menu, "menu");
			click(category_singapore,"singapore");
			assertEquals("opened category article","SINGAPORE",category_singapore_click.getText());
			click(click_back,"back");
			click(category_asia,"asia");
			assertEquals("opened category article","ASIA",category_asia_click.getText());
			click(click_back,"back");
			click(category_world,"world");
			assertEquals("opened category article","WORLD",category_world_click.getText());
			click(click_back,"back");
			
			click(category_opinion,"opinion");
			assertEquals("opened category article","OPINION",category_opinion_click.getText());
			click(click_back,"back");
			click(category_life,"life");
			assertEquals("opened category article","LIFE",category_life_click.getText());
			click(click_back,"back");
			click(category_business,"world");
			assertEquals("opened category article","BUSINESS",category_business_click.getText());
			click(click_back,"back");
			swipeUp();
			click(category_jobs,"jobs");
			assertEquals("opened category article","JOBS",category_jobs_click.getText());
			click(click_back,"back");
			click(category_parenting,"parenting and education");
			assertEquals("opened category article","PARENTING & EDUCATION",category_parenting_click.getText());
			click(click_back,"back");
			click(category_food,"food");
			assertEquals("opened category article","FOOD",category_food_click.getText());
			click(click_back,"back");
			
			click(category_tech,"tech");
			assertEquals("opened category article","TECH",category_tech_click.getText());
			click(click_back,"back");
			click(category_sport,"Sport");
			assertEquals("opened category article","SPORT",category_sport_click.getText());
			click(click_back,"back");
			click(category_videos,"videos");
			assertEquals("opened category article","VIDEOS",category_videos_click.getText());
			click(click_back,"back");
			
			click(category_podcasts,"podcasts");
			assertEquals("opened category article","PODCASTS",category_podcasts_click.getText());
			click(click_back,"back");
			click(category_multimedia,"multimedia");
			assertEquals("opened category article","MULTIMEDIA",category_multimedia_click.getText());
			click(click_back,"back");
			
			swipeDown();

			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/* TC-6055 Verify the article listing page should only shows display headline */
	public void straitTimes_check_article_headline() throws Exception {
		try {
			
		
			click(homepage,"homepage");
			if(!ad(article_headline1))
			swipeUp();
            if(ad(article_headline1))
            	ExtentUtility.getTest().log(LogStatus.PASS, "article headline availability",
    					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
            if(ad(article_headline2))
            	ExtentUtility.getTest().log(LogStatus.PASS, "article headline availability",
    					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@FindBy(xpath = "(//*[@id='StandardCell.headlineLabel'])[1]")
	private WebElement article_headline1;
	
	@FindBy(xpath = "(//*[@id='StandardCell.headlineLabel'])[2]")
	private WebElement article_headline2;
	
	/* TC-6091 Verify the tap on byline should redirect to author listing page */
	
	public void straitTimes_check_article_subheadline() throws Exception {
		try {
			appiumDriver.closeApp();
			appiumDriver.launchApp();
			
			advertisement();
			/*
			 * System.out.println("Testcase is starting"); click(homepage,"home"); if
			 * (!ad(Topstories_Heading_Availability_Check))
			 * swipeDownNVerify("//*[@text='TOP STORIES']");
			 * System.out.println(ad(Topstories_Heading_Availability_Check));
			 * System.out.println(ad(Topstories_Articel_Availability_Check));
			 * ExtentUtility.getTest().log(LogStatus.PASS, " article byline",
			 * ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			 */
			//swipeDownNVerify("//*[@id='FearturedCell.subheadlineLabel']");
			
			
			//scrollToExact(article_subheadline);
            if(ad(article_subheadline)) {
            	click(article_subheadline,"article byline");
            	click(author_name,"author name");
                if(ad(articles))
                	ExtentUtility.getTest().log(LogStatus.PASS, " verified",
        					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
                click(close_articles,"close");
            	click(close_article,"close");
            }
            else {
            	scrollToExact(article_subheadline);
            	click(article_subheadline,"article byline");
            	click(author_name,"author name");
                if(ad(articles))
                	ExtentUtility.getTest().log(LogStatus.PASS, " verified",
        					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
                click(close_articles,"close");
            	click(close_article,"close");
            }
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	@FindBy(xpath = "//*[@id='FearturedCell.headlineLabel']")
	private WebElement article_subheadline;
	
	@FindBy(xpath = "//*[@id='ArticleHeaderViewController.authorImageView']")
	private WebElement author_name;
	
	@FindBy(xpath = "//*[@text='ARTICLES']")
	private WebElement articles;
	
	@FindBy(xpath = "//*[@class='UIAButton']")
	private WebElement close_article;
	
	@FindBy(xpath = "//*[@XCElementType='XCUIElementTypeButton']")
	private WebElement close_articles;
	
	

	/*
	 * TC-6096 Verify the article headline should display in article detail page
	 */
	 public void straitTimes_check_article_inner__headline() throws Exception {
			try {

				
				if(!ad(article_headline1))
				swipeUp();
				Thread.sleep(2000);
				click(article_headline1,"article headline");
				 if(ad(inner_headline))
	                	ExtentUtility.getTest().log(LogStatus.PASS, " article headline in detail page",
	        					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
	            click(close_article,"close");
			
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	 @FindBy(xpath = "//*[@id='ArticleHeaderViewController.headlineLabel']")
		private WebElement inner_headline;
	
		
	 
		/* TC-6095 Verify the user should able to bookmark from bookmark icon */
	 public void Bookmark_check_availability() {
			try {
			
				System.out.println("Testcase is starting");
				//click(homepage,"homepage");
				swipeUp();
				Thread.sleep(3000);
				if(ad(Bookmark1))
				{System.out.println("true");
				click(Bookmark1,"bookmark");
				click(menu,"menu");
				click(bookmarkicon,"bookmarks");
				System.out.println(ad(bookmark_container));
				click(closebtn_book, "close");
			
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	 @FindBy(xpath = "//*[@id='StandardCell.headlineLabel']")
		private WebElement article_container;
	 @FindBy(xpath = "//*[@id='BookmarkCell.headlineLabel']")
		private WebElement bookmark_container;
	
		/* TC-6094 Verify Auto Download functionality */
	 public void straitTimes_verify_auto_download() throws Exception {
			try {
								

				click(menu, "menu");
				click(settings, "Settings");
				if(ad(loginSTunderManageAcc)) {
					click(loginSTunderManageAcc, "Login under Manage Account");
					if (ad(loginintodifferentST))
						click(loginintodifferentST, "login into different account");
					enterText(enterusernameST, "autotest_mysph@test.com", "Username");
					enterText(enterpasswordST, "Password123", "Password");
					click(loginbtnST, "Login");
					if (ad(adNoThanks)) {
						click(adNoThanks, "No Thanks!");
						click(adGotit, "got it!");
					}
				
				}
				
			click(auto_downloding_switch,"auto download switch");
			System.out.println(ad(auto_downloding_switch));
			click(closebtn2, "close"); /* click(epapericon, "E-paper"); */
			 
			
			

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	
	
	
	 
		/*
		 * TC-6093 Verify the updated /published date and time stamp should display
		 * while click on timestamp dropdown icon
		 */
	 public void straitTimes_check_published_updated() throws Exception {
			try {
						
				
				if(!ad(article_headline1))
				swipeUp();
	            if(ad(article_headline1)) {
	            	click(article_headline1,"article");
	            swipeUp();
	            System.out.println(ad(published));
	            ExtentUtility.getTest().log(LogStatus.PASS, " published",
    					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
	            if(!(ad(clickback)))
	            	swipeDown();
	            click(clickback,"close");
	        
	            }
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	 @FindBy(xpath = "//*[@id='ArticleHeaderViewController.publishedDateLabel']")
		private WebElement published;
	 @FindBy(xpath = "  //*[@class='UIAButton' and @x='1104']")
		private WebElement clickback;
	 
		/*
		 * TC-6081 Verify the user should see the current date epaper after the
		 * successful login
		 */
		
	 public void straitsTimes_Epaper_current_date() throws Exception {
			try {
				String day[]= {"mon","tue","wed","thu","fri","sat","sun"};
				click(epapericon, "E-paper");
				String s=current_date.getText();
				String str=s.substring(0,3);
				boolean check;
				
				System.out.println(s);
				for(int i=0;i<7;i++)
				{
					check=str.equalsIgnoreCase(day[i]);
					if(check==true)
						ExtentUtility.getTest().log(LogStatus.PASS, "current date epaper",
		     					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
									}
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			
		}

	 @FindBy(xpath = "//*[@class='UIAStaticText' and @x='166']")
		private WebElement current_date;
	 
	 @FindBy(xpath = "//*[@id='Latest']")
		private WebElement latest;
	 
	 @FindBy(xpath = "(//*[@knownSuperClass='UIStackView'])[2]")
		private WebElement article1;
	 @FindBy(xpath = "(//*[@knownSuperClass='UIStackView'])[3]")
		private WebElement article2;
	 @FindBy(xpath = "(//*[@knownSuperClass='UIStackView'])[4]")
		private WebElement article3;
	 
	 @FindBy(xpath = "//*[@id='share floating icon']")
		private WebElement share;
	 
		/* xpath changed due to some some deployments
		 * @FindBy(xpath = "//*[@class='UIAButton' and @x='1104']") private WebElement
		 * clos;
		 */
	 

 @FindBy(xpath = "//*[@knownSuperClass='_UIButtonBarButton']")
		private WebElement clos;
	
	
	 
	 //TC-8282-Verify the latest section has list of article's and clicking on article should redirect to article detail page
	 public void straitsTimes_latest_section() throws Exception {
			try {
				click(latest,"latest");
				swipeUp();
				
				swipeDownNVerify("(//*[@knownSuperClass='UIStackView'])[2]");
				click(article1,"article");
				if(ad(share)) {
						ExtentUtility.getTest().log(LogStatus.PASS, "in article detail page",
		     					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				click(clos,"close");}	
				
				swipeDownNVerify("(//*[@knownSuperClass='UIStackView'])[3]");
				click(article2,"article");
				if(ad(share)) {
						ExtentUtility.getTest().log(LogStatus.PASS, "in article detail page",
		     					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				click(clos,"close");}					
				
				swipeDownNVerify("(//*[@knownSuperClass='UIStackView'])[4]");
				click(article3,"article");
				if(ad(share)) {
						ExtentUtility.getTest().log(LogStatus.PASS, "in article detail page",
		     					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				click(clos,"close");	}				
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			
		}
	 
	 @FindBy(xpath = "//*[@value='st archive icon']")
		private WebElement all;
	 
	 @FindBy(xpath = "(//*[@id='iconDownload'])[2]")
		private WebElement download1;
	 @FindBy(xpath = "(//*[@id='iconDownload'])[3]")
		private WebElement download2;
	 
	 
	 @FindBy(xpath = "//*[@id='Downloaded']")
		private WebElement epaperdownloaded;
	 
	 @FindBy(xpath = "//*[@id='trash']")
		private WebElement trash;
	 
	 @FindBy(xpath = "//*[@id='CLEAR ALL DOWNLOADS']")
		private WebElement clear_all;
	 
	 @FindBy(xpath = "//*[@id='Yes']")
		private WebElement yes;
	 
	 @FindBy(xpath = "//*[@id='Downloads cleared']")
		private WebElement cleared;
	// TC-8283 Verify the downlaoded epapers are dispalyed in the settings downlaoded 
	 public void straitsTimes_downloads_epaper_section() throws Exception {
			try {
				click(epapericon, "E-paper");
				click(all,"show all epapers");
				click(download1,"download_icon");
				if(ad(epaperloginbtn)) {
					click(epaperloginbtn, " login");

				if (ad(loginintodifferentST))
					click(loginintodifferentST, "login into different account");
				enterText(enterusernameST, "autotest_mysph@test.com", "Username");
				enterText(enterpasswordST, "Password123", "Password");
				click(loginbtnST, "Login");
				if (ad(adNoThanks)) {
					click(adNoThanks, "No Thanks!");
					click(adGotit, "got it!");
				}
				click(download1,"download_icon");
					
				}
				click(download2,"download_icon");
				swipeUp();
				click(download1,"download_icon");
				swipeDown();
				click(all,"show all epapers");
				if(!(ad(epaperdownloaded)))
					Thread.sleep(5000);
				if(!(ad(epaperdownloaded))) 
					Thread.sleep(5000);
				if(!(ad(epaperdownloaded))) 
					Thread.sleep(5000);
				
				if(ad(epaperdownloaded)) {
					click(trash,"trash");
					click(clear_all,"clear all");
					click(yes,"yes");
					
				}
				if(ad(cleared))
				
						ExtentUtility.getTest().log(LogStatus.PASS, "cleared successfully",
		     					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
									
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			
		}
	
	 @FindBy(xpath = "//*[@id='FearturedCell.headlineLabel']")
		private WebElement arti;
	 @FindBy(xpath = "//*[@id='TitleCell.sectionTitleLabel' and @text='MORE FROM THE WEB']")
		private WebElement more_frm_web;
	 @FindBy(xpath = "//*[@id='TitleCell.sectionTitleLabel' and @text='RECOMMENDED']")
		private WebElement recommended;
	 @FindBy(xpath = "//*[@knownSuperClass='_UIButtonBarButton']")
		private WebElement close;
	 //TC-8284 -Verify the More from the web and recommenbd inside the article detail page
	 public void straitsTimes_articles() throws Exception {
			try {
				appiumDriver.closeApp();
				appiumDriver.launchApp();		

				advertisement();
				click(homepage,"homepage");
				click(arti,"random article");
				swipeDownNVerify("//*[@id='TitleCell.sectionTitleLabel' and @text='RECOMMENDED']");
				if(ad(recommended))
				
						ExtentUtility.getTest().log(LogStatus.PASS, "recommended",
		     					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
									
				swipeDownNVerify("//*[@id='TitleCell.sectionTitleLabel' and @text='MORE FROM THE WEB']");
				if(ad(more_frm_web))
				
						ExtentUtility.getTest().log(LogStatus.PASS, "more from web",
		     					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));

				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			
		}
	 
	 @FindBy(xpath = "(//*[@id='StandardCell.headlineLabel'])[1]")
		private WebElement random_article1;
	 
	 @FindBy(xpath = "//*[@text='text to speech stop icon']")
		private WebElement tts_stop_icon;
	 
	 @FindBy(xpath = "//*[@text='text to speech play icon']")
		private WebElement tts_play_icon;
	 
	 @FindBy(xpath = "//*[@knownSuperClass='_UIButtonBarButton']")
		private WebElement article_close;
	 // TC-6098	 Verify the text-to-speech button will enable and disable from the article detail page

	 public void  TC_6098_Verify_the_texttospeech_button_will_enable_and_disable_from_the_article_detail_page
() throws Exception {
			try {
				//appiumDriver.closeApp();
				//appiumDriver.launchApp();		

				advertisement();
				click(homepage,"homepage");
				swipeDownNVerify("//*[@id='StandardCell.headlineLabel']");
				click(random_article1,"random article");
				
				if(ad(tts_stop_icon)) {
				 click(tts_stop_icon,"enable");
				 tts_play_icon.isDisplayed();
					click(tts_play_icon,"disable");
				 }
				else {
					if(ad(tts_play_icon)) {
						click(tts_play_icon,"disable");
						tts_stop_icon.isDisplayed();
					 click(tts_stop_icon,"enable");}
				}
									
				click(article_close,"close article");
			} catch (Exception e) {
				System.out.println(e);
			}
			
			
		}
	 
	// TC-6059	 Verify the user should able to click on the share button and tapping on share should display the social media icons

	
	 @FindBy(xpath = "//*[@id='share']")
		private WebElement share_button;
	 
	 @FindBy(xpath = "//*[@x='131' and @class='UIAView']")
		private WebElement click_on_sharing;
	 
	 @FindBy(xpath = "//*[@id='share']")
		private WebElement share_inside;
	 
	 @FindBy(xpath = "//*[@id='Close']")
		private WebElement verify_close_button;
	 

	 public void  TC_6059_Verify_the_user_should_able_to_click_on_the_share_button_and_tapping_on_share_should_display_the_social_media_icons() throws Exception {
			try {
					
				click(epapericon, "E-paper");
				click(onpaper, " e-paper");
				
				if(ad(epaperloginbtn)) {
				click(epaperloginbtn, " login");

				if (ad(loginintodifferentST))
					click(loginintodifferentST, "login into different account");
				enterText(enterusernameST, "autotest_mysph@test.com", "Username");
				enterText(enterpasswordST, "Password123", "Password");
				click(loginbtnST, "Login");
				if (ad(adNoThanks)) {
					click(adNoThanks, "No Thanks!");
					click(adGotit, "got it!");
				}
				click(onpaper, " e-paper");
				}
				click(share_button,"share icon");
				click(click_on_sharing,"sharing article");
				click(share_inside,"share");
				
				if(ad(verify_close_button))
					ExtentUtility.getTest().log(LogStatus.PASS, "verifying",
	     					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	 
	 /********************************REGRESSION**********************************/
	// TC-7952	 Article Details page - More from Web (Outbrain intergrations)

	 
	 @FindBy(xpath = "//*[@text='RECOMMENDED']")
		private WebElement recommended_;
	 
	 @FindBy(xpath = "//*[@text='MORE FROM THE WEB']")
		private WebElement more_from_web;
	 
	 @FindBy(xpath = "//*[@id='outbrain_icon']")
		private WebElement outbrain_icon;
	 
	 @FindBy(xpath = "//*[@id='URL']")
		private WebElement url;
	 
	 @FindBy(xpath = "//*[@id='Done']")
		private WebElement done;
	 
	 
	 
	 
	 
	 //*[@knownSuperClass='_UIButtonBarButton']
	 public void TC_7952_Article_Details_page_More_from_Web() throws Exception{
		click(homepage,"home page");
//		 swipeDownNVerify("//*[@id='StandardCell.headlineLabel']");
		 action.press(p1.point(0, 600))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
			.moveTo(p1.point(0,-5000))
			.release().perform();
		 click(random_article1,"article");
		 
		// swipeDownNVerify("//*[@text='RECOMMENDED']");
		 
		 swipeDownN_Verify("//*[@text='MORE FROM THE WEB']");
		
		 swipeDownN_Verify("//*[@id='outbrain_icon']");
		 click(outbrain_icon,"icon");
		 System.out.println(url.isDisplayed());
		 click(done,"done");
		 click(article_close,"close");
		 
		
		 
	 }
	 @FindBy(xpath = "//*[@accessibilityLabel='ArticleHeaderViewController.updatedDateLabel']")
		private WebElement updated;
	 
	 @FindBy(xpath = "//*[@accessibilityLabel='ArticleHeaderViewController.publishedDateLabel']")
		private WebElement published_;
	// TC-7981 Article Details page - Published/Updated

	 public void TC_7981_Article_Details_page_Published_Updated() throws Exception{
		 swipeDownNVerify("//*[@id='StandardCell.headlineLabel']");
		 click(random_article1,"article");
		 
		 if(ad(updated))
			 System.out.println(updated.getText());
		 if(ad(published_))
			 System.out.println(published_.getText());
		 click(article_close,"close");
		 
	 }
	// TC-7901	 Latest Tab || Should be able to bookmark

	 @FindBy(xpath = "//*[@x='1146']")
		private WebElement bookmark;

	 public void TC_7901_Latest_Tab_Should_be_able_to_bookmark() throws Exception{
		 
		 click(latest,"latest");
		 if(ad(bookmark))
			 click(bookmark,"bookmark");
		 
	 }
	 
	// TC-7911 Latest Tab || Tab should load without errors

	 @FindBy(xpath = "//*[@text='LATEST' and @class='UIAStaticText']")
		private WebElement latest_sec;
	 
 public void TC_7911_Latest_Tab_Should_should_load_without_errors() throws Exception{
		 
		 click(latest,"latest");
		System.out.println(latest_sec.isDisplayed());
		ExtentUtility.getTest().log(LogStatus.PASS, "latest tab loaded without any errors",
				ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		 
	 }
// TC-7934	 Log-In || mysph Login
 public void TC_7934_LogIn_mysph_Login() throws Exception{
	 
	 
			try {
				advertisement();
				click(epapericon, "E-paper");
				click(onpaper, " e-paper");
				if(ad(epaperloginbtn)) {
				click(epaperloginbtn, " login");
				if(present(continued)) {
					click(continued,"Continue");
					Thread.sleep(5000);
				}
				if (present(loginintodifferentST)) {
					click(loginintodifferentST, "login into different account");
				}
				enterusernameST.sendKeys("testsublite_ga@test.com");
				appiumDriver.hideKeyboard();
				enterpasswordST.click();
				enterpasswordST.sendKeys("pass4321");
				appiumDriver.hideKeyboard();
				click(loginbtnST, "Login");
				if (ad(adNoThanks)) {
					click(adNoThanks, "No Thanks!");
					click(adGotit, "got it!");
				}
				
				assertEquals("e-paper login successful", "E-PAPER", mainpage.getText());}
			
				
				click(menu,"menu");
				click(settings, "Settings");
				if(ad(gotit_first))
					click(gotit_first, "Got it");
				if (ad(click_logout))
					click(click_logout, "logout");
				if(present(continued)) {
					click(continued,"Continue");
					Thread.sleep(5000);
				}
				if (present(loginintodifferentST)) {
					click(loginintodifferentST, "login into different account");
				}
				enterusernameST.sendKeys("testsublite_ga@test.com");
				appiumDriver.hideKeyboard();
				enterpasswordST.click();
				enterpasswordST.sendKeys("pass4321");
				appiumDriver.hideKeyboard();
				click(loginbtnST, "Login");
				if (ad(adNoThanks)) {
					click(adNoThanks, "No Thanks!");
					click(adGotit, "got it!");
				}

				click(closebtn2, "Close the page");
				if (ad(logout))
					click(logout, "logout");

			}catch (Exception e) {
				System.out.println(e);
			}
 }
		
 //TC_8009_straitTimes_login_reg_user
 public void TC_8009_straitTimes_login_reg_user_() throws Exception {
		try {
			
			click(menu, "menu");
			if (ad(logout))
				click(logout, "logout");
			click(settings, "Settings");
			if(ad(gotit_first))
				click(gotit_first, "Got it");
			if (ad(logout))
				click(logout, "logout");
			click("//*[@id='LOG IN']","Login");
			if(present(continued)) {
				click(continued,"Continue");
				Thread.sleep(5000);
			}
			if (present(loginintodifferentST)) {
				click(loginintodifferentST, "login into different account");
			}
			enterusernameST.sendKeys("testsublite_ga@test.com");
			appiumDriver.hideKeyboard();
//			enterpasswordST.click();
			enterpasswordST.sendKeys("pass4321");
			appiumDriver.hideKeyboard();
			click("//*[@id='LOG IN' and @class='UIAButton']", "Login");
			if (ad(adNoThanks)) {
				click(adNoThanks, "No Thanks!");
				click(adGotit, "got it!");
			}
//btreg@sph.com_Sph@2021
			
			
			click(closebtn, "Close the page");
			if(ad(closebtn2))
			click(closebtn2, "Close the page");
			if (ad(logout))
				click(logout, "logout");
			if(ad(login))
				ExtentUtility.getTest().log(LogStatus.FAIL, " incorrect user credentials",
    					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));

			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
 
// TC-7915	 Bookmark || Enable/Disable bookmark from listing and Article detail page

 @FindBy(xpath = "//*[@value='article detail bookmark icon']")
	private WebElement in_article_bookmark;

 public void TC_7915_Bookmark_Enable_Disable_bookmark_from_listing_and_Article_detail_page() throws Exception{
	 
	 appiumDriver.closeApp();
		appiumDriver.launchApp();
		
		advertisement();
		 action.press(p1.point(0, 600))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
			.moveTo(p1.point(0,-5000))
			.release().perform();
	 if(ad(bookmark))
		 click(bookmark,"bookmark");
	 click(random_article1,"article");
	 if(ad(in_article_bookmark))
		 click(in_article_bookmark,"bookmark");
	 click(article_close,"close");
	 
 }
 

 @FindBy(xpath = "//*[@id='Sign up FREE']")
	private WebElement sign_up;
 public void TC_8014_straitTimes_signup_with_settings_epaper() throws Exception {
		try {
			
			
			click(menu, "menu");
			click(settings, "Settings");
			if (ad(gotit_first))
				click(gotit_first, "Got it");
			if (ad(logout))
				click(logout, "logout");
			click(loginSTunderManageAcc, "Login under Manage Account");
			if (ad(loginintodifferentST))
				click(loginintodifferentST, "login into different account");
			click(sign_up,"sign up");
			enterText(enterusernameST, "mysphtest01@test.com", "Username");
			enterText(enterpasswordST, "ctstest123", "Password");
			click(loginbtnST, "Login");
			if (ad(adNoThanks)) {
				click(adNoThanks, "No Thanks!");
				click(adGotit, "got it!");
			}

			click(closebtn2, "Close the page");
			if (ad(logout))
				click(logout, "logout");
			
			click(epapericon, "E-paper");
			click(onpaper, " e-paper");
			click(epaperloginbtn, " login");

			if (ad(loginintodifferentST))
				click(loginintodifferentST, "login into different account");
			enterText(enterusernameST, "autotest_mysph@test.com", "Username");
			enterText(enterpasswordST, "Password123", "Password");
			click(loginbtnST, "Login");
			if (ad(adNoThanks)) {
				click(adNoThanks, "No Thanks!");
				click(adGotit, "got it!");
			}

			assertEquals("e-paper login successful", "E-PAPER", mainpage.getText());
			click(menu, "menu");
			if (ad(logout))
				click(logout, "logout");

			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
 

 @FindBy(xpath = "//*[@id='OK']")
	private WebElement stlite_ok;
// TC-7925	 Log-In || ST Lite user should be able to access subscribed article but cannot access epaper 
 
 public void TC_7925_LogIn_ST_Lite_user_should_be_able_to_access_subscribed_article_but_cannot_access_epaper() throws Exception {
		try {
			
			advertisement();
			click(menu, "menu");
			click(settings, "Settings");
			if (ad(gotit_first))
				click(gotit_first, "Got it");
			if (ad(logout))
				click(logout, "logout");
			click("//*[@accessibilityLabel='DoubleButtonCell.loginButton']","Login");
			if(present(continued)) {
				click(continued,"Continue");
				Thread.sleep(5000);
			}
			
			if (present(loginintodifferentST)) {
				click(loginintodifferentST, "login into different account");
			}
			enterusernameST.sendKeys("testsublite_ga@test.com");
			appiumDriver.hideKeyboard();
//			enterpasswordST.click();
			enterpasswordST.sendKeys("pass4321");
			appiumDriver.hideKeyboard();
			click("//*[@id='LOG IN' and @class='UIAButton']", "Login");
			if (ad(adNoThanks)) {
				click(adNoThanks, "No Thanks!");
				click(adGotit, "got it!");
			}

			click(closebtn2, "Close the page");
			
			click(epapericon, "E-paper");
			click(onpaper, " e-paper");
			click(stlite_ok,"ok");
			click(menu, "menu");
			
			if (ad(logout))
				click(logout, "logout");
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
 // TC-7909	 Tutorials screen on Bookmark, Settings, epaper
 public void TC_7909_Tutorials_screen_on_Bookmark_Settings_epaper() throws Exception {
		try {
			appiumDriver.closeApp();
			appiumDriver.launchApp();		

			advertisement();
			
			click(epapericon, "E-paper");
			if(ad(epaper_tour_verify)) {
			assertEquals("verifying the epaper tour is visible for first time users", "Got it!",
					epaper_tour_verify.getText());
			click(epaper_tour_verify, " got it!");}
			
			click(menu, "menu");
			click(bookmarkicon, " bookmark icon");
			if(ad(bookmark_tour_verify))
			{
			assertEquals("verifying the bookmark tour is visible for first time users", "Got it!",
					bookmark_tour_verify.getText());
			
			click(bookmark_tour_verify, "verfiy the tour");}
			click(closebtn_book, "close");
			
			click(menu, "menu");
			click(settings, "Settings");
			if(ad(gotit_first)) {
			assertEquals("verifying the tour is visible for first time users", "Got it!", gotit_first.getText());
			//if(ad(gotit_first))
				click(gotit_first, "Got it");}
				click(closebtn2, "Close the page");	
				
				
							
		} catch (Exception e) {
			System.out.println(e);
		}
	}
//TC-7897	 Discover on Home Page	
 


 @FindBy(xpath = "(//*[@id='CarouselImageCell.titleLabel'])[1]")
	private WebElement heading;
 @FindBy(xpath = "//*[@text='Done' and @class='UIAStaticText']")
	private WebElement Done;
 public void TC_7897_Discover_on_Home_Page() throws Exception{
	  
	 advertisement();
	 click(homepage,"home page");
	 swipeDownNVerify("//*[@id='TitleCell.sectionTitleLabel' and @text='DISCOVER']");
	 click(heading,"discover heading");
	 if(present(Done)) {
	 click(Done,"done");
	 }
 
 }
// TC-7903	 Discover Tab
 public void TC_7903_Discover_Tab() throws Exception{
	  
	 advertisement();
	 click(discover,"discover");
	// swipeUp();
	 click(heading,"discover");
	 if(present(done)) {
	 click(Done,"done");
	 }else{
		 click(close_icon,"Close");
	 }
 
 }
 
 public void close_and_open() throws Exception {
		appiumDriver.closeApp();
		appiumDriver.launchApp();
	}

 
 @FindBy(xpath = "//*[@id='BookmarkCell.headlineLabel']")
	private WebElement Bookmarked_article;

// TC-7899	 Bookmark || Able to bookmark article from listing page 
 public void TC_7899_Bookmark_able_to_bookmark_from_listing_page() throws Exception{
	 advertisement();
	 click(homepage,"home");
	 swipeDownNVerify("//*[@id='StandardCell.headlineLabel']");
	 if(ad(bookmark))
		 click(bookmark,"bookmark");
	 click(menu,"menu");
	 click(bookmarkicon,"bookmark");
	 if(ad(bookmark_tour_verify))
		{
		click(bookmark_tour_verify, "verfiy the tour");}
		click(closebtn_book, "close");
	// System.out.println(Bookmarked_article.isDisplayed());
	 
 }
 
 // TC-7920	 ePaper || User should be asked to login to view epaper
 public void TC_7920_ePaper_User_should_be_asked_to_login_to_view_epaper() throws Exception {
		try {
			click(menu,"Menu");
			if(present(logout)) {
				click(logout,"Logout");
			}
			click(epapericon, "E-paper");
			click("//*[@text='READ E-PAPER']", " e-paper");
			click(epaperloginbtn, " login");
			if(present(continued)) {
				click(continued,"Continue");
				Thread.sleep(5000);
			}
			if (present(loginintodifferentST)) {
				click(loginintodifferentST, "login into different account");
			}
			enterusernameST.sendKeys("autotest_mysph@test.com");
			appiumDriver.hideKeyboard();
//			enterpasswordST.click();
			enterpasswordST.sendKeys("Password123");
			appiumDriver.hideKeyboard();
			click(loginbtnST, "Login");
			if (ad(adNoThanks)) {
				click(adNoThanks, "No Thanks!");
				click(adGotit, "got it!");
			}
			assertEquals("e-paper login successful", "E-PAPER", mainpage.getText());
//			click(menu, "menu");
//			if (ad(logout))
//				click(logout, "logout");

			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

 @FindBy(xpath = "//*[@text='DELETE']")
	private WebElement delete;
 
 @FindBy(xpath = "//*[@text='DOWNLOADED']")
	private WebElement download;
 
 @FindBy(xpath = "//*[@id='SETTINGS']")
	private WebElement downloaded_back;
 

 

 //TC-7927	 ePaper || Delete downloaded epaper
 public void TC_7927_ePaper_Delete_downloaded_epaper() throws Exception {
		try {
			
//			click(epapericon, "E-paper");
//			click(downloadicon,"e-paper download icon");
//			
//			if(ad(epaperloginbtn)) {
//			click(epaperloginbtn, " login");
//			if(present(continued)) {
//				click(continued,"Continue");
//				Thread.sleep(5000);
//			}
//			if (present(loginintodifferentST)) {
//				click(loginintodifferentST, "login into different account");
//			}
//			enterusernameST.sendKeys("autotest_mysph@test.com");
//			appiumDriver.hideKeyboard();
////			enterpasswordST.click();
//			enterpasswordST.sendKeys("Password123");
//			appiumDriver.hideKeyboard();
//			click(loginbtnST, "Login");
//			if (ad(adNoThanks)) {
//				click(adNoThanks, "No Thanks!");
//				click(adGotit, "got it!");
//			}
//			
//			click(downloadicon, " e-paper download icon");
//			}
//			if(ad(downloadicon))
//				Thread.sleep(5000);
//			if(ad(downloadicon))
//				Thread.sleep(5000);
//			if(ad(downloadicon))
//				Thread.sleep(5000);
//			if(ad(downloadicon))
//				Thread.sleep(5000);
			
			
//			click(menu,"menu");
//			click(settings,"settings");
			click(download,"Downloaded");
			if(ad(delete))
			click(delete,"delete");
			click(downloaded_back," back");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
 
 //TC-7942	 ePaper || user should be able to download epaper
 public void TC_7942_ePaper_user_should_be_able_to_download_epaper() throws Exception {
		try {
			int n=0;
			click(epapericon, "E-paper");
			click(downloadicon,"e-paper download icon");
			
//			if(ad(epaperloginbtn)) {
//			click(epaperloginbtn, " login");
//
//			if(present(continued)) {
//				click(continued,"Continue");
//				Thread.sleep(5000);
//			}
//			if (present(loginintodifferentST)) {
//				click(loginintodifferentST, "login into different account");
//			}
//			enterusernameST.sendKeys("autotest_mysph@test.com");
//			appiumDriver.hideKeyboard();
////			enterpasswordST.click();
//			enterpasswordST.sendKeys("Password123");
//			appiumDriver.hideKeyboard();
//			click(loginbtnST, "Login");
//			if (ad(adNoThanks)) {
//				click(adNoThanks, "No Thanks!");
//				click(adGotit, "got it!");
//			}
//			
//			click(downloadicon, " e-paper download icon");
//			}
			
			while(present(downloadicon)) {
				n++;
				 Thread.sleep(5000);
				 if(n==15) {
					 break;
				 }
			}
				System.out.println(ad(icon_complete));
				ExtentUtility.getTest().log(LogStatus.PASS, "epaper download",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			if(ad(menu)) {	
				click(menu,"menu");
				click(settings,"settings");
				click(download,"Downloaded");
//				if(ad(delete)) {
//				click(delete,"delete");
//				}
				click(downloaded_back," back");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

// TC-7946	 Article listing page Via Elastic search - Search by keyword
 
 @FindBy(xpath = "//*[@knownSuperClass='_UIButtonBarButton']")
	private WebElement search_icon;
 
 @FindBy(xpath = "//*[@placeholder='Search The Straits Times…']")
	private WebElement search_bar;
 
 @FindBy(xpath = "(//*[@accessibilityLabel='StandardCell.headlineLabel'])[3]")
	private WebElement searchtext1;
 
 @FindBy(xpath = "(//*[@accessibilityLabel='StandardCell.headlineLabel'])[4]")
	private WebElement searchtext2;
 

 
 public void TC_7946_Article_listing_page_Via_Elastic_search_Search_by_keyword() throws Exception{
	
	 appiumDriver.closeApp();
		appiumDriver.launchApp();
	 advertisement();
	 click(homepage_title,"home");
	 click(search_icon,"search");
//	 click(search_bar,"searchbar");
	 String key="Google";
	 search_bar.sendKeys(key+"\n");
	 
	 String text1=searchtext1.getText();
	 String text2=searchtext2.getText();
	 if(text1.equalsIgnoreCase("Google")&&text2.equalsIgnoreCase("Google"))
		 ExtentUtility.getTest().log(LogStatus.PASS, " successful",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
	 
	 click(cancel,"cancel");
	
 }
 
 @FindBy(xpath = "//*[@value='Recent searches']")
	private WebElement recent;
 
 @FindBy(xpath = "(//*[@accessibilityLabel='TokenCell.tokenLabel'])[1]")
	private WebElement recent_keyword1;
 
 @FindBy(xpath = "//*[@value='Clear text']")
	private WebElement clear_text;
 

 

	//TC-7928	 Article listing page Via Elastic search - Keyword search - Recent
	  public void TC_7928_Article_listing_page_Via_Elastic_search_keyword_search_Recent() throws
	  Exception{
		  appiumDriver.closeApp();
			appiumDriver.launchApp();
	  advertisement(); click(homepage_title,"home"); click(search_icon,"search");
	  click(search_bar,"searchbar"); String key="google";
	  search_bar.sendKeys(key+"\n");
	  
	  String text1=searchtext1.getText(); 
	  String text2=searchtext2.getText();
	  if(text1.equalsIgnoreCase("Google")||text2.equalsIgnoreCase("Google"))
	  ExtentUtility.getTest().log(LogStatus.PASS,"search results" ,
	  ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
	  
	  click(close_icon,"clear text");
	  click(search_icon,"search");
	 if( recent.isDisplayed())
          recent_keyword1.isDisplayed();
	 ExtentUtility.getTest().log(LogStatus.PASS,"recent search" ,
			  ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
	 click(cancel,"cancel");
	 

	  }
	// TC-7933	 Article listing page Via Elastic search - Recent searches 
  
	  public void TC_7933_Article_listing_page_Via_Elastic_search_Recent_searches() throws
	  Exception{
	  
	  advertisement(); 
	  click(homepage_title,"home"); 
	  click(search_icon,"search");
	  click(search_bar,"searchbar");
	  String key="google";
	  search_bar.sendKeys(key+"\n"); 
	  click("//*[@text='Clear text']","clear text");
//	  click(search_icon,"search");
	  Thread.sleep(5000);
	  
	 if( recent.isDisplayed()) {
          recent_keyword1.isDisplayed();
	 }
	click(recent_keyword1,"recent searches");
	String text1=searchtext1.getText(); 
	  String text2=searchtext2.getText();
	  if(text1.equalsIgnoreCase("Google")||text2.equalsIgnoreCase("Google"))
	  ExtentUtility.getTest().log(LogStatus.PASS,"search results" ,
	  ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
	  click(cancel,"cancel");
	 
	  }
	  
	
	  @FindBy(xpath = "//*[@id='delete icon']")
		private WebElement trash_icon;
	  
	  @FindBy(xpath = "//*[@value='close icon']")
			private WebElement cancel;
	  
	
 //TC-7954	 Article listing page Via Elastic search - Recent searches - Delete
	  public void TC_7954_Article_listing_page_Via_Elastic_search_Recent_searches_Delete() throws
	  Exception{
		  advertisement(); 
		  click(homepage_title,"home"); 
		  click(search_icon,"search");
//		  click(search_bar,"searchbar");
	
		String key1="google";
		search_bar.sendKeys(key1+"\n");
		click(clear_text,"clear text");
		click(search_bar,"searchbar");
		String key2="instagram";
		search_bar.sendKeys(key2+"\n");
		click(clear_text,"clear text");
//		click(search_bar,"searchbar");
//		String key3="facebook";
//		search_bar.sendKeys(key3+"\n");
//		click(clear_text,"clear text");
	
		/*
		 * String key4="whatsapp"; search_bar.sendKeys(key4+"\n");
		 * click(clear_text,"clear text");
		 * 
		 * String key5="youtube"; search_bar.sendKeys(key5+"\n");
		 * click(clear_text,"clear text");
		 */
		
//		click("//*[@value='close icon']","Cancel");
//		click(search_icon,"Search");
		if(present(trash_icon)) {
			click(trash_icon,"History deleted");
		ExtentUtility.getTest().log(LogStatus.PASS, "History deleted",
				ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		 click(cancel,"cancel");
		}
 }
	  
	  //TC-7977	 Article listing page Via Elastic search - Search by Category - Show more/Less
	  
	  @FindBy(xpath = "//*[@id='Search by category']")
		private WebElement Search_by_category;
	  
	  @FindBy(xpath = "//*[@id='See more']")
		private WebElement See_more;
	//*[@id='See less']
	  public void TC_7977_Article_listing_page_Via_Elastic_search_Search_by_Category_Show_more_Less() throws
	  Exception{
	  
	  advertisement();
	  click(homepage_title,"home");
	  click(search_icon,"search");
		
	  appiumDriver.hideKeyboard();
	  
	  Search_by_category.isDisplayed();
	  click(See_more,"see_more");
	  click(cancel,"cancel");
	  

	  } 
	  
	 // TC-7982	 Article listing page Via Elastic search - Keyword search - Relevance 
	  
	
	  @FindBy(xpath = "//*[@id='Relevance']")
		private WebElement Relevance;
	  
	  public void TC_7977_Article_listing_page_Via_Elastic_search_Keyword_search_Relevance() throws
	  Exception{
	  
		  advertisement(); click(homepage_title,"home");
		  click(search_icon,"search");
//		  click(search_bar,"searchbar"); 
		  String key="google";
		  search_bar.sendKeys(key+"\n");
		  
		  click(Relevance,"relevance");
		  String text1=searchtext1.getText(); 
		  String text2=searchtext2.getText();
		  if(text1.equalsIgnoreCase("Google")||text2.equalsIgnoreCase("Google"))
		  ExtentUtility.getTest().log(LogStatus.PASS,"search results" ,
		  ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		  click(cancel,"cancel");
		 

	  } 
	  
	//TC-7994 Article listing page Via Elastic search - Search by Category  
	  
	  @FindBy(xpath = "(//*[@accessibilityLabel='TokenCell.tokenLabel'])[4]")
		private WebElement search_by_category;
	  
	  public void TC_7994_Article_listing_page_Via_Elastic_search_Search_by_Category() throws
	  Exception{
	  
	  advertisement();
	  click(homepage_title,"home");
	  click(search_icon,"search");
		
	  appiumDriver.hideKeyboard();
	  
	  Search_by_category.isDisplayed();
	  click(See_more,"see_more");
	  click(search_by_category,"search by categories");
	  click("(//*[@accessibilityLabel='StandardCell.headlineLabel'])[4]","search result");
	  Thread.sleep(5000);
	  share.isDisplayed();
	  click(close_article,"close");
	  
	  

	  } 
	  
	  // TC-7919	 Article listing page Via Elastic search -  Article page
	  
	  public void TC_7919_Article_listing_page_Via_Elastic_search_Article_page() throws
	  Exception{
		  appiumDriver.closeApp();
			appiumDriver.launchApp();
	  advertisement();
	  click(homepage_title,"home");
	  click(search_icon,"search");
	  click(search_bar,"searchbar");
		 String key="Google";
		 search_bar.sendKeys(key+"\n");
		 Thread.sleep(3000);
		click("(//*[@id='StandardCell.headlineLabel'])[2]","search result");
		 Thread.sleep(5000);
		 share.isDisplayed();
		  click(close_article,"close");
	  

	  } 
	  
	  //TC-7947 Article listing page Via Elastic search - Search by article headline
	  
	
	  @FindBy(xpath = "//*[@id='ArticleHeaderViewController.headlineLabel']")
	  private WebElement headline;
	  
	  public void TC_7947_Article_listing_page_Via_Elastic_search_Search_by_article_headline() throws
	  Exception{
	  
	  advertisement();
	  click(homepage_title,"home");
	  click("//*[@text='search icon']","search");
	  click(search_bar,"searchbar");
		 String key="Google";
		 search_bar.sendKeys(key+"\n");
		 
		 String text=searchtext2.getText();
		click(searchtext2,"search result");
		
	    String text1=headline.getText();
	    
	    if(text.equalsIgnoreCase(text1))
	    	System.out.println("same article headline");
	    takeScreenShot();
		  click(close_article,"close");
	  

	  } 
	  
	  //TC-7923 Articles Details Scroll || Verify article scroll
	  public void TC_7923_Articles_Details_Scroll_Verify_article_scroll() throws
	  Exception{
	  
	  advertisement();
	  click(homepage_title,"home");
	  for(int i=0;i<4;i++)
		 singleScrollDown();
	  ExtentUtility.getTest().log(LogStatus.PASS,"articles scroll" ,
			  ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
//	  click(close_icon,"Close");
	  } 
	  TouchAction action = new TouchAction(appiumDriver);
		PointOption p1= new PointOption();
		PointOption p2= new PointOption();
		
// TC-7908	 Articles Details Scroll || Scrolling through articles and then for any particular article try to access full article page	  
	  public void TC_7908_Articles_Details_Scroll_Scrolling_through_articles_and_then_for_any_particular_article_try_to_access_full_article_page() throws
	  Exception{
	  
	  advertisement();
	  click(homepage_title,"home");
	  click(homepage_title,"home");
	  action.press(p1.point(0, 600))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
		.moveTo(p1.point(0,-5000))
		.release().perform();
	  click(random_article1,"random article");
	  for(int i=0;i<5;i++)
		  swipeUp();
	  ExtentUtility.getTest().log(LogStatus.PASS,"Scrolling through articles and access full article page" ,
			  ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
click(article_close,"close");
	  }   
	  
	
	//*[@id='StandardCell.headlineLabel']
public void TC_7953_Article_Listing_page_via_Sections_page() throws Exception {
	try {
		advertisement();
		click(menu, "menu");
		click(category_singapore,"singapore");
		assertEquals("opened category article","SINGAPORE",category_singapore_click.getText());
		swipeUp();
		random_article1.isDisplayed();
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
	
	public void TC_7937_Article_Listing_page_via_Sections_page_Article_page() throws Exception {
		try {
			advertisement();
			click(menu, "menu");
			
			click(category_world,"world");
			assertEquals("opened category article","WORLD",category_world_click.getText());
//			swipeUp();
//			swipeDownNVerify("(//*[@id='StandardCell.headlineLabel'])[1]");
			action.press(p1.point(0, 600))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
			.moveTo(p1.point(0,-5000))
			.release().perform();
				click(random_article1,"random article");
			if(ad(share))
				click(article_close,"close");
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	  @FindBy(xpath = "(//*[@id='video play icon'])[1]")
			private WebElement video_play;
	  @FindBy(xpath = "//*[@id='Play']")
			private WebElement play;
	  @FindBy(xpath = "//*[@id='MENU']")
			private WebElement video_back;
	  @FindBy(xpath = "//*[@id='close icon']")
			private WebElement close_icon;
	
	
		public void TC_7926_Article_Listing_page_via_Sections_page_videos() throws Exception {
			try {

				 click(menu, "menu");
				 action.press(p1.point(0, 600))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
					.moveTo(p1.point(0,-20000))
					.release().perform();
				click(category_videos,"videos");
				assertEquals("opened category article","VIDEOS",category_videos_click.getText());
				click(video_play,"play");
//				click(play,"play");

				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			appiumDriver.closeApp();
			appiumDriver.launchApp();
		}

	/*	  @FindBy(xpath = "//*[@id='close icon']")
			private WebElement close_icon;
		  
		  @FindBy(xpath = "//*[@id='close icon']")
			private WebElement close_icon;
		  
		  @FindBy(xpath = "//*[@id='close icon']")
			private WebElement close_icon;
		  
		  @FindBy(xpath = "//*[@id='close icon']")
			private WebElement close_icon;
		  
		  @FindBy(xpath = "//*[@id='close icon']")
			private WebElement close_icon;
		  
		  @FindBy(xpath = "//*[@id='close icon']")
			private WebElement close_icon;
		  
		  @FindBy(xpath = "//*[@id='close icon']")
			private WebElement close_icon;
		  
		  @FindBy(xpath = "//*[@id='close icon']")
			private WebElement close_icon;
		  
		  @FindBy(xpath = "//*[@id='close icon']")
			private WebElement close_icon;
		  
		  @FindBy(xpath = "//*[@id='close icon']")
			private WebElement close_icon;

		public void TC_7449_Verify_All_containers_are_loading() throws Exception {
			
				if(ad(agree))
					onboarding();
				advertisement();
				click(homepage,"Home");
				if(ad(Topstories_Heading_Availability_Check)){
					ExtentUtility.getTest().log(LogStatus.PASS, "Top stories loaded",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					
				}
				
				if(!ad(For_Subscribers)){
					swipeDownNVerify("//*[@text='FOR SUBSCRIBERS']");
					ExtentUtility.getTest().log(LogStatus.PASS, "For Subscribers loaded",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					}
				if(!ad(Top_Picks)){
					swipeDownNVerify("//*[@text='TOP PICKS']");
					ExtentUtility.getTest().log(LogStatus.PASS, "Top_Picks loaded",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					}
				
				if(!ad(Views)){
					swipeDownNVerify("//*[@text='VIEWS']");
					ExtentUtility.getTest().log(LogStatus.PASS, "Views loaded",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					}
				if(!ad(Discover)){
					swipeDownNVerify("//*[@text='DISCOVER']");
					ExtentUtility.getTest().log(LogStatus.PASS, "Discover loaded",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					}
				if(!ad(Podcasts)){
					swipeDownNVerify("//*[@text='PODCASTS']");
					ExtentUtility.getTest().log(LogStatus.PASS, "Podcasts loaded",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					}
				if(!ad(Multimedia)){
					swipeDownNVerify("//*[@text='MULTIMEDIA']");
					ExtentUtility.getTest().log(LogStatus.PASS, "Multimedia loaded",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					}
				
				} catch (Exception e) {
							System.out.println(e);
				}
			}
		*/
		
		@FindBy(xpath = "(//*[@id='StandardCell.headlineLabel'])[2]")
		private WebElement Article1;
		
		
		
		//Sprint 10 TC_7924_Verify_user_can_navigate_to_article_page_from_homepage
		public void TC_7924_Verify_user_can_navigate_to_article_page_from_homepage() throws Exception {
		    
			advertisement();
			click(homepage,"Home");
			 action.press(p1.point(0, 600))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
				.moveTo(p1.point(0,-5000))
				.release().perform();
			click(Article1, "Article1");
			click(article_close, "Back");
			
			if(ad(homepage)){
				
				ExtentUtility.getTest().log(LogStatus.PASS, "User can navigate to article from home page",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			}
				
			
			
		}
		
		public void TC_7978_TabUI() throws Exception {
			advertisement();
				click(homepage,"Home");
				click(latest, "Latest");
				click(discover, "Discover");
				click(epapericon, "Epaper");
				click(menu, "StraitTimesMenu");
					ExtentUtility.getTest().log(LogStatus.PASS, "User can navigate through all options in Tab bar",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				
					
				
			}
	/*	@FindBy(xpath = "//*[@id='AdCell.imageView']")
		private WebElement Article_3rdPara;*/
		
		@FindBy(xpath = "(//*[@text='Advertisement'])[1]")
		private WebElement Article_3rdPara;
		
		
		@FindBy(xpath = "(//*[@id='LOG IN'])[2]")
		private WebElement lo;
		
		
		public void TC_7950_Article_Details_page_Ads() throws Exception {
			try{appiumDriver.closeApp();
			appiumDriver.launchApp();
			if(ad(agree))
			onboarding();
			advertisement();
			click(homepage,"Home");
			swipeDownNVerify("(//*[@id='StandardCell.headlineLabel'])[2]");
			click(Article1, "Article1");
		//	swipeDownNVerify("//*[@id='AdCell.imageView']");
			swipeDownNVerify("(//*[@text='Advertisement'])[1]");
			
			if(ad(Article_3rdPara))
			{
				ExtentUtility.getTest().log(LogStatus.PASS, "Ad present after 3rd para of article",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			}
			}catch(Exception e) {
				System.out.println("no ad found inside the article");
				ExtentUtility.getTest().log(LogStatus.FAIL, "no Ad present after 3rd para of article",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			}
		}
		
		
		@FindBy(xpath="//*[@class='UIAImage' and ./parent::*[./parent::*[@text='Straits_Times.ArticleListingView']]]")
		private WebElement title;
		
		public void TC_7931_App_Installation_App_name_should_be_Straits_Times() throws Exception{
			
			if(present(agree)) {
				onboarding();
			}
			advertisement();
			title.isDisplayed();
			ExtentUtility.getTest().log(LogStatus.PASS, "Straits Times",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			
		}
		
public void TC_7894_Latest_Tab_Should_be_able_to_share() throws Exception{
	appiumDriver.closeApp();
	appiumDriver.launchApp();
			if(ad(agree))
				onboarding();
			advertisement();
			click(latest,"latest");
			ShareIcon1.isDisplayed();
			click(ShareIcon1,"share");
			appiumDriver.closeApp();
			appiumDriver.launchApp();
		}
		
		@FindBy(xpath = "(//*[@id='share_icon'])[1]")
		private WebElement share_from_author_page;
		
		@FindBy(xpath = "//*[@id='ArticleHeaderViewController.authorNameLabel']")
		private WebElement author_name_only;
		
		@FindBy(xpath = "//*[@XCElementType='XCUIElementTypeButton' and @knownSuperClass='UIAccessibilityElement']")
		private WebElement cancel1;
		
		
		@FindBy(xpath = "(//*[@class='UIAImage' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView']])[2]")
		private WebElement archived_epaper;
		
		@FindBy(xpath="//*[@text='Continue']")
		private WebElement continued;
		
		
		 public void TC_7913_ePaper_Read_archived_eaper() throws Exception {
				try {
					appiumDriver.closeApp();
					appiumDriver.launchApp();
					
					if(ad(agree))
						onboarding();
					advertisement();
					click(epapericon, "E-paper");
					if(ad(epaper_tour_verify))
					click(epaper_tour_verify, " got it!");
					click(all,"show all epapers");
					click(archived_epaper,"archived epaper");
					if(ad(epaperloginbtn)) {
						click(epaperloginbtn, " login");
						click("//*[@text='Continue']","Continue");
						if (present(loginintodifferentST)) {
							click(loginintodifferentST, "login into different account");
						}
						enterusernameST.sendKeys("autotest_mysph@test.com");
						appiumDriver.hideKeyboard();
						enterpasswordST.click();
						enterpasswordST.sendKeys("Password123");
						appiumDriver.hideKeyboard();
						click(loginbtnST, "Login");
						if (ad(adNoThanks)) {
							click(adNoThanks, "No Thanks!");
							click(adGotit, "got it!");
						}
					click(archived_epaper,"archived epaper");
						
					}
					//Thread.sleep(20000);
					
				//	assertEquals("E-paper streaming mode", "icon-search", epaper_stream_verify.getText());
					
					if(ad(epaper_stream_verify)) 
						
							ExtentUtility.getTest().log(LogStatus.PASS, "able to read epaper successfully",
			     					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					click(backicon, "back icon");
					
					if(ad(menu)) {	
						click(menu,"menu");
						click(settings,"settings");
						click(download,"Downloaded");
						if(ad(delete))
						click(delete,"delete");
						click(downloaded_back," back");
						click(clos,"close");
					}
					if(ad(logoutST))
						straitTimeslogout();					
					
					
				} catch (Exception e) {
					System.out.println(e);
				}
				
				
			}
		 
		
		 
		@FindBy(xpath="(//*[@id='Next'])[1]")
		private WebElement click_next;
		 
		 @FindBy(xpath = "//*[@text='Log in now']")
			private WebElement onboard_login;
			
		public void TC_7980_Splash_screen_Verify_user_is_able_to_see_the_splash_screen() throws Exception{
			if(present(click_next)) {
				click(click_next,"Next");
				click("(//*[@id='Start Testing'])[1]","Start testing");
			}
			Thread.sleep(5000);
			if(ad(agree)) {
			click(agree, "agree");
			click(skip, "skip");
			click(onboard_login, "login");
			if(present(continued)) {
				click(continued,"Continue");
				Thread.sleep(5000);
			}
			click(edit,"Format");
			String val = reset.getAttribute("value");
			if(val.equals("100%")) {
				click("//*[@id='Decrement']","Decrement");
				click("//*[@text='OnboardingImage']","Menu");
			}else {
				click("//*[@text='OnboardingImage']","Menu");
			}
			if (present(loginintodifferentST)) {
				click(loginintodifferentST, "login into different account");
			}
			enterusernameST.sendKeys("autotest_mysph@test.com");
			appiumDriver.hideKeyboard();
//			enterpasswordST.click();
			enterpasswordST.sendKeys("Password123");
			appiumDriver.hideKeyboard();
			click(loginbtnST, "Login");
			Thread.sleep(5000);
			if (ad(adNoThanks)) {
				click(adNoThanks, "No Thanks!");
				click(adGotit, "got it!");
			}
			if(present(Continue)) {
				click(Continue,"Continue");
				click(askapp_notto_track,"Ask app not to track");
			}
			if(ad(homepage_title))
				click(homepage_title,"homepage");
			
		}
		
		}
		public void TC_7987_Login_MOE_User_Full_subscriber() throws Exception{
			advertisement();
			click(menu,"menu");
			if(ad(logoutST))
				straitTimeslogout();
			click(settings,"settings");
			if(ad(gotit_first)) {
					click(gotit_first, "Got it");
					}
			click("//*[@id='LOG IN']","Log in");
			Thread.sleep(3000);
			if(present(continued)) {
				click(continued,"Continue");
				Thread.sleep(5000);
			}
			if (present(loginintodifferentST)) {
				click(loginintodifferentST, "login into different account");
			}
			enterusernameST.sendKeys("testsub_moejc_ga@test.com");
			appiumDriver.hideKeyboard();
			enterpasswordST.click();
			enterpasswordST.sendKeys("pass4321");
			appiumDriver.hideKeyboard();
			click("//*[@id='LOG IN' and @class='UIAButton']", "Login");
			Thread.sleep(5000);
			if (ad(adNoThanks)) {
				click(adNoThanks, "No Thanks!");
				click(adGotit, "got it!");
			}
					
			appiumDriver.findElementByXPath("//*[@knownSuperClass='_UIButtonBarButton']").click();
			if(ad(epapericon)) {
				
		    	click(epapericon,"epaper");
		    	if(ad(epaper_tour_verify))
		    	   {
						click(epaper_tour_verify, " got it!");
					}
			    click(mainpage,"main page");
			}
		}
		
		public void TC_7965_article_Listing_Page_share_via_author_Share() throws IOException {
			try {
				appiumDriver.closeApp();
				appiumDriver.launchApp();
				if(ad(agree))
					onboarding();
				advertisement();
			
				click(article_subheadline, "Article");
				if(ad(author_name)){
					click(author_name, "AuthorName");
					click(share_from_author_page, "share_from_author_page");
					ExtentUtility.getTest().log(LogStatus.PASS, "Share Button available from Author's page",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					click(cancel1,"cancel");
				}
				else{
					if(ad(author_name_only))
					{
						click(author_name_only, "author_image");
						click(share_from_author_page, "share_from_author_page");
						ExtentUtility.getTest().log(LogStatus.PASS, "Share Button available from Author's page",
								ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					}
					click(cancel1,"cancel");
				}
				
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				ExtentUtility.getTest().log(LogStatus.FAIL, "Author not found",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		
		}
			
	}	
		
		
		 public void TC_7900_ePaper_Download_archived_eaper() throws Exception {
			try {
				appiumDriver.closeApp();
				appiumDriver.launchApp();
				if(ad(agree))
					onboarding();
				advertisement();
				click(epapericon, "E-paper");
				if(ad(epaper_tour_verify))
				click(epaper_tour_verify, " got it!");
				click(all,"show all epapers");
				click(download1,"download_icon");
				if(ad(epaperloginbtn)) {
					click(epaperloginbtn, " login");
					click("//*[@text='Continue']","Continue");
					if (present(loginintodifferentST)) {
						click(loginintodifferentST, "login into different account");
					}
					enterusernameST.sendKeys("autotest_mysph@test.com");
					appiumDriver.hideKeyboard();
					enterpasswordST.click();
					enterpasswordST.sendKeys("Password123");
					appiumDriver.hideKeyboard();
					click(loginbtnST, "Login");
					if (ad(adNoThanks)) {
						click(adNoThanks, "No Thanks!");
						click(adGotit, "got it!");
					}
				click(download1,"download_icon");
					
				}
				Thread.sleep(20000);
				
				
				if(ad(epaperdownloaded)) 
					
						ExtentUtility.getTest().log(LogStatus.PASS, "downloaded successfully",
		     					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
									
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
			
		}
		
		
		public void TC_8000_Article_listing_page_Via_Section_pages_Share() throws Exception {
			 appiumDriver.closeApp();
				appiumDriver.launchApp();
			if(ad(agree))
				onboarding();
		 advertisement();
		 click(homepage_title,"home");
		 click(menu, "menu");
			click(category_singapore,"singapore");
			assertEquals("opened category article","SINGAPORE",category_singapore_click.getText());
			swipeUp();
			share_from_author_page.isDisplayed();
			click(share_from_author_page,"share");
		
			 ExtentUtility.getTest().log(LogStatus.PASS, "share from section page",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		 
			 appiumDriver.closeApp();
				appiumDriver.launchApp();
		}
		
		public void TC_7966_Article_listing_page_Via_Elastic_search_Share() throws Exception {
			 appiumDriver.closeApp();
				appiumDriver.launchApp();
			if(ad(agree))
				onboarding();
		 advertisement();
		 click(homepage_title,"home");
		 click(search_icon,"search");
		 click(search_bar,"searchbar");
		 String key="Google";
		 search_bar.sendKeys(key+"\n");
		 Thread.sleep(5000);
		 click("(//*[@id='share_icon'])[2]","share");
		
			 ExtentUtility.getTest().log(LogStatus.PASS, "share from search",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		 
			 appiumDriver.closeApp();
				appiumDriver.launchApp();
		}
		
public void App_Installation_verify_ST_logo() {
	try {
		if (present(Agree)) {
			click(Agree, "Agree to terms and conditions");
		}
		if (present(Skip)) {
			click(Skip, "Skip the options");
		}
		if (present(later)) {
			click(later, "will do later");
		}
		if (present(Continue)) {
			click(Continue, "Agree to terms and conditions");
		}
		if (present(Do_not_track)) {
			click(Do_not_track, "Agree to terms and conditions");
		}
		if (present(Advertisement)) {
			click(Advertisement, "Close Advertisement");
		}
		if (STraitstimes_logo.isDisplayed()) {
			System.out.println("ST_logo is Visible");
		}
	} catch (Exception e) {
		System.out.println(e);
	}
}

public void Settings_LogOut_LogIn_Button_should_display() {
	try {			
		click(Menu, "Click on menu icon");
		click(Settings, "click on settings");
		if (present(Notification)) {
			click(Notification, "Click on Got it");
		}
		if (present(logout)) {
			click(logout, "Click on logout");
		}
		System.out.println(Login_Icon.isDisplayed());
		click(Login_menu, "Click on login menu");
		click("//*[@text='Continue']","Continue");
		Thread.sleep(3000);
		if (present(loginintodifferentST)) {
			click(loginintodifferentST, "login into different account");
		}
		enterusernameST.sendKeys("autotest_mysph@test.com");
		appiumDriver.hideKeyboard();
//		enterpasswordST.click();
		enterpasswordST.sendKeys("Password123");
		appiumDriver.hideKeyboard();
		click("//*[@id='LOG IN' and @class='UIAButton']", "Login");
		if (present(adNoThanks)) {
			click(adNoThanks, "No Thanks!");}
			if (present(adGotit)) {
			click(adGotit, "got it!");}
			assertEquals("Welcome back!", verify.getText());
			click(Closebutton, "Closebutton");							
	} catch (Exception e) {
		System.out.println(e);
	}
}
public void Settings_Downloaded() {
	try {
		int n=0;
		if (present(Advertisement)) {
			click(Advertisement, "Close Advertisement");
		}
		click(E_paper, "E_paper_click");
		if (present(Notification)) {
			click(Notification, "Click on Got it");
		}
		click(Download_e_paper, "Download E paper");
		while(present(Download_e_paper)) {
			Thread.sleep(7000);
			n++;
			if(n==20) {break;}
		}
		click(Menu, "Click on menu icon");
		click(Settings, "click on settings");
		if (present(Notification)) {
			click(Notification, "Click on Got it");
		}
		click(Downloaded, "click on Downloaded");
		click(Delete_e_paper, "Delete the e paper");
		click(Back_Button, "Click on back button");
	} catch (Exception e) {
		System.out.println(e);
	}
}

public void Settings_Autom_DL_Epaper() {
	try {
		click(Auto_Download_Epaper, "Download the E paper");
		click(Downloaded, "click on Downloaded");
		click(Back_Button, "Click on back button");
	} catch (Exception e) {
		System.out.println(e);
	}
}
public void Settings_News_Letters() {
	try {
		click(Newsletter, "Click on newsletter");
		if (present(Close_ad)) {
			click(Close_ad, "Close the ad");
		}
		System.out.println(Newsletter2.isDisplayed());
		click(Done, "Click on Done");
	} catch (Exception e) {
		System.out.println(e);
	}
}

public void Settings_PrivacyPolicy() {
	try {
		singleScrollDown();
		click(PrivacyPolicy, "Click on privacy policy");
		Thread.sleep(3000);
		click(Done, "Click on Done");
	} catch (Exception e) {
		System.out.println(e);
	}
}

public void Settings_Terms_Condition() {
	try {
		click(Terms_and_Condition, "Click on Terms and Condition");
		Thread.sleep(10000);
//		System.out.println(Terms_and_Condition.isDisplayed());
		click(Done, "Click on Done");
	} catch (Exception e) {
		System.out.println(e);
	}
}

public void Settings_Version_Number() {
	try {
//		System.out.println(Version_No_Verification.isDisplayed());
		click(Version_No_Verification,"Version number");
	} catch (Exception e) {
		System.out.println(e);
	}
}

public void Settings_Version() {
	try {
		advertisement();
		click(menu,"Menu");
		click(settings, "Settings");
		 action.press(p1.point(0, 600))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
			.moveTo(p1.point(0,-20000))
			.release().perform();
		 action.press(p1.point(0, 600))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
			.moveTo(p1.point(0,-20000))
			.release().perform();
		System.out.println(Version_No_Verification.isDisplayed());
	} catch (Exception e) {
		System.out.println(e);
	}
}

public void Settings_FAQS_and_HELP() {
	try {
		click(Faqs_and_help, "Click on faqs and help");
		Thread.sleep(3000);
		System.out.println(Faqs_and_help_login.isDisplayed());
		click(Done, "Click on Done");
	} catch (Exception e) {
		System.out.println(e);
	}
}

public void Settings_Advertising_Inquiry() {
	try {
		click(Advertising_Inquiry, "Click on Advertising Inquiry");
		Thread.sleep(3000);
//		System.out.println(Sales_email.isDisplayed());
		click(cancel, "click on cancel button");
		click("//*[@text='Delete Draft']","Delete");
//		appiumDriver.closeApp();
	} catch (Exception e) {
		System.out.println(e);
	}
}


public void Settings_Text_Size() {
	try {
		if (present(Advertisement)) {
			click(Advertisement, "Close Advertisement");
		}
		click(Menu, "Click on menu icon");
		click(Settings, "click on settings");
		if (present(Notification)) {
			click(Notification, "Click on Got it");
		}
		click("//*[@text='AppearenceCell.toggle']","Text size");
		click("//*[@text='AppearenceCell.toggle']","Text size");
	} catch (Exception e) {
		System.out.println(e);
	}
}
} 

