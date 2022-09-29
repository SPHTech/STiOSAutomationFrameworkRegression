package com.mop.qa.pageobject;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import com.mop.qa.Utilities.ExtentUtility;
import com.mop.qa.testbase.PageBase;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;

public class StraitTimes_ios_objects extends PageBase{
	
	public StraitTimes_ios_objects(RemoteWebDriver remoteDriver) {
		super(remoteDriver);
	}

	public StraitTimes_ios_objects(AppiumDriver appiumDriver) {
		super(appiumDriver);
	}

	//xpath for ios
	@FindBy(xpath = "//*[@label='Close Advertisement']")
	private WebElement ad1;

	@FindBy(xpath = "//*[@text='CLOSE' and @class='UIAStaticText']")//*[@text='CLOSE']
	private WebElement ad2;
	
	 @FindBy(xpath = "//*[@x='1122' and @y='204']")
	private WebElement close_ad_3;
	 
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
	public void onboarding() {
		try {
			if(ad(agree)){
				click(agree, "agree");
				click(skip, "skip");
				click(continue_login, "continue and login");
				click(contin, "continue");
			}
			
			if(ad(askapp_notto_track))
					{		click(askapp_notto_track, "ask app not to track");
			 //click(allow, "allow tracking");
					}
			// advertisement();
		} catch (Exception e) {
			System.out.println(e);

		}
	}
	
	@FindBy(xpath = "//*[@id='Home']")
	private WebElement Home_icon;
	
	@FindBy(xpath = "(//*[@id='share_icon'])[1]")
	private WebElement share_icon_home_page;
	
	@FindBy(xpath = "(//*[@id='bookmark_icon'])[1]")
	private WebElement Bookmark_icon_Hp;
	
	@FindBy(xpath = "(//*[@knownSuperClass='UIButton'])[2]")
	private WebElement Bookmark_icon;
	
	
	@FindBy(xpath = "//*[@id='Menu']")
	private WebElement StraitTimesMenu;
	
	@FindBy(xpath = "//*[@id='menu bookmarks icon']")
	private WebElement Bookmark_layout;
	
	@FindBy(xpath = "//*[@id='Got it!']")
	private WebElement gotit_popup;
	
	@FindBy(xpath = "(//*[@class='UIAButton'])[2]")
	private WebElement bookmarkicon_bookmark_page;
	
	@FindBy(xpath = "(//*[@class='UIAButton'])[3]")
	private WebElement share_bookmarkicon_bookmark_page;
	
	@FindBy(xpath = "//*[@id='Close']")
	private WebElement close_share;
	
	@FindBy(xpath = "(//*[@id='BookmarkCell.headlineLabel'])[1]")
	private WebElement bookmark_article_headings;
	
	@FindBy(xpath = "//*[@id='ArticleHeaderViewController.headlineLabel']")
	private WebElement article_title;
	
	@FindBy(xpath = "(//*[@class='UIAButton'])[9]")
	private WebElement close_article;
	
	
	public void TC_7464_7975_7944_share_from_bookmark_page_should_work() throws Exception {
		try {
			appiumDriver.closeApp();
			appiumDriver.launchApp();
			
			 advertisement();
			click(Home_icon,"Home");
				click(Bookmark_icon, "Bookmark article from homepage");
				System.out.println("Enabled bookmarked from listing");	
			click(StraitTimesMenu, "StraitTimes Menu");
			click(Bookmark_layout, "Bookmark_layout");
			if(present(gotit_popup))
			{
				click(gotit_popup, "gotit popup");
			}
			click(share_bookmarkicon_bookmark_page,"able to share from bookmark");
			if(ad(close_share)){
				click(close_share,"close_share");}
			click(bookmark_article_headings,"open article from bookmark");
			Thread.sleep(2000);
			if(ad(article_title)){
				System.out.println("User able to open article from bookmark page");
			}
			click("//*[@text='close icon']","close article from bookmark");
			click(bookmarkicon_bookmark_page,"Delete from bookmark");
			} catch (Exception e) {
						System.out.println(e);
			}
		}
	
	@FindBy(xpath = "//*[@id='FearturedCell.subheadlineLabel']")
	private WebElement article1;
	
	@FindBy(xpath="//*[@id='FearturedCell.headlineLabel']")
	private WebElement article2;
	
	public void TC_7960_Homepage_UI_navigation_is_fine() throws Exception {
		try {
			 advertisement();
			click(Home_icon,"Home");
		 if(ad(share_icon_home_page)){
//				swipeDownNVerify("(//*[@id='share_icon'])[1]");
				click(share_icon_home_page, "share article from homepage");
				System.out.println("able to share article from homepage");
				if(ad(close_share))
					click(close_share,"close_share");
				click(Bookmark_icon, "Bookmark article from homepage");
				System.out.println("Enabled bookmarked from listing");
				click(Bookmark_icon, "Bookmark article from homepage");
				System.out.println("Disabled bookmarked from listing");
				
			}
		 
				
			if(ad(article2)){
				click(article2, "open article from homepage");
				Thread.sleep(5000);
				if(ad(article_title)){
					System.out.println("User able to open article from home page");
				}
				
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
}
}
	
	
	
	
	
	@FindBy(xpath = "//*[contains(text(),'MORE')]")
	private WebElement More_link;
	
	@FindBy(xpath = "//*[@id='disclosure_indicator_icon']")
	private WebElement Rightarrow;
	
	public void TC_7932_Homepage_MoreLink() throws Exception {
		try {
			 advertisement();
			click(Home_icon,"Home");
		
				swipeDownNVerify("//*[contains(text(),'MORE')]");
				if(ad(More_link)&& ad(Rightarrow))
					click(More_link,"More");
				Thread.sleep(3000);
			    
				System.out.println("More link opens respective section");
				ExtentUtility.getTest().log(LogStatus.PASS, "More link opens respective section",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			
		}
		catch (Exception e) {
			System.out.println(e);
}
}
	
	
	@FindBy(xpath = "//*[@id='SectionListingCell.titleLabel'and@text='OPINION']")
	private WebElement opinion;
	
	@FindBy(xpath = "(//*[@id='OpinionCell.articleTitleLabel'])[1]")
	private WebElement opinion_article1;
	
	@FindBy(xpath = "(//*[@id='OpinionCell.authorNameLabel'])[1]")
	private WebElement opinion_article1_author;
	
	
	
	public void TC_7929_Opinion_Correspontants_articles() throws Exception {
		try {
			 advertisement();
			click(Home_icon,"Home");
			click(StraitTimesMenu, "StraitTimes Menu");
			click(opinion, "opinion");
			if(ad(opinion_article1_author)){
				click(opinion_article1, "opinion article");
				System.out.println("Able to navigate Author specific articles");
				ExtentUtility.getTest().log(LogStatus.PASS, "Able to navigate Author specific articles",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			}
			    
				
		}
		catch (Exception e) {
			System.out.println(e);
}
}
	
	@FindBy(xpath = "//*[@id='Latest']")
	private WebElement latest;
	
		@FindBy(xpath = "//*[@id='FearturedCell.headlineLabel']")
	private WebElement latest_article1;
	
	
	public void TC_7905_LatestTab_navigate_article_page() throws Exception {
		try {
			 advertisement();
			click(Home_icon,"Home");
			click(latest, "latest");
			click(latest_article1,"latest_article1");
				System.out.println("Able to navigate latest articles");
				ExtentUtility.getTest().log(LogStatus.PASS, "Able to navigate latest articles",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				
		}
		catch (Exception e) {
			System.out.println(e);
}
}
	
	
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
	@FindBy(xpath = "//*[@accessibilityLabel='DoubleButtonCell.loginButton']")
	private WebElement loginSTunderManageAcc;

	@FindBy(xpath = "//*[@text='Log into another account']")
	private WebElement loginintodifferentST;

	@FindBy(xpath = "//*[@class='UIATextField']")
	private WebElement enterusernameST;

	@FindBy(xpath = "//*[@text='Password' and @class='UIAStaticText']")
	private WebElement enterpasswordST;

	@FindBy(xpath = "//*[@id='LOG IN' and @class='UIAButton'] ")
	private WebElement loginbtnST;

	@FindBy(xpath = "//*[@text='No thanks']")	
	private WebElement adNoThanks;

	@FindBy(xpath = "//*[@text='Got it!']")
	private WebElement adGotit;
	@FindBy(xpath = "(//*[@text='menu logout icon'])[1]")
	private WebElement logout;
 
	@FindBy(xpath = "//*[@text='share']")
	private WebElement shareicon;
	
	@FindBy(xpath = "(//*[@class='UIAImage'])[1]")
	private WebElement epaper;
 
	@FindBy(xpath = "//*[@id='Close']")
	private WebElement close;
	
	@FindBy(xpath = "(//*[@class='UIAView'])[20]")
	private WebElement epaper2;
	
	@FindBy(xpath = "//*[@id='icon-search-cancel']")
	private WebElement icon_search_cancel;
	
	@FindBy(xpath = "//*[@id='E-PAPER']")
	private WebElement back_from_epaper;
	
	@FindBy(xpath="//*[@text='Login']")
	private WebElement loginepaper;
	
	
	public void TC_7969_share_of_epaper_should_work() throws Exception {
		try {
			 advertisement();
			 click(epapericon, "E-paper");
			 click(onpaper, " e-paper");
			 if(present(loginepaper)) {
			 click("//*[@text='Login']","Login");
			 click("//*[@text='Continue']","Continue");
					Thread.sleep(5000);
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
			 }
				click(epaper2," ");
				click(epaper2," ");
				click(shareicon,"shareicon");
				click("(//*[@class='UIAView'])[43]","epaper");
				click(shareicon,"shareicon");
				System.out.println("User able to share epaper");
				ExtentUtility.getTest().log(LogStatus.PASS, "User able to share epaper",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				click(close,"close");
				click(epaper2,"epaper");
				click(icon_search_cancel,"cancel");
				click(back_from_epaper,"back");
				click(StraitTimesMenu, "menu");
				if (ad(logout))
					click(logout, "logout");

				

		}
		catch (Exception e) {
			System.out.println(e);
}
}
	@FindBy(xpath = "//*[@text='menu settings icon']")
	private WebElement settings;
	
	@FindBy(xpath = "//*[@text='Got it!'")
	private WebElement gotit_first;
	
	@FindBy(xpath = "(//*[@text='E-MAIL CUSTOMER SERVICE'])[2]")
	private WebElement email_customer;
	
	@FindBy(xpath = "//*[@text='stics@sph.com.sg']")
	private WebElement emailId;
	
	
	
	public void TC_7998_emailCustomer() throws Exception{
		try {
			advertisement();
						click(StraitTimesMenu,"StraitTimesMenu");
						click(settings, "Settings");
						if(ad(gotit_first))
							click(gotit_first, "Got it");
						
						
						//singleScrollDown();
						swipeUp();
						if(ad(email_customer)){
							click(email_customer, "email_customer");
							
						}
						if(ad(emailId)){
								System.out.println("User able to send inquiry");
							ExtentUtility.getTest().log(LogStatus.PASS, "User able to send inquiry",
									ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
						}
				 
			 }
		catch (Exception e) {
			System.out.println(e);
}
	}
	

}
