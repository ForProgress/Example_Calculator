package calc.standard.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-12-17 13:40:14
 */
public class CommonMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/calc.standard/Common/Common.map");

	/**
	 * <b>Description:</b> Okno kalkulatora
	 */
	protected Window winKalkulator = getWindow(tomgr, "winKalkulator");

	/**
	 * <b>Description:</b> Close application button<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> Win7New_txtResult.png<br/>
	 * <b>Offset: </b> 91:-11<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:220px;height:59px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/Common/Win7New_txtResult.png') no-repeat;width:220px;height:59px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:196px;margin-top:13px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btnClose = getButton(tomgr, winKalkulator, "btnClose");

	/**
	 * <b>Description:</b> Minimize calculator window<br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> Button<br/>
	 * <br/>
	 * <b>File:</b> Win7New_txtResult.png<br/>
	 * <b>Offset: </b> 23:-10<br/>
	 * <b>Tags: </b> <br/>
	 * <div style="overflow:visible;width:220px;height:59px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:0px;height:0px;margin-top:0px;margin-left:0px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/Common/Win7New_txtResult.png') no-repeat;width:220px;height:59px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:128px;margin-top:14px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected Button btnMinimize = getButton(tomgr, winKalkulator, "btnMinimize");

}
