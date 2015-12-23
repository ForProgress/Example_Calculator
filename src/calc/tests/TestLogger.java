package calc.tests;

import fp.forevo.manager.Conf;
import fp.forevo.manager.MasterScript;

public class TestLogger extends MasterScript {
	
	public static void main(String[] args) {
		new TestLogger().run();
	}

	private void run() {
		Conf.setDbLog(true);
		System.out.println(Conf.isDbLog());

		log.startTest("Sample");
		
		jKeyword1();
		jKeyword2();
		jKeyword3();		
	}
	
	private void jKeyword1() {
		log.pass("Step1");
		log.pass("Step2");
	}
	
	private void jKeyword2() {
		log.pass("Step3");
		log.warning("Step4");
	}
	
	private void jKeyword3() {
		log.info("Step5");
		log.fail("Step6");
		log.pass("Step7");
	}	
}
