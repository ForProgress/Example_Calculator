package calc.standard;

import org.sikuli.basics.Settings;

import calc.standard.maps.CommonMap;
import fp.forevo.manager.TafException;

/**
 * Common keywords
 */
public class Common extends CommonMap {
	
	/**
	 * Wait
	 * @param second - number of secons
	 */
	public void jSleep(int second) {
		sleep(second);
	}
	
	/**
	 * Set default configuration
	 */
	public void jSetConfiguration() {
		conf.setDbLog(true);
		Settings.ActionLogs = false;
	}
	
	/**
	 * Run calculator method
	 */
	public void jRunCalculator() {
		log.startTest("Simble calculator test");
		runApp("calc.exe");
	}
	
	/**
	 * Activate calculator method
	 */
	public void jActivateCalculator() {
		winKalkulator.activate();
	}
	
	/**
	 * Minimize calculator method
	 * @throws TafException 
	 */
	public void jMinimizeCalculator() throws TafException {
		btnMinimize.click();
	}
	
	/**
	 * Close calculator method
	 * @throws TafException 
	 */
	public void jCloseCalculator() throws TafException {
		btnClose.click();
	}
	
	/**
	 * Method set tag for test
	 * @param tag - a tag name
	 */
	public void jSetTag(String tag) {
		setTag(tag);
	}

}
