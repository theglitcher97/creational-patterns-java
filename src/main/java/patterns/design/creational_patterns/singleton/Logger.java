package patterns.design.creational_patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {
	public List<String> logsRecord = new ArrayList<>();
	private static Logger logger;

	private Logger (){}

	public static Logger getLogger(){
		if(logger == null){
			logger = new Logger();
		}
		return logger;
	}

	public void log(String msg){
		System.out.println(msg);
		logsRecord.add(msg);
	}

	public void printLogsRecord(){
		this.printLogsHeader();
		this.logsRecord.forEach(System.out::println);
	}

	public void printLogsRecord(int limit){
		if(limit > 0){
			if(limit > this.logsRecord.size()){
				this.printLogsRecord();
			}else{
				this.printLogsHeader();
				for(int i = 0; i < limit; i++){
					System.out.println(this.logsRecord.get(i));
				}
			}
		}
	}

	private void printLogsHeader(){
		System.out.println();
		System.out.print("-".repeat(20));
		System.out.print(" LOGS ");
		System.out.println("-".repeat(20));
	}
}
