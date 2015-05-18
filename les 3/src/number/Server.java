package number;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private int port = 8000;
	private DataInputStream in;
	private DataOutput out;
	private ServerSocket server;
	private Socket socket;

	public Server() throws IOException {
		server = new ServerSocket(port);
		socket = server.accept();
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		System.out.println(in.readDouble());
		out.writeDouble(25.0);
	}
}
