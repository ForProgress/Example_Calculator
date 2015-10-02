package sample.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-10-01 14:03:27
 */
public class Sample_IMG_01Map extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/sample/Sample_IMG_01/Sample_IMG_01.map");

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
	 * <b>Offset: </b> -79:47<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\widokStandardowy_Win7.png') no-repeat;width:193px;height:192px;">
	 * <img style="margin-left:12px;margin-top:138px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btn1 = getButton(tomgr, winKalkulator, "btn1");

	/**
	 * <b>Description:</b> 2 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> -40:48<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\widokStandardowy_Win7.png') no-repeat;width:193px;height:192px;">
	 * <img style="margin-left:51px;margin-top:139px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btn2 = getButton(tomgr, winKalkulator, "btn2");

	/**
	 * <b>Description:</b> 3 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> -1:47<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\widokStandardowy_Win7.png') no-repeat;width:193px;height:192px;">
	 * <img style="margin-left:90px;margin-top:138px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btn3 = getButton(tomgr, winKalkulator, "btn3");

	/**
	 * <b>Description:</b> 4  Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> -80:15<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\widokStandardowy_Win7.png') no-repeat;width:193px;height:192px;">
	 * <img style="margin-left:11px;margin-top:106px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btn4 = getButton(tomgr, winKalkulator, "btn4");

	/**
	 * <b>Description:</b> 5 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> -40:15<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\widokStandardowy_Win7.png') no-repeat;width:193px;height:192px;">
	 * <img style="margin-left:51px;margin-top:106px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btn5 = getButton(tomgr, winKalkulator, "btn5");

	/**
	 * <b>Description:</b> Plus Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> 39:80<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\widokStandardowy_Win7.png') no-repeat;width:193px;height:192px;">
	 * <img style="margin-left:130px;margin-top:171px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btnPlus = getButton(tomgr, winKalkulator, "btnPlus");

	/**
	 * <b>Description:</b> Equals Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> 79:65<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\widokStandardowy_Win7.png') no-repeat;width:193px;height:192px;">
	 * <img style="margin-left:170px;margin-top:156px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btnEquals = getButton(tomgr, winKalkulator, "btnEquals");

	/**
	 * <b>Description:</b> C Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> -1:-50<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\widokStandardowy_Win7.png') no-repeat;width:193px;height:192px;">
	 * <img style="margin-left:90px;margin-top:41px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btnC = getButton(tomgr, winKalkulator, "btnC");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> menu_menuWidok.png<br/>
	 * <b>Offset: </b> -54:12<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\menu_menuWidok.png') no-repeat;width:149px;height:40px;">
	 * <img style="margin-left:15px;margin-top:27px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
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
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\menuWidok.png') no-repeat;width:161px;height:187px;">
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
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\menuWidok.png') no-repeat;width:161px;height:187px;">
	 * <img style="margin-left:15px;margin-top:19px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button widokNaukowy = getButton(tomgr, winKalkulator, "widokNaukowy");

	/**
	 * <b>Description:</b> The result text box<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Element<br/>
	 * <br/>
	 * <b>File:</b> result.png<br/>
	 * <b>Similarity:</b> 0.3<br/>
	 * <b>Offset: </b> 0:0<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('C:\Workspace\Example_Calculator\res\sample\Sample_IMG_01\result.png') no-repeat;width:196px;height:54px;">
	 * <img style="margin-left:93px;margin-top:22px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Element result = getElement(tomgr, winKalkulator, "result");

}
