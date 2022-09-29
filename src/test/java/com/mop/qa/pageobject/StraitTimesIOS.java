package com.mop.qa.pageobject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import com.mop.qa.Utilities.ExtentUtility;
import com.mop.qa.Utilities.ReadDataSheet;
import com.mop.qa.testbase.PageBase;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class StraitTimesIOS extends PageBase {
	
	ReadDataSheet rds = new ReadDataSheet();

	public StraitTimesIOS(AppiumDriver appiumDriver) {
		super(appiumDriver);
	}

	public StraitTimesIOS(RemoteWebDriver remoteDriver) {
		super(remoteDriver);
	}
	
/* Android Elements - XPath */
	
	@FindBy(xpath="//*[@text='Close Advertisement']")
	private WebElement ad;

	@FindBy(xpath="//*[@text='CLOSE']")
	private WebElement ad1;

	@FindBy(xpath="//*[@contentDescription='Interstitial close button']")
	private WebElement ad2;
	
	@FindBy(xpath = "//*[@text='AGREE']")
	private WebElement agree;
	
	@FindBy(xpath = "//*[@text='SKIP']")
	private WebElement skip;
	
	@FindBy(xpath = "//*[@text='Continue and log in later']")
	private WebElement loginLater;
	
	//@FindBy(xpath = "//*[@id='textViewHeadline'][1]")
	@FindBy(xpath = "//*[@id='FearturedCell.headlineLabel']")
	private WebElement article_headline;
	
	@FindBy(xpath = "//*[@text='article detail bookmark icon']")
	private WebElement bookmark;
	
	@FindBy(xpath = "//*[@text='bookmark icon selected']")
	private WebElement bookmark_remove;
	
	@FindBy(xpath = "//*[@id='ArticleHeaderViewController.authorNameLabel']")
	private WebElement article_author;
	
	@FindBy(xpath = "//*[@id='ArticleHeaderViewController.authorDesignationLabel']")
	private WebElement author_position;
	
	@FindBy(xpath = "//*[@text='MORE ON THIS TOPIC']")
	private WebElement more_on_this_topic;
	
	@FindBy(xpath = "(//*[@id='StandardCell.footerView'])[1]")
	private WebElement more_on_this_topic_article;
	
	@FindBy(xpath = "(//*[@id='TitleCell.sectionTitleLabel'])[1]")
	private WebElement more_from_straitTimes;
	
	@FindBy(xpath = "//*[@id='imgView'][1]")
	private WebElement straitTimes_firstarticle;
	
	@FindBy(xpath = "//*[@text='MORE FROM THE WEB']")
	private WebElement more_from_web;
	
	//@FindBy(xpath = "((//*[@id='imgView' and (./preceding-sibling::* | ./following-sibling::*)])[5]")
	
	@FindBy(xpath = "(//*[@id='OutbrainCell.titleLabel'])[4]")
	private WebElement more_from_web_article;
	
	@FindBy(xpath = "//*[@text='Just once']")
	private WebElement justonce;
	
	@FindBy(xpath = "//*[@text='RELATED STORIES: ']")
	private WebElement related_stories;
	
	@FindBy(xpath = "(//*[@class='android.widget.Image'])[1]")
	private WebElement related_stories_article;
	
	
	@FindBy(xpath = "(//*[@id='Next'])[1]")
	private WebElement next;
	
	
	@FindBy(xpath = "(//*[@id='Continue'])[1]")
	private WebElement continue1;
	
	
	@FindBy(xpath = "(//*[@id='Horizontal scroll bar, 1 page'])[2]")
	private WebElement allow_tracking;
	//--------------------epaper-----------------------
	
	public void Terms() throws Exception{
		if(present(next)){
			click(next, "Next");
		}else if(present(continue1)){
			click(continue1, "Continue");
		}else if(present(allow_tracking)){
			click(allow_tracking, "Allow Tracking");
	}
	}
	
	@FindBy(xpath = "//*[@text='Menu']")
	private WebElement menu;
	
	@FindBy(xpath = "//*[@text='menu logout icon']")
	private WebElement logout;
	
	@FindBy(xpath = "//*[@text='E-paper']")
	private WebElement epaper;
	
	@FindBy(xpath = "//*[@text='iconDownload']")
	private WebElement epaper_icon;
	
	@FindBy(xpath = "//*[@text='Login']")
	private WebElement login;
	
	@FindBy(xpath = "//*[@text='Log into another account' and @class='UIAStaticText']")
	private WebElement login_into_another_account;
	
	@FindBy(xpath = "//*[@placeholder='Your email or username']")
	private WebElement username;
	
	@FindBy(xpath = "//*[@placeholder='Your password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@text='LOG IN' and @class='UIAButton']")
	private WebElement mysph_login;

	@FindBy(xpath = "//*[@text='No thanks']")
	private WebElement nothanks;
	
	@FindBy(xpath = "//*[@text='Got it!']")
	private WebElement gotit;
	
	@FindBy(xpath = "//*[@text='st archive icon']")
	private WebElement navigation;
	
	@FindBy(xpath = "(//*[@id='iconDownload'])[2]")
	private WebElement download_epaper;
	
	@FindBy(xpath = "//*[@class='UIAView' and ./*[@text='Downloaded']]")
	private WebElement downloaded;
	
	@FindBy(xpath = "//*[@text='menu settings icon']")
	private WebElement settings;
	
	@FindBy(xpath = "//*[@text='DOWNLOADED' and @accessibilityLabel='DefaultCell.title']")
	private WebElement downloaded_settings;
	
	@FindBy(xpath = "//*[@text='SETTINGS']")
	private WebElement back;
	
	@FindBy(xpath = "//*[@text='LOG OUT']")
	private WebElement menu_logout;
	
	@FindBy(xpath = "//*[@text='Log into another account']")
	private WebElement loginintodifferentST;

	@FindBy(xpath = "//*[@class='UIATextField']")
	private WebElement enterusernameST;

	@FindBy(xpath = "//*[@text='Password' and @class='UIAStaticText']")
	private WebElement enterpasswordST;

	@FindBy(xpath = "//*[@id='LOG IN' and @class='UIAButton'] ")
	private WebElement loginbtnST;
	
	 TouchAction action = new TouchAction(appiumDriver);
		PointOption p1= new PointOption();
		PointOption p2= new PointOption();
	
	
	/*public void Sprint12_TC_7942_epaper_User_Should_able_to_download_epaper() throws Exception{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(menu, "Menu");
		if(present(logout)){
			click(logout, "Logout");
		}
		click(epaper, "epaper");
		click(epaper_icon, "download icon");
		click(login, "Login");
		if(present(password)){
			//enterText(username, "autotest_mysph@test.com", "Username");
			enterText(password, "Password123", "Password");
			click(mysph_login, "Login");
		}else if(present(login_into_another_account)){
			click(login_into_another_account, "Login into Other account");
				enterText(username, "autotest_mysph@test.com", "Username");
				enterText(password, "Password123", "Password");
				click(mysph_login, "Login");
		}else{
			enterText(username, "autotest_mysph@test.com", "Username");
		    enterText(password, "Password123", "Password");
		    click(mysph_login, "Login");

		}

			
		
			if(present(nothanks)){
				click(nothanks, "Nothanks");
				click(gotit, "GotIt");
			}
			Thread.sleep(5000);
			click(navigation, "Navigation");
			Thread.sleep(5000);
			click(download_epaper, "Download epaper");
			Thread.sleep(20000);
			System.out.println("Epaper downloaded");
			if(present(downloaded)){
			ExtentUtility.getTest().log(LogStatus.PASS, "epaper download progress",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			}
			
		}
	*/
	/*public void Sprint12_TC_7927_Deleted_Downloaded_epapers() throws Exception{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(menu, "Menu");
		click(settings, "Settings");
		click(downloaded_settings, "Downloaded");
		Boolean display= appiumDriver.findElement(By.xpath("//*[@text='This is where you view and delete all your downloaded E-papers']")).isDisplayed();
		System.out.println("All Downloaded epapers are deleted");
		click(back, "Back");
		//click(e, elementName);
	}
		
		*/
		
	
	
	
	
	public void termsandconditions() {
		try {
			if(present(agree)) {
				click(agree,"Agree");
				click(skip,"Skip");
				click(loginLater,"Continue and login later");
				
			}
				
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Sprint12_TC_8002_Article_Headline() throws Exception{
		 
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		Boolean result=appiumDriver.findElement(By.xpath("//*[@id='FearturedCell.headlineLabel']")).isDisplayed();
		System.out.println("Article Headline is Displayed"+ "-- " +result);
	    
	}
	
	public void Sprint12_TC_7956_Article_Detail_Page_AuthorHead() throws Exception{
		try{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(article_headline, "Article Headline");
		if(present(article_author)){
		System.out.println(article_author.getText());
		isDisplayed(article_author, "Article authour will be shown");
		ExtentUtility.getTest().log(LogStatus.PASS," Article author should be displayed ",
				ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		System.out.println("Article author should be displayed");
		}
	}catch(Exception e) {
		ExtentUtility.getTest().log(LogStatus.PASS,"  Article author name is not present",
				ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		System.out.println("Article author name is not present");
	}

}
	
	@FindBy(xpath = "(//*[@class='UIACollectionView'])[2]")
	private WebElement authors;
	
	public void Sprint12_TC_7979_Article_Detail_Page_AuthorHead_Author_Page() throws Exception{
		try{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(article_headline, "Article Headline");
		if(present(article_author)){
		isDisplayed(article_author, "Article authour head page be shown");
		ExtentUtility.getTest().log(LogStatus.PASS," Article authour head page be shown ",
				ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		System.out.println("Article author should be displayed");
		click(article_author, "Article_Author");
		System.out.println("Article Author page is displayed");
	}else if(present(authors)){
		isDisplayed(authors, "Article authour head page be shown");
		ExtentUtility.getTest().log(LogStatus.PASS," Article authour head page be shown ",
				ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		System.out.println("Article author should be displayed");
		click(authors, "Article_Author");
		System.out.println("Article Author page is displayed");
		
	}
		}
		catch(Exception e) {
		ExtentUtility.getTest().log(LogStatus.PASS,"  For This Article There is no Author, Author page is not displayed",
				ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		System.out.println("For This Article There is no Author, Author page is not displayed");
	}
	
	}
	
	public void Sprint12_TC_7995_Article_Detail_Page_AuthorHead_Designation() throws Exception{
		try{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(article_headline, "Article Headline");
		String text=author_position.getText();
		System.out.println(text);
		isDisplayed(author_position, "Author Designation");
		ExtentUtility.getTest().log(LogStatus.PASS,"  Author Designation should be displayed ",
				ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		System.out.println("Author Designation is displayed");
		}
		catch(Exception e) {
			ExtentUtility.getTest().log(LogStatus.PASS,"  For This Article Author Designation is not provided",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			System.out.println("For This Article Author Designation is not provided");
		}
	
	}
	
	public void Sprint12_TC_7988_Article_Detail_Page_TextSize() throws Exception{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(article_headline, "Article Headline");
		WebElement ele=appiumDriver.findElement(By.xpath("//*[@id='ArticleHeaderViewController.headlineLabel']"));
		Dimension elementsize=ele.getSize();
		System.out.println("TextSize of First Article is Displayed"+elementsize);
		WebElement ele1=appiumDriver.findElement(By.xpath("(//*[@class='UIAStaticText'])[5]"));
		Dimension elementsize1=ele1.getSize();
		System.out.println("TextSize of Second Article is Displayed"+elementsize1);
	}
	
	public void Sprint12_TC_7984_Article_Detail_Page_More_From_StraitTimes() throws Exception{
		try{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		  click(article_headline, "Article headline");
		  swipeDown_NVerify("(//*[@id='TitleCell.sectionTitleLabel'])[1]");
		  Thread.sleep(5000);
			action.press(p1.point(0, 600))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
			.moveTo(p1.point(0,-20000))
			.release().perform();
		  click(more_from_straitTimes, "More From straitTimes");
		  Thread.sleep(5000);
			ExtentUtility.getTest().log(LogStatus.PASS,"  First Article is clicked under More From StraitsTimes ",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			System.out.println("First Article is clicked under More From StraitsTimes");
		  
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void Sprint12_TC_7973_Article_Detail_Page_BookMark() throws Exception{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(article_headline, "Article headline");
		if(present(bookmark)){
		click(bookmark, "Element is BookMarked");
		System.out.println("BookMark Successfully");
		}
		
		if(present(bookmark_remove)){
			Thread.sleep(5000);
			click(bookmark_remove, " BookMark is Removed Successfully");
			System.out.println("Removed BookMark Successfully");
		}
	}
	
	public void Sprint12_TC_7952_Article_Detail_Page_More_From_Web() throws Exception{
		try{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		  click(article_headline, "Article headline");
		  swipeDown_NVerify("//*[@text='MORE FROM THE WEB']");
			action.press(p1.point(0, 600))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
			.moveTo(p1.point(0,-20000))
			.release().perform();
		  click(more_from_web, "More From Web");
		  Thread.sleep(5000);
					ExtentUtility.getTest().log(LogStatus.PASS,"  First Article is clicked under More From Web ",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					System.out.println("First Article is clicked under More From Web");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public void Sprint12_TC_7983_Article_Detail_Page_More_On_This_Topic() throws Exception{
		try{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		  click(article_headline, "Article headline");
		  swipeDown_NVerify("//*[@text='MORE ON THIS TOPIC']");
		  click(more_on_this_topic, "More On This Topic");
			action.press(p1.point(0, 600))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
			.moveTo(p1.point(0,-5000))
			.release().perform();
		            Thread.sleep(5000);
					ExtentUtility.getTest().log(LogStatus.PASS,"  More On this topic article should be displayed ",
							ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
					System.out.println("More On this topic article is displayed");
		}
			
				catch(Exception e){
				System.out.println(e.getMessage());	
				}
					
			}
	
	@FindBy(xpath = "//*[@text='Menu']")
	private WebElement menu1;
	
	@FindBy(xpath = "(//*[@text='SINGAPORE'])[3]")
	private WebElement singapore;
	
	@FindBy(xpath = "(//*[@text='FearturedCell.footerView']/*/*[@class='UIAImage' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAButton']])[2]")
	private WebElement singapore_bookmark;
	
	@FindBy(xpath = "(//*[@text='FearturedCell.footerView']/*/*[@class='UIAImage' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAButton']])[2]")
	private WebElement singapore_bookmark_remove;
	
	@FindBy(xpath = "//*[@text='MENU']")
	private WebElement back_menu;
	
	public void Sprint12_TC_7512_Article_listing_page_via_section_page_bookmark() throws Exception{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		  click(menu1, "Menu");
		  Thread.sleep(5000);
		  click(singapore, "Singapore");
		  Thread.sleep(5000);
		  click(singapore_bookmark, "Bookmark");
		  Thread.sleep(5000);
		  takeScreenShot();
		  System.out.println("Article Bookmarked successfully");
		  Thread.sleep(5000);
		  click(singapore_bookmark_remove, "Article Bookmark removed successfully");
		  takeScreenShot();
		  Thread.sleep(5000);
		  click(back_menu, "Back");
		  
	}
	@FindBy(xpath = "(//*[@id='MORE FROM ST'])[1]")
	private WebElement more_from_st;
	
	@FindBy(xpath = "//*[@text='ST REWARDS']")
	private WebElement st_rewards;
	
	@FindBy(xpath = "//*[@text='ST JOBS']")
	private WebElement st_jobs;
	
	
	
	public void Sprint12_TC_7971_Article_listing_page_via_section_pages_more_link_on_sectionpage() throws Exception{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		  click(menu1, "Menu");
		  Thread.sleep(5000);
		  swipeDownNVerify("(//*[@id='MORE FROM ST'])[1]");
		  click(more_from_st, "More from ST");
		  Thread.sleep(5000);
		  if(st_rewards.isDisplayed()){
				ExtentUtility.getTest().log(LogStatus.PASS, " Rewards displayed",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				System.out.println(" Rewards displayed");
			}
			if(st_jobs.isDisplayed()){
				takeScreenShot();
				System.out.println(" Jobs displayed");
			}
		  
	}
	@FindBy(xpath = "//*[@text='menu login icon']")
	private WebElement login1;
	
	@FindBy(xpath = "//*[@text='Log into another account']")
	private WebElement login_into_other_account;
	
	@FindBy(xpath = "//*[@text='LOG IN']")
	private WebElement LOGIN;
	
	@FindBy(xpath = "(//*[@value='0'])[2]")
	private WebElement ADL_off;
	
	@FindBy(xpath = "(//*[@value='1'])[1]")
	private WebElement ADL_on;
	
	@FindBy(xpath = "//*[@text='LOG OUT']")
	private WebElement logout1;
	
	
	public void Sprint12_TC_7949_epaper_Auto_DL_turn_Off() throws Exception{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(menu1, "Menu");
		  Thread.sleep(5000);
		  if(present(logout)){
			  click(logout, "Logout");
		  }
		  click("//*[@text='menu login icon' and ./parent::*[@class='UIATable']]","Login");
		  click("//*[@text='Continue']","Continue");
			Thread.sleep(5000);
		if (present(loginintodifferentST)) {
			click(loginintodifferentST, "login into different account");
		}
		enterusernameST.sendKeys(" autotest_mysph@test.com");
		appiumDriver.hideKeyboard();
		enterpasswordST.click();
		enterpasswordST.sendKeys("Password123");
		appiumDriver.hideKeyboard();
		click(loginbtnST, "Login");
		
	      if(present(nothanks)){
	    	  click(nothanks, "Nothanks");
	    	  click(gotit, "Gotit");
	      }
	      click(settings, "Setting");
	      if(present(gotit)){
	    	  click(gotit, "Gotit");  
	      }
	      if(ADL_off.isDisplayed()){
	    	  System.out.println("Auto DL is turn off,epaper is not able to download automatically");
	    	  takeScreenShot();
	      }
//	      click(logout1, "Logout");
		
	}
	
	
	@FindBy(xpath = "//*[@text='iconDownload']")
	private WebElement icon;
	
	@FindBy(xpath = "//*[@id='DOWNLOADED']")
	private WebElement icon_download;
	
	@FindBy(xpath = "//*[@text='DELETE']")
	private WebElement delete;
	
	@FindBy(xpath = "//*[@text='SETTINGS']")
	private WebElement back1;
	
	public void Sprint12_TC_7893_epaper_clear_all_download() throws Exception{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
	      click(epaper, "Epaper");
	      Thread.sleep(5000);
	      click(icon, "Download epaper");
	      Thread.sleep(5000);
	      click(menu1, "Menu");
		  Thread.sleep(5000);
		  click(settings, "Setting");
		  Thread.sleep(5000);
		  click(icon_download, "Downloaded");
		  Thread.sleep(5000);
		  System.out.println("Epapers are downloaded");
		  click(delete, "Delete");
		  Thread.sleep(5000);
		  System.out.println("Clear all downloads");
		  takeScreenShot();
		  click(back1, "Back");
		  Thread.sleep(5000);
		  click(logout1, "Logout");
		  Thread.sleep(5000);
}
	
	
	@FindBy(xpath = "//*[@text='st archive icon']")
	private WebElement st_icon;
	
	@FindBy(xpath = "(//*[@id='Download'])[1]")
	private WebElement paper1;
	
	@FindBy(xpath = "(//*[@id='iconDownload'])[2]")
	private WebElement paper2;
	
	@FindBy(xpath = "//*[@id='trash']")
	private WebElement trash;
	
	@FindBy(xpath = "(//*[@id='iconTrash'])[1]")
	private WebElement remove1;
	
	@FindBy(xpath = "(//*[@id='Remove'])[2]")
	private WebElement remove2;
	
	@FindBy(xpath = "//*[@text='DONE']")
	private WebElement done;
	
	@FindBy(xpath = "//*[@text='icon search cancel']")
	private WebElement cancel;
	
	public void Sprint12_TC_7907_epaper_Delete_Individual() throws Exception{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(menu1, "Menu");
		  Thread.sleep(5000);
		  if(present(logout)){
			  click(logout, "Logout");
		  }
		  if(present(gotit)){
		  click(gotit, "gotit");
	     }
		  click(login1, "Login");
	      Thread.sleep(5000);
	      try{
	      appiumDriver.findElement(By.xpath("//*[@placeholder='Your email or username']")).sendKeys("autotest_mysph@test.com");
		  appiumDriver.findElement(By.xpath("//*[@placeholder='Your password']")).sendKeys("Password123");
		  click(LOGIN, "LOGIN");
		  }
	      catch(Exception e){
	    	  click(login_into_other_account, "Login into Other account");
	    	  appiumDriver.findElement(By.xpath("//*[@placeholder='Your email or username']")).sendKeys("autotest_mysph@test.com");
			  appiumDriver.findElement(By.xpath("//*[@placeholder='Your password']")).sendKeys("Password123");
			  click(LOGIN, "LOGIN");
	      }
	      click(epaper, "Epaper");
	      Thread.sleep(5000);
	      click(st_icon, "ST_icon");
	      Thread.sleep(5000);
	      click(paper1, "First paper");
	      Thread.sleep(5000);
	      //click(paper2, "second paper");
	      //Thread.sleep(5000);
	      click(trash, "Delete");
	      Thread.sleep(5000);
	      click(remove1, "First paper removed");
	      Thread.sleep(5000);
	      //click(remove2, "second paper removed");
	      //Thread.sleep(5000);
	      click(done, "Done");
	      Thread.sleep(5000);
	      click(cancel, "Cancel");
	      Thread.sleep(5000);
	      click(menu1, "Menu");
		  Thread.sleep(5000);
		  if(present(logout)){
			  click(logout, "Logout");
		  }
		  Thread.sleep(5000);
	}
	
	
	@FindBy(xpath = "//*[@id='FearturedCell.headlineLabel']")
	private WebElement article1;
	
	@FindBy(xpath = "//*[@id='ArticleHeaderViewController.publishedDateLabel']")
	private WebElement published_date;
	
	public void Sprint12_TC_7981_Article_Details_page_Published_or_Updated() throws Exception{
		try{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(article1, "Article");
		Thread.sleep(5000);
		String text=published_date.getText();
		System.out.println(text);
		if(present(published_date));
		{
			ExtentUtility.getTest().log(LogStatus.PASS, "Article Published or updated time available",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			System.out.println("Article Published or updated time available");
		}
		
		}catch (Exception e) {
					System.out.println(e);
		}
	}
	
	@FindBy(xpath = "//*[@id='FearturedCell.subheadlineLabel']")
	private WebElement subheadline;
	
	@FindBy(xpath = "//*[@id='share floating icon']")
	private WebElement share;
	
	public void Sprint12_TC_7951_Share_with_without_scrolling()throws Exception{
		try{
			if (present(ad)) {
				click(ad, "close ad");
			}
			else if (present(ad1)){
				click(ad1, "close ad");
			}
			else if (present(ad2)){
				click(ad2, "close ad");
			}
			click(subheadline, "Subheadline");
			Thread.sleep(5000);
			if(present(share)){
				click(share, "Sharebtn");
				ExtentUtility.getTest().log(LogStatus.PASS, "Share Button available",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				System.out.println("Share Button available");
			}
			//click(e, elementName);
			appiumDriver.resetApp();
		}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
				
			}
	
	
	@FindBy(xpath = "//*[@text='ArticleHeaderViewController.imageView']")
	private WebElement article_img;
	
	@FindBy(xpath = "//*[@id='ArticleHeaderViewController.headlineLabel']")
	private WebElement article_title;
	
	public void Sprint12_TC_7961_Article_details_page_with_embedded_image()throws Exception{
		try{
			if (present(ad)) {
				click(ad, "close ad");
			}
			else if (present(ad1)){
				click(ad1, "close ad");
			}
			else if (present(ad2)){
				click(ad2, "close ad");
			}
			click(subheadline, "Subheadline");
			Thread.sleep(5000);
			if(present(article_img)&&present(article_title))
			{
				ExtentUtility.getTest().log(LogStatus.PASS, "Article loaded along with Image",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				System.out.println("Article loaded along with Image");
			}
			
		} catch (Exception e) {
						System.out.println(e);
			}
		}
	
	@FindBy(xpath = "//*[@text='PODCASTS']")
	private WebElement podcast;
	
	@FindBy(xpath = "(//*[@id='share_icon'])[1]")
	private WebElement podcast_share;
	
	public void Sprint12_TC_7968_Article_details_page_Podcast_sharing() throws Exception{
		try{
			if (present(ad)) {
				click(ad, "close ad");
			}
			else if (present(ad1)){
				click(ad1, "close ad");
			}
			else if (present(ad2)){
				click(ad2, "close ad");
			}
			click(menu, "Menu");
			Thread.sleep(5000);
			action.press(p1.point(0, 600))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) 
			.moveTo(p1.point(0,-20000))
			.release().perform();
			click(podcast, "Podcast");
			Thread.sleep(5000);
			click(podcast_share, "Podcast share");
			Thread.sleep(5000);
			if(present(podcast_share)){
				ExtentUtility.getTest().log(LogStatus.PASS, "Article shared from Podcast section",
						ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
				System.out.println("Article shared from Podcast section");
			}
			appiumDriver.resetApp();
		}catch(Exception e){
			System.out.println("Article is not shared from Podcast section");
		}
		
	}
	public void swipeHorizantal() throws InterruptedException, IOException
	{
	 

	WebElement elementXpath=appiumDriver.findElement(By.xpath("//*[@id='BookmarkCell.headlineLabel']"));
	ExtentUtility.getTest().log(LogStatus.PASS,"  BookMark Icon ",
			ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
	System.out.println("BookMark Icon");

	int width1=(int) ((int )(elementXpath.getLocation().getX())+(elementXpath.getSize().getWidth()*0.8));
	int width2=(int) ((int )(elementXpath.getLocation().getX())+(elementXpath.getSize().getWidth()*0.1));

	int height=(int) ((int )(elementXpath.getLocation().getY())+(elementXpath.getSize().getHeight()*0.5));
	System.out.println(width1);
	System.out.println(width2);
	System.out.println(height);
	TouchAction act=new TouchAction(appiumDriver);


	for(int i=0;i<5;i++)
	{
	  act.press(PointOption.point(width1, height))
	 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	 .moveTo(PointOption.point(width2, height)).release().perform();
	  Thread.sleep(2000);
	 
	 System.out.println("Swipe Left to Delete Bookmark is deleted successfully");
	}

	
}
	@FindBy(xpath = "//*[@id='FearturedCell.headlineLabel']")
	private WebElement article;
	
	@FindBy(xpath = "//*[@text='article detail bookmark icon']")
	private WebElement bookmark1;
	
	@FindBy(xpath = "(//*[@class='UIAButton'])[1]")
	private WebElement close;
	
	@FindBy(xpath = "//*[@id='Menu']")
	private WebElement Menu;
	
	@FindBy(xpath = "(//*[@text='menu bookmarks icon'])[1]")
	private WebElement bookmark_icon;
	
	@FindBy(xpath = "//*[@id='MENU']")
	private WebElement back2;
	
	public void TC_7904_Bookmark_Swipe_left_to_delete_bookmark() throws Exception{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(article, "Article");
		click(bookmark1, "Bookmark");
		click(close, "Close");
		click(Menu, "Menu");
		click(bookmark_icon, "bookmark icon");
		ExtentUtility.getTest().log(LogStatus.PASS,"  BookMark Icon ",
				ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		System.out.println("BookMark Icon");
		if(present(gotit)){
			click(gotit, "Gotit");
		}
		swipeHorizantal();
		Thread.sleep(5000);
		click(back2, "Menu");
		
	}	
	
	@FindBy(xpath = "//*[@id='ArticleHeaderViewController.authorNameLabel']")
	private WebElement author_name;
	
	@FindBy(xpath = "//*[@id='TitleCell.sectionTitleLabel']")
	private WebElement author_articlepage;
	
	@FindBy(xpath = "(//*[@class='UIACollectionView'])[2]")
	private WebElement authornames;
	
	public void TC_8005_Article_Listing_Page_Via_authors_Authorspage() throws Exception{
		try{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(article, "Article");
		if(present(author_name)){
		click(author_name, "AuthorName");
		Boolean ele=author_articlepage.isDisplayed();
		ExtentUtility.getTest().log(LogStatus.PASS," Articles is Displayed in Author article page ",
				ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		System.out.println("Articles is Displayed in Author article page");
}else if(present(authornames)){
	click(authornames, "AuthorName");
	Boolean ele=author_articlepage.isDisplayed();
	ExtentUtility.getTest().log(LogStatus.PASS," Articles is Displayed in Author article page ",
			ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
	System.out.println("Articles is Displayed in Author article page");
	
}
		}catch(Exception e){
			ExtentUtility.getTest().log(LogStatus.PASS," Author is not present for this article ",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			System.out.println("Author is not present for this article");
		}
		
	}
	
	public void TC_7992_Article_Listing_Page_Via_authors_Bookmark() throws Exception{
		try{
		if (present(ad)) {
			click(ad, "close ad");
		}
		else if (present(ad1)){
			click(ad1, "close ad");
		}
		else if (present(ad2)){
			click(ad2, "close ad");
		}
		click(article, "Article");
		if(present(author_name)){
		click(author_name, "AuthorName");
		Boolean ele=author_articlepage.isDisplayed();
		ExtentUtility.getTest().log(LogStatus.PASS," Articles is Displayed in Author article page ",
				ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
		System.out.println("Articles is Displayed in Author article page");
		appiumDriver.findElement(By.xpath("(//*[@class='UIAImage'])[7]")).click();
		System.out.println("User is Bookmarked successfully in authors page");
		appiumDriver.findElement(By.xpath("(//*[@class='UIAImage'])[7]")).click();
		System.out.println("User is UnBookmarked successfully in authors page");
		
		}
		else if(present(authornames)){
			click(authornames, "AuthorName");
			Boolean ele=author_articlepage.isDisplayed();
			ExtentUtility.getTest().log(LogStatus.PASS," Articles is Displayed in Author article page ",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			System.out.println("Articles is Displayed in Author article page");
			appiumDriver.findElement(By.xpath("((//*[@class='UIACollectionView'])[2]//*[@class='UIAImage'])[2]")).click();
			System.out.println("User is Bookmarked successfully in authors page");
			appiumDriver.findElement(By.xpath("((//*[@class='UIACollectionView'])[2]//*[@class='UIAImage'])[2]")).click();
			System.out.println("User is UnBookmarked successfully in authors page");
		}
		}
		catch(Exception e){
			ExtentUtility.getTest().log(LogStatus.PASS," Author is not present for this article ",
					ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
			System.out.println("Author is not present for this article");
		}
		
	}
}
		
	


