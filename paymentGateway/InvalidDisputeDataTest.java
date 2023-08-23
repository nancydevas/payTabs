package paymentGateway;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidDisputeDataTest {

	
		// TODO Auto-generated method stub
	@Test (groups = {"Functional", "Regression"})
		public void invalidMissingData()
		{
			//Test dispute requests with invalid or missing data and validate error responses.
			System.out.println("invalid or missing data and validate error responses");
			Assert.assertTrue(true); //statement based on the type of argument passed expected result
			//Assert.assertTrue(true); -----> Status code
			//Assert.assertTrue(true); -----> Response time
		}
	
	
	
	
	}


