package sample;

import java.util.Iterator;

import org.sikuli.basics.Settings;
import org.sikuli.script.Match;

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
		//setDebugMode(true);
		runApp("calc.exe");
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
		
		menuWidok.click();
		widokNaukowy.click();
		
		menuWidok.click();
		widokStandardowy.click();
	}
}
