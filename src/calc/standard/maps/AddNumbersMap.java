package calc.standard.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-12-17 13:09:22
 */
public class AddNumbersMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/calc.standard/AddNumbers/AddNumbers.map");

	/**
	 * <b>Description:</b> Okno kalkulatora
	 */
	protected Window winKalkulator = getWindow(tomgr, "winKalkulator");

	/**
	 * <b>Description:</b> 1 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -78:86<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:23px;margin-top:223px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btn1 = getButton(tomgr, winKalkulator, "btn1");

	/**
	 * <b>Description:</b> 2 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -39:86<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:62px;margin-top:223px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btn2 = getButton(tomgr, winKalkulator, "btn2");

	/**
	 * <b>Description:</b> 3 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 1:86<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:102px;margin-top:223px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btn3 = getButton(tomgr, winKalkulator, "btn3");

	/**
	 * <b>Description:</b> 4  Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -79:53<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:22px;margin-top:190px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btn4 = getButton(tomgr, winKalkulator, "btn4");

	/**
	 * <b>Description:</b> 5 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -40:54<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:61px;margin-top:191px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btn5 = getButton(tomgr, winKalkulator, "btn5");

	/**
	 * <b>Description:</b> Plus Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 40:117<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:141px;margin-top:254px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btnPlus = getButton(tomgr, winKalkulator, "btnPlus");

	/**
	 * <b>Description:</b> Equals Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 79:101<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:180px;margin-top:238px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btnEquals = getButton(tomgr, winKalkulator, "btnEquals");

	/**
	 * <b>Description:</b> C Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 1:-10<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:102px;margin-top:127px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btnC = getButton(tomgr, winKalkulator, "btnC");

	/**
	 * <b>Description:</b> 6 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 1:53<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:102px;margin-top:190px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btn6 = getButton(tomgr, winKalkulator, "btn6");

	/**
	 * <b>Description:</b> 7 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -79:21<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:22px;margin-top:158px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btn7 = getButton(tomgr, winKalkulator, "btn7");

	/**
	 * <b>Description:</b> 8 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -39:23<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:62px;margin-top:160px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btn8 = getButton(tomgr, winKalkulator, "btn8");

	/**
	 * <b>Description:</b> 9 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 2:22<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:103px;margin-top:159px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btn9 = getButton(tomgr, winKalkulator, "btn9");

	/**
	 * <b>Description:</b> 0 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -58:117<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:43px;margin-top:254px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btn0 = getButton(tomgr, winKalkulator, "btn0");

	/**
	 * <b>Description:</b> Dot button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 1:118<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:102px;margin-top:255px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btnDot = getButton(tomgr, winKalkulator, "btnDot");

	/**
	 * <b>Description:</b> Minus button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 40:86<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:141px;margin-top:223px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btnMinus = getButton(tomgr, winKalkulator, "btnMinus");

	/**
	 * <b>Description:</b> Multiplication button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 40:54<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:141px;margin-top:191px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btnMultiply = getButton(tomgr, winKalkulator, "btnMultiply");

	/**
	 * <b>Description:</b> Devision button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 40:21<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/AddNumbers/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:141px;margin-top:158px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btnDevide = getButton(tomgr, winKalkulator, "btnDevide");

}
