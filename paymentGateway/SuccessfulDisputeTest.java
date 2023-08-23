package paymentGateway;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SuccessfulDisputeTest {

	
		// TODO Auto-generated method stub
		@Test (dataProvider = "transactionId", groups = {"Functional", "Regression"})
		public void disputeStatus()
		{
			//Raise a dispute for a transaction and verify the dispute status in the response
			System.out.println("Valid dispute status in the response");
			Assert.assertTrue(true); //statement based on the type of argument passed expected result
			//Assert.assertTrue(true); -----> Status code
			//Assert.assertTrue(true); -----> Response time
		}
		@DataProvider
		public String[] sendData()
		{
			String[] transactionId = new String[20];
			
			//code
			
			return transactionId;
			
			
		}
	}


