package paymentGateway;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SuccessfulPurchaseTest {


	//(groups = {"Functional"})
	@Test (alwaysRun = true,dataProvider = "OrderConfirmationId", groups = {"Functional", "Regression"}) // dependsOnGroups = "Smoke"
		public void validPurchase()
		{
			//Verify that a purchase request with valid parameters returns a successful response.
		System.out.println("valid parameters returns a successful response");
		/* Assuming valid purchase parameters and class payment with valid methods 
        String paymentResponse = payment.makePayment("user1", 100.0);
		Assert.assertEquals(paymentResponse, "Payment Successful");    --statement based on the type of argument passed expected result */
		//Assert.assertTrue(true); -----> Status code
		//Assert.assertTrue(true); -----> Response time
		}
		
	@Test ( groups = {"Functional", "Regression"}, dependsOnMethods= "validPurchase" )  //passing required parameters using data provider
		public void paymentReflect()
		{
			//Validate that the payment is reflected in the user's account.
			System.out.println("payment is reflected in the user's account.");
			Assert.assertTrue(true); //statement based on the type of argument passed expected result
			//Assert.assertTrue(true); -----> Status code
		//Assert.assertTrue(true); -----> Response time
		}
		
	@Test (groups = {"Functional", "Regression"}, dependsOnMethods= "validPurchase" ) //passing required parameters using data provider
		public void deductedAmount()
		{
			//Validate the correctness of the deducted amount.
			System.out.println("correctness of the deducted amount.");
			Assert.assertTrue(true); //statement based on the type of argument passed expected result
			//Assert.assertTrue(true); -----> Status code
			//Assert.assertTrue(true); -----> Response time
		}
	
	@DataProvider
	public String[] sendData()
	{
		String[] OrderConfirmationId = new String[20];
		
		//code
		
		return OrderConfirmationId;
		
		
	}
	}


