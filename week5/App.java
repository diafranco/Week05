package week05;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Logger AstrickLogger = new AstrickLogger();
		
	AstrickLogger.log("Doritos");
		
	Logger AstrickError = new AstrickLogger();
	
	AstrickError.error("Lays");
	
	Logger SpacedLogger = new SpacedLogger();
	
	SpacedLogger.log("Cheetos");
	
	Logger SpacedError = new SpacedLogger();
	
	SpacedError.error("Fritos");
	
	}

}
