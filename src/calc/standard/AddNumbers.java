package calc.standard;

import java.util.ArrayList;
import java.util.List;

import calc.standard.maps.AddNumbersMap;
import fp.forevo.manager.TafException;
import fp.forevo.proxy.Button;

/**
 * Method for adding numbers porpose
 */
public class AddNumbers extends AddNumbersMap {

	/**
	 * Method for adding two int numbers
	 * @param x - first number
	 * @param y - second number
	 * @return - expected result
	 * @throws TafException 
	 */
	public int jAddTwoIntNumbers(int x, int y) throws TafException {
		log.info("AddTwoIntNumbers - Start");
		
		// clear result
		btnC.click();
		
		// click all digits from x
		for(Character c : getCharacterList("" + x))
			getButton(c).click();
		
		// click add button
		btnPlus.click();
		
		// click all digits from y
		for(Character c : getCharacterList("" + y))
			getButton(c).click();
		
		// click equals button
		btnEquals.click();
		
		log.info("AddTwoIntNumbers - Stop");
		
		return x + y;
	}
	
	/**
	 * Method for adding two doble numbers
	 * @param x - first double number
	 * @param y - second double number
	 * @return - double type result
	 * @throws TafException 
	 */
	public double jAddTwoDoubleNumbers(double x, double y) throws TafException {
		log.info("AddTwoDoubleNumbers - Start");
		
		// clear result
		btnC.click();
		
		// click all digits from x
		for(Character c : getCharacterList("" + x))
			getButton(c).click();
		
		// click add button
		btnPlus.click();
		
		// click all digits from y
		for(Character c : getCharacterList("" + y))
			getButton(c).click();
		
		// click equals button
		btnEquals.click();
		
		log.info("AddTwoDoubleNumbers - Stop");
		
		return x + y;
	}
	
	/**
	 * Method for adding complicated sequence of numbers
	 * @param sequence - sequence of numbers eg. 10,5 + 200 + 101,034
	 * @return
	 * @throws TafException 
	 */
	public void jClickSequence(String sequence) throws TafException {
		for(Character c : getCharacterList(sequence))
			getButton(c).click();
	}
	
	/**
	 * Method convert string into list of characters
	 * @param number
	 * @return
	 */
	private List<Character> getCharacterList(String number) {
		List<Character> charList = new ArrayList<Character>();
		for (char c : number.toCharArray()) {
		  charList.add(c);
		}
		return charList;
	}
	
	/**
	 * Method returns test object based on parameter i. Eg. for parameter value 1 returns btn 1.
	 * @param i - number
	 * @return - test object from test object map
	 */
	private Button getButton(char symbol) {
		switch (symbol) {
		case '0': return btn0;
		case '1': return btn1;
		case '2': return btn2;
		case '3': return btn3;
		case '4': return btn4;
		case '5': return btn5;
		case '6': return btn6;
		case '7': return btn7;
		case '8': return btn8;
		case '9': return btn9;	
		case '.': return btnDot;
		case '+': return btnPlus;
		case '-': return btnMinus;
		case '*': return btnMultiply;
		case '/': return btnDevide;
		case '=': return btnEquals;
		default:
			System.out.println("Non recognized symbol \"" + symbol + "\"");
			return null;
		}
	}
}
