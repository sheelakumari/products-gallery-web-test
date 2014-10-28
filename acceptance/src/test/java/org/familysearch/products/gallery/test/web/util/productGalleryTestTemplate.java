package org.familysearch.products.gallery.test.web.util;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.familysearch.products.gallery.application.pageobject.landingpage.MainLandingPage;
import org.familysearch.products.gallery.application.pageobject.signinpage.MainSignInPage;
import org.familysearch.products.gallery.application.pageobjects.util.GalAppRunner;
import org.testng.annotations.*;

public class productGalleryTestTemplate extends GalleryTestBase{
	
	private static final Logger logger = org.apache.log4j.Logger.getLogger( productGalleryTestTemplate.class );
	GalAppRunner webApp;
	
	@Factory(dataProviderClass=org.familysearch.products.gallery.testframework.selenium.driver.TestBrowserDataProvider.class, dataProvider="testBrowserDataProvider")
	public productGalleryTestTemplate(String testBrowserName, String testBrowserVersion, String testBrowserOS) {
		super( testBrowserName, testBrowserVersion, testBrowserOS);
		logger.info("GalAppTestTemplate instance constructed with browser values: " + testBrowserName + ", " + testBrowserVersion + ", " + testBrowserOS );
	}
	
	
	@BeforeMethod()
	public void setup() throws Exception {
		webApp = GalAppRunner.initializeApplication()
				.withDriver( getNewTestBrowserDriver() )
				.andUrl( getApplicationUrl() )
				.andStartApp();
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		if ( webApp !=  null ) {
			webApp.closeApp();
		}
	}
	
	
	//////////////////////////////////////////////////////////////////////////////
	////////////////////////////////  TESTS  /////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////
	
	
	//@Test(groups={""},description = "")
	@Test(enabled=false)
	public void testTemplate() throws InterruptedException{
		logger.info("Ensuring that the test template runs.");
	}
}
