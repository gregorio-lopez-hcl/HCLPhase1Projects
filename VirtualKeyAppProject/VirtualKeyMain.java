package VirtualKeyAppProject;

public class VirtualKeyMain {

	public static void main(String[] args) {
		
		HomeScreen hs = new HomeScreen();
		hs.welcomeOptions(); 
		
		while (true) {
			hs.displayMenu();
			hs.userOptions();
		}
	}

}
