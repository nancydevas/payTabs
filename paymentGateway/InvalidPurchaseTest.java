package paymentGateway;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidPurchaseTest {

	 
		// TODO Auto-generated method stub
		
	@Test(dataProvider = "OrderConfirmationId", groups = {"Functional", "Regression"} ) 
		public void  paymentMethods()
		{
			//Test with various payment methods (credit card, debit card, PayPal, etc.) and validate responses.
			System.out.println("payment methods (credit card, debit card, PayPal, etc.) and validate responses");
			Assert.assertTrue(true); //statement based on the type of argument passed expected result
			//Assert.assertTrue(true); -----> Status code
			//Assert.assertTrue(true); -----> Response time
		}
		
		@Test (groups = {"Functional","Regression"})
		public void edgeCases()
		{
			//Attempt purchases with edge cases (zero amount, negative amount) and confirm error responses.
			System.out.println("(zero amount, negative amount)");
			Assert.assertTrue(true); //statement based on the type of argument passed expected result
		}
		
		@DataProvider
		public String[] sendData()
		{
			String[] OrderConfirmationId = new String[20];
			
			//code
			
			return OrderConfirmationId;
			
			
		}
		
		
	}
	


