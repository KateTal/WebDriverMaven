package RegretionTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeTest
	public void createDBConnection () {
		System.out.println("Create DB connection");
	}
	
	@AfterTest
	public void closeDBConnection () {
		System.out.println("Close DB connection");
	}
	
@BeforeMethod	
	public void launchBrowser() {
		System.out.println("Launchinh the browser");
	}

@AfterMethod
public void closeBrowser() {
	System.out.println("Close");
}
	
	
@Test	(priority=2)	
public void doLogin(){
			System.out.println("Executing login test");
			
		}

@Test	(priority=1)	
public void doUserReg(){
			System.out.println("Executing User registration test");
			System.out.println();
		}

	

}
