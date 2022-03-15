package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("Database loglandý");
		}
		else if(logType==2) {
			System.out.println("File loglandý");
		}
		else{
			System.out.println("Mail loglandý");
		}
		
		
	}

}
//1-)Database
//2-)File
//3-)Mail
