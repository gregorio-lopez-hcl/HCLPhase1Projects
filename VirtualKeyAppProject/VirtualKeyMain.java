package VirtualKeyAppProject;

public class VirtualKeyMain {

	public static void main(String[] args) {
		
		while (true) {
			HomeScreen hs = new HomeScreen();
			hs.DisplayMenu();
			hs.UserOptions();
		}
	}

}
