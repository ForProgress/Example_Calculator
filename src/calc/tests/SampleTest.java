package calc.tests;

import calc.standard.AddNumbers;
import calc.standard.Common;
import calc.standard.Verify;
import fp.forevo.manager.TafException;

public class SampleTest {
	
	Common common = new Common();
	AddNumbers addNumbers = new AddNumbers();
	Verify verify = new Verify();
		
	private void run() throws TafException {
				
		common.jSetConfiguration();
		
		common.jSetTag("Win7New");
		
		common.jRunCalculator();
		
		int iResult = addNumbers.jAddTwoIntNumbers(20, 24);
		verify.jVerifyResult("" + iResult);
		
		common.jMinimizeCalculator();
		common.jSleep(5);
		common.jActivateCalculator();
		
		double dResult = addNumbers.jAddTwoDoubleNumbers(23.5d, 44.4d);
		verify.jVerifyResult("" + dResult);
		
		addNumbers.jClickSequence("231.22+34.22-20.4*0.1=");
		verify.jVerifyResult("20");
		
		common.jCloseCalculator();
	}
	
	public static void main(String[] args) throws TafException {
		new SampleTest().run();
	}
}
