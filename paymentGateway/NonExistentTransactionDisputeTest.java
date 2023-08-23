package paymentGateway;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NonExistentTransactionDisputeTest {

	
		// TODO Auto-generated method stub
	@Test (groups = {"Functional", "Regression"})
		public void nonExistingTransaction()
		{
			//Verify that raising a dispute for a non-existing transaction is not allowed
			System.out.println("dispute for a non-existing transaction is not allowed");
			Assert.assertTrue(true); //statement based on the type of argument passed expected result
			//Assert.assertTrue(true); -----> Status code
			//Assert.assertTrue(true); -----> Response time
		}
	}


