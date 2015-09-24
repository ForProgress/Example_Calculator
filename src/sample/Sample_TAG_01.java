package sample;

import fp.forevo.manager.TafException;
import sample.maps.Sample_TAG_01Map;


public class Sample_TAG_01 extends Sample_TAG_01Map {

	public static void main(String[] args) {
		try {
			new Sample_TAG_01().run();
		} catch (TafException e) {
			e.printStackTrace();
		}
	}
	
	private void run() throws TafException {
		//runApp("Kalkulator");
		btn1.click();
	}
}
