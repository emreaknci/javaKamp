package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("Database logland�");
		}
		else if(logType==2) {
			System.out.println("File logland�");
		}
		else{
			System.out.println("Mail logland�");
		}
		
		
	}

}
//1-)Database
//2-)File
//3-)Mail
