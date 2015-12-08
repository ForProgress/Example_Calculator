package sample;

import org.sikuli.basics.Settings;

import fp.forevo.manager.TafException;
import sample.maps.Sample_IMG_01Map;


public class Sample_IMG_01 extends Sample_IMG_01Map {
	public static void main(String[] args) {
		try {
			new Sample_IMG_01().run();
		} catch (TafException e) {
			e.printStackTrace();
		}
	}
	
	private void run() throws TafException {
		setTag("Win7");
		
		//setDebugMode(true);
		//runApp("calc.exe");
		Settings.ClickDelay = 0;
		Settings.AutoWaitTimeout = 0;
		//Settings.Highlight = true;
		Settings.OcrLanguage = "Polish";
		
		winKalkulator.activate();
		btnC.click();
		btn1.click();
		btn2.click();
		btn3.click();
		btnPlus.click();
		btn4.click();
		btn5.click();
		btnEquals.click();
		
		result.assertText("168");
		
		/*
		menuWidok.click();
		widokNaukowy.click();
		
		menuWidok.click();
		widokStandardowy.click();
		*/
	}
}
