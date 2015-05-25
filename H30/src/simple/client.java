package simple;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {

	private static final int PORT = 8000;
	private static final String HOST = "84.105.252.233";
	private static DataInputStream in;
	private static DataOutputStream out;
	private static Socket socket;

	public static void main(String[] args) throws UnknownHostException, IOException {
		socket = new Socket(HOST, PORT);
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		out.writeDouble(2.0);
		System.out.println(in.readDouble());
	}

}
