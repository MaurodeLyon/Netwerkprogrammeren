package simple;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	private static final String SERVERHOST = "84.105.252.233";

	private static DataInputStream in;
	private static DataOutputStream out;
	private static ServerSocket server;
	private static Socket socket;

	public static void main(String[] args) throws IOException {
		server = new ServerSocket(8000);
		socket = server.accept();
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		System.out.println(in.readDouble());
		out.writeDouble(1.1020202);
	}

}
