package number;

import java.io.IOException;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) {
		try {
			Client client = new Client();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			Server server = new Server();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
