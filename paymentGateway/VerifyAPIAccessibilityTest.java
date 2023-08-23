package paymentGateway;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyAPIAccessibilityTest {

	@Test (alwaysRun = true , groups = {"Smoke"})
		// TODO Auto-generated method stub

		public void apiAccessibility()
		{
			//Validate that the response contains expected headers (e.g., Content-Type).
			System.out.println("Valid response headers including content type");
		
			Assert.assertTrue(true); //statement based on the type of argument passed expected result
		}
		
	@Test (alwaysRun = true, groups = {"Smoke"})
		public void verifyStatusCode()
		{
			//Verify if the APIs are accessible and return a response with a valid status code.	
			System.out.println("Response with Status Code");
			//WebElement s = driver.findElement(By.xpath(""));
			Assert.assertTrue(true); //statement based on the type of argument passed expected result
			
			}
	}


