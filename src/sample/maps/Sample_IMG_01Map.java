package sample.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-12-16 13:46:25
 */
public class Sample_IMG_01Map extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/sample/Sample_IMG_01/Sample_IMG_01.map");

	/**
	 * <b>Description:</b> mmmvmvsc
	 */
	protected Window winKalkulator = getWindow(tomgr, "winKalkulator");

	/**
	 * <b>Description:</b> 1 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -79:47<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\calc_win7_new.png') no-repeat;width:193px;height:190px;">
	 * <img style="margin-left:12px;margin-top:137px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btn1 = getButton(tomgr, winKalkulator, "btn1");

	/**
	 * <b>Description:</b> 2 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -40:48<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\calc_win7_new.png') no-repeat;width:193px;height:190px;">
	 * <img style="margin-left:51px;margin-top:138px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btn2 = getButton(tomgr, winKalkulator, "btn2");

	/**
	 * <b>Description:</b> 3 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -1:47<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\calc_win7_new.png') no-repeat;width:193px;height:190px;">
	 * <img style="margin-left:90px;margin-top:137px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btn3 = getButton(tomgr, winKalkulator, "btn3");

	/**
	 * <b>Description:</b> 4  Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -80:15<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\calc_win7_new.png') no-repeat;width:193px;height:190px;">
	 * <img style="margin-left:11px;margin-top:105px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btn4 = getButton(tomgr, winKalkulator, "btn4");

	/**
	 * <b>Description:</b> 5 Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -40:15<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\calc_win7_new.png') no-repeat;width:193px;height:190px;">
	 * <img style="margin-left:51px;margin-top:105px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btn5 = getButton(tomgr, winKalkulator, "btn5");

	/**
	 * <b>Description:</b> Plus Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 39:80<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\calc_win7_new.png') no-repeat;width:193px;height:190px;">
	 * <img style="margin-left:130px;margin-top:170px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btnPlus = getButton(tomgr, winKalkulator, "btnPlus");

	/**
	 * <b>Description:</b> Equals Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 79:65<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\calc_win7_new.png') no-repeat;width:193px;height:190px;">
	 * <img style="margin-left:170px;margin-top:155px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btnEquals = getButton(tomgr, winKalkulator, "btnEquals");

	/**
	 * <b>Description:</b> C Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> -1:-50<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\calc_win7_new.png') no-repeat;width:193px;height:190px;">
	 * <img style="margin-left:90px;margin-top:40px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Button btnC = getButton(tomgr, winKalkulator, "btnC");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> menuWidokWin7New.png<br/>
	 * <b>Offset: </b> -84:-5<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\menuWidokWin7New.png') no-repeat;width:222px;height:36px;">
	 * <img style="margin-left:22px;margin-top:8px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
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
	 * <b>Tags: </b> 8045d6cf-c154-4e0d-a634-908cc3e4e870<br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\menuWidok.png') no-repeat;width:161px;height:187px;">
	 * <img style="margin-left:12px;margin-top:0px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 * <b>File:</b> widokStanWin7New.png<br/>
	 * <b>Offset: </b> -68:-107<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\widokStanWin7New.png') no-repeat;width:198px;height:236px;">
	 * <img style="margin-left:26px;margin-top:6px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
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
	 * <b>Tags: </b> 8045d6cf-c154-4e0d-a634-908cc3e4e870<br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\menuWidok.png') no-repeat;width:161px;height:187px;">
	 * <img style="margin-left:15px;margin-top:19px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 * <b>File:</b> widokStanWin7New.png<br/>
	 * <b>Offset: </b> -47:-85<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\widokStanWin7New.png') no-repeat;width:198px;height:236px;">
	 * <img style="margin-left:47px;margin-top:28px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
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
	 * <b>Tags: </b> 8045d6cf-c154-4e0d-a634-908cc3e4e870<br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\result.png') no-repeat;width:196px;height:54px;">
	 * <img style="margin-left:93px;margin-top:22px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 * <b>File:</b> resultWin7New.png<br/>
	 * <b>Similarity:</b> 0.3<br/>
	 * <b>Offset: </b> 0:0<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="background: url('D:\GitHub\Example_Calculator\res\sample\Sample_IMG_01\resultWin7New.png') no-repeat;width:194px;height:55px;">
	 * <img style="margin-left:92px;margin-top:22px" src="C:\Program Files\ForProgress\ForEVO\point.png"></div>
	 * <br/>
	 */
	protected Element result = getElement(tomgr, winKalkulator, "result");

}
