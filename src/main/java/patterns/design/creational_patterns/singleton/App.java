package patterns.design.creational_patterns.singleton;

public class App {
	public static void main(String[] args) {
		Logger logger1 = Logger.getLogger();
		Logger logger2 = Logger.getLogger();

		logger1.log("log from log #1");
		logger2.log("log from log #2");
		logger1.log("log from log #1");
		logger2.printLogsRecord(10);
	}
}
