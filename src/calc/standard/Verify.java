package calc.standard;

import calc.standard.maps.VerifyMap;

/**
 * Methods for verifying calculation result
 */
public class Verify extends VerifyMap {

	/**
	 * Method for verifying calkulation result
	 * @param expectedResult - expected result
	 * @return - boolean type. true - passed, false - failed
	 */
	public boolean jVerifyResult(String expectedResult) {
		String calcResult = txtResult.getText();
		log.info("Result: " + calcResult);
		if (calcResult.equals(expectedResult)) {
			log.info("VerifyResult", "Result: " + calcResult);
			return true;
		} else {
			log.error("VerifyResult", "Result is " + calcResult + ", but expected is " + expectedResult, txtResult.screenShot());
			return false;
		}
	}
}
