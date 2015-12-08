package sample.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-12-08 11:50:00
 */
public class Sample_OCR_01Map extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/sample/Sample_OCR_01/Sample_OCR_01.map");

	/**
	 * <b>Description:</b> 
	 */
	protected Window winKalkulator = getWindow(tomgr, "winKalkulator");

	/**
	 * <b>Description:</b> 1 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> -20:-33<br/>
	 * <b>Tags: </b> <br/>
	 * <b>OCR:</b> 0<br/>
	 */
	protected Button btn1 = getButton(tomgr, winKalkulator, "btn1");

	/**
	 * <b>Description:</b> 2 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> 0:0<br/>
	 * <b>Tags: </b> <br/>
	 * <b>OCR:</b> 2<br/>
	 */
	protected Button btn2 = getButton(tomgr, winKalkulator, "btn2");

	/**
	 * <b>Description:</b> 3 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> 58:-32<br/>
	 * <b>Tags: </b> <br/>
	 * <b>OCR:</b> 0<br/>
	 */
	protected Button btn3 = getButton(tomgr, winKalkulator, "btn3");

	/**
	 * <b>Description:</b> 4  Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> 0:0<br/>
	 * <b>Tags: </b> <br/>
	 * <b>OCR:</b> 4<br/>
	 */
	protected Button btn4 = getButton(tomgr, winKalkulator, "btn4");

	/**
	 * <b>Description:</b> 5 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> 0:0<br/>
	 * <b>Tags: </b> <br/>
	 * <b>OCR:</b> 5<br/>
	 */
	protected Button btn5 = getButton(tomgr, winKalkulator, "btn5");

	/**
	 * <b>Description:</b> Plus Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> 100:0<br/>
	 * <b>Tags: </b> <br/>
	 * <b>OCR:</b> 0<br/>
	 */
	protected Button btnPlus = getButton(tomgr, winKalkulator, "btnPlus");

	/**
	 * <b>Description:</b> Equals Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> 138:-14<br/>
	 * <b>Tags: </b> <br/>
	 * <b>OCR:</b> 0<br/>
	 */
	protected Button btnEquals = getButton(tomgr, winKalkulator, "btnEquals");

	/**
	 * <b>Description:</b> C Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> 39:0<br/>
	 * <b>Tags: </b> <br/>
	 * <b>OCR:</b> CE<br/>
	 */
	protected Button btnC = getButton(tomgr, winKalkulator, "btnC");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> menu_menuWidok.png<br/>
	 * <b>Offset: </b> 0:0<br/>
	 * <b>Tags: </b> <br/>
	 * <b>OCR:</b> Widok<br/>
	 */
	protected Button menuWidok = getButton(tomgr, winKalkulator, "menuWidok");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> menuWidok.png<br/>
	 * <b>Offset: </b> -63:-88<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_OCR_01\menuWidok.png') no-repeat;width:161px;height:187px;">
	 * <img style="margin-left:12px;margin-top:0px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button widokStandardowy = getButton(tomgr, winKalkulator, "widokStandardowy");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> menuWidok.png<br/>
	 * <b>Offset: </b> -60:-69<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_OCR_01\menuWidok.png') no-repeat;width:161px;height:187px;">
	 * <img style="margin-left:15px;margin-top:19px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button widokNaukowy = getButton(tomgr, winKalkulator, "widokNaukowy");

}
