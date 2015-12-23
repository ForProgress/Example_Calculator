package calc.standard.maps;

import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TestObjectManager;
import fp.forevo.proxy.*;

/**
 * Class generated automaticaly. Do not edit from text editor. Change it using Test Object Manager.
 * @author Test Object Manager by ForProgress
 * @see www.forprogress.com.pl
 * @since 2015-12-22 10:03:24
 */
public class VerifyMap extends MasterScript {

	private TestObjectManager tomgr = new TestObjectManager(getProjectPath(this.getClass()), "res/calc.standard/Verify/Verify.map");

	/**
	 * <b>Description:</b> Okno kalkulatora
	 */
	protected Window winKalkulator = getWindow(tomgr, "winKalkulator");

	/**
	 * <b>Description:</b> <br/><br/>
	 * <b>Driver:</b> Sikuli<br/>
	 * <b>Class:</b> TextBox<br/>
	 * <br/>
	 * <b>File:</b> calc_win7_new.png<br/>
	 * <b>Offset: </b> 84:-82<br/>
	 * <b>Tags: </b> 8009bd1d-d911-42cd-ad3b-cc276d67464c<br/>
	 * <div style="overflow:visible;width:212px;height:285px;border:1px solid #e3e3c8;">
	 * <div style="border:1px solid #ff00ff;width:184px;height:28px;margin-top:50px;margin-left:15px;position:absolute;z-index:2"></div>
	 * <div style="background: url('{@docRoot}/../res/calc.standard/Verify/calc_win7_new.png') no-repeat;width:212px;height:285px;margin-left:0px;margin-top:0px;z-index:1;border:1px solid #0000ff;">
	 * <img style="margin-left:185px;margin-top:55px;position:absolute;z-index:3;" src="{@docRoot}/../res/point.png"></div>
	 * </div>
	 * <br/>
	 */
	protected TextBox txtResult = getTextBox(tomgr, winKalkulator, "txtResult");

}
