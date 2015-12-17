package calc.tests;

import fp.forevo.manager.RobotTestRunner;

public class RunTestSuites {
	
	public static void main(String[] args) {
		new RunTestSuites().run(args);
	}
	
	private void run(String[] args) {
		//String suite = "AddNumbersSuite.robot";
		
		if (args != null) {
			RobotTestRunner robotRunner = new RobotTestRunner(this.getClass());
			
			// Execute Robot Framework Test Suites
			robotRunner.runSuite(args[0]);
		}
		
	}

}
