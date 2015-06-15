package package2;

public class Main {

	public static void main(String[] args) {

		//Thread server = new Thread(new Server());
		Thread client = new Thread(new Client(1.2));
		//server.run();
		client.run();
	}
}
