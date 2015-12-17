package sample;

import org.sikuli.basics.Settings;

import fp.forevo.manager.TafException;
import sample.maps.Sample_IMG_01Map;

/**
 * Opis klasy. To b�dzie sie przenosi�o do opisu biblioteki keyword�w
 * @author Krzysiek
 */
public class Sample_IMG_01 extends Sample_IMG_01Map {
	
	/**
	 * G��wna klasa
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new Sample_IMG_01().run();
		} catch (TafException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Klasa prywatna
	 */
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
	
	/**
	 * Przyk�adowa metoda reprezentuj�ca keyword
	 * @param paramStr - pierwszy paramtr typu String
	 * @param paramInt - drugi parametr typu int
	 * @return
	 */
	public int jKeyword1(String paramStr, int paramInt) {
		System.out.println("hello");
		return 5;
	}
	
	/*
	 * Komentarz ale nie dok
	 */
	public void jKeyword2() {
		
	}
	
	/**
	 * Ten jest bez parametr�w ale zwraca string
	 * @return informacja czym jest wynik tej funkcji
	 */
	public String jKeyword3() {
		return "Bla bla bla";
	}
	
	/**
	 * To jest keyword z trzema parametrami typu stirng
	 * @param param1 - pierwszy parametr funkcji
	 * @param param2 - drugi parametr funkcji
	 * @param param3 - trzeci parametr funkcji
	 */
	public void jKeyword4(String param1, String param2, String param3) {
		System.out.println(param1 + param2 + param3);
	}
}
