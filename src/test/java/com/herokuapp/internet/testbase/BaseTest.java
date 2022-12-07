package com.herokuapp.internet.testbase;

import com.herokuapp.internet.propertyreader.PropertyReader;
import com.herokuapp.internet.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod
    public void trearDown() {
        //closeBrowser();
    }
}
