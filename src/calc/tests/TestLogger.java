package calc.tests;

import fp.forevo.manager.MasterScript;

public class TestLogger extends MasterScript {
	
	public static void main(String[] args) {
		new TestLogger().run();
	}

	private void run() {
		conf.setDbLog(true);
		System.out.println(conf.isDbLog());

		log.startTest("Sample");
		
		jKeyword1();
		jKeyword2();
		jKeyword3();		
	}
	
	private void jKeyword1() {
		log.passed("Step1");
		log.passed("Step2");
	}
	
	private void jKeyword2() {
		log.passed("Step3");
		log.warning("Step4");
	}
	
	private void jKeyword3() {
		log.info("Step5");
		log.info("Step6");
		log.passed("Step7");
	}	
}
