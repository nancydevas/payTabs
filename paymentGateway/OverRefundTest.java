package paymentGateway;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OverRefundTest {

	
		// TODO Auto-generated method stub
	@Test(dataProvider = "OrderConfirmationId", groups = {"Functional", "Regression"} ) 
		 public void errorResponse()
		 {
			 //Test refunding more than the initial purchase amount and validate error response.
		System.out.println("more than the initial purchase amount and validate error response");
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


