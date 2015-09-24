package sample.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-09-04 16:57:04
 */
public class Sample_TAG_01Map extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/sample/Sample_TAG_01/Sample_TAG_01.map");

	/**
	 * <b>Description:</b> 
	 */
	protected Window winKalkulator = getWindow(tomgr, "winKalkulator");

	/**
	 * <b>Description:</b> Button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> widokStandardowy_WinXP.png<br/>
	 * <b>Offset: </b> -55:37<br/>
	 * <b>Tags: </b> WinXP<br/>
	 * <div style="background: url('C:\Workspace\FP_Calculator\res\sample\Sample_TAG_01\widokStandardowy_WinXP.png') no-repeat;width:250px;height:181px;">
	 * <img style="margin-left:65px;margin-top:122px" src="C:\Program Files\ForProgress\Test Automation Framework\lib\point.png"></div>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win7.png<br/>
	 * <b>Offset: </b> -79:46<br/>
	 * <b>Tags: </b> Win7<br/>
	 * <div style="background: url('C:\Workspace\FP_Calculator\res\sample\Sample_TAG_01\widokStandardowy_Win7.png') no-repeat;width:193px;height:192px;">
	 * <img style="margin-left:12px;margin-top:137px" src="C:\Program Files\ForProgress\Test Automation Framework\lib\point.png"></div>
	 * <br/>
	 * <b>File:</b> widokStandardowy_Win8.png<br/>
	 * <b>Offset: </b> -78:48<br/>
	 * <b>Tags: </b> Win8<br/>
	 * <div style="background: url('C:\Workspace\FP_Calculator\res\sample\Sample_TAG_01\widokStandardowy_Win8.png') no-repeat;width:201px;height:198px;">
	 * <img style="margin-left:17px;margin-top:142px" src="C:\Program Files\ForProgress\Test Automation Framework\lib\point.png"></div>
	 * <br/>
	 */
	protected Button btn1 = getButton(tomgr, winKalkulator, "btn1");

}
