/* 
 * ********************
 * Step 3
 * ********************
 */
public class AsteriskLogger implements Logger {

	/* 
	 * ********************
	 * Step 4
	 * ********************
	 */
	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");
	}

	/* 
	 * ********************
	 * Step 5
	 * ********************
	 */
	@Override
	public void error(String str) {
		
		String error = "Error: " + str;
		int length = error.length() + 6;
		StringBuilder line = new StringBuilder();
		
		for (int i = 1; i <= length; i++) {
			line.append('*');
		}
		
		System.out.println(line.toString());
		log(error);
		System.out.println(line.toString());
		
	}

}
