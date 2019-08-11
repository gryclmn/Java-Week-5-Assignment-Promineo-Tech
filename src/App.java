/* 
 * ********************
 * Step 9
 * ********************
 */
public class App {

	public static void main(String[] args) {
		
		/* 
		 * ********************
		 * Step 10
		 * ********************
		 */
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		/* 
		 * ********************
		 * Step 11
		 * ********************
		 */
		asteriskLogger.log("Oh no! An error!");
		asteriskLogger.error("This is an error!");
		
		System.out.println();
		
		spacedLogger.log("Spread this out.");
		spacedLogger.error("This is a BIG ERROR!");
		

	}

}
