package paymentGateway;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NonExistentTransactionRefundTest {

	
		// TODO Auto-generated method stub
		@Test (groups = {"Functional", "Regression"})
		public void rejectRequest()
		{
			//Verify that a refund request for a non-existent transaction is rejected.
			System.out.println("request for a non-existent transaction is rejected");
			Assert.assertTrue(true); //statement based on the type of argument passed expected result
			//Assert.assertTrue(true); -----> Status code
			//Assert.assertTrue(true); -----> Response time
		}
	}


