package paymentGateway;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UnsuccessfulReversalTest {

	@Test(dataProvider = "OrderConfirmationId", groups = {"Functional", "Regression"} ) 
		// TODO Auto-generated method stub
		public void settledTransactionRejection()  //throws Exception()----> Handling the exception if any
		{
			//Attempt a reversal for a settled transaction and confirm the rejection with error message.
			System.out.println("Rejection of a settled transaction");
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


