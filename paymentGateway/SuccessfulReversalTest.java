package paymentGateway;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SuccessfulReversalTest {

	@Test(dataProvider = "OrderConfirmationId", groups = {"Functional", "Regression"} ) 
		// TODO Auto-generated method stub
 public void unsettledTransaction()
 {
	 //Test a reversal request for an unsettled transaction and validate the response
	 System.out.println("Unsettled Transaction");
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



