package org.familysearch.products.gallery.application.pageobject.landingpage;

import org.familysearch.products.gallery.testframework.selenium.fw.FwBasicWebPage;
import org.openqa.selenium.WebDriver;

public class MainLandingPage extends FwBasicWebPage {

	//************constructors**************//
	protected MainLandingPage(WebDriver driver) {
		super(driver);
	}
	
	//************Instance Methods**************//
	public static MainLandingPage getInstance(WebDriver driver) {
		return new MainLandingPage(driver);
	}
	public HeaderSection getHeaderSection(){
		return HeaderSection.getInstance(driver);
	}
	
}
