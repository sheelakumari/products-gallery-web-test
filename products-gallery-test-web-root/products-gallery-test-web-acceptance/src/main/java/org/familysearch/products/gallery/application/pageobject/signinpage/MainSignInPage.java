package org.familysearch.products.gallery.application.pageobject.signinpage;

import org.familysearch.products.gallery.testframework.selenium.fw.FwBasicWebPage;
import org.openqa.selenium.WebDriver;

public class MainSignInPage extends FwBasicWebPage {
	
	//************constructors**************//
	protected MainSignInPage(WebDriver driver) {
		super(driver);
	}
	
	//************Instance Methods**************//
	public static MainSignInPage getInstance(WebDriver driver) {
		return new MainSignInPage(driver);
	}
	public SignInBoxSection getSignInBoxSection(){
		return SignInBoxSection.getInstance(driver);
	}

}
