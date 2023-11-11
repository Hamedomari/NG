package myapp.tests;

import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.Driver2;
import org.testng.annotations.Test;

public class DriverTest {

    @Test
    public void test(){
        Driver2.getDriver().get(ConfigReader.getProperty("amazon_url"));
    }
    @Test
    public void test1(){
       Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
    }

}
