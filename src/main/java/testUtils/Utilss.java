package testUtils;

public class Utilss {

	public static void hardWait(int seconds) {
		
		try {
			Thread.sleep(seconds* 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
