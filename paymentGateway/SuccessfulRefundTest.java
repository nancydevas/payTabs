package paymentGateway;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SuccessfulRefundTest {

	@Test(alwaysRun = true, dataProvider = "OrderConfirmationId", groups = {"Functional", "Regression"} ) 
		// TODO Auto-generated method stub
		public void successfulTransaction()
		{
			//Test a refund request for a successful transaction and confirm the refund amount in the response.
		System.out.println("successful transaction and confirm the refund amount");
		Assert.assertTrue(true); //statement based on the type of argument passed expected result
		//Assert.assertTrue(true); -----> Status code
				//Assert.assertTrue(true); -----> Response time 
		}
		
	@Test(dataProvider = "OrderConfirmationId", groups = {"Functional", "Regression"} ) 
		public void refundAmount()
		{
			//Ensure the refunded amount is returned to the user's account.
			System.out.println("refunded amount is returned to the user's account");
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


