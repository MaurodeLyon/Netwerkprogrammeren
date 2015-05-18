package number;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	private int port = 8000;
	private String host = "localhost";
	private DataInputStream in;
	private DataOutput out;
	private Socket socket;
	
	public Client() throws UnknownHostException, IOException{
		socket = new Socket(host, port);
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		out.writeDouble(256);
		System.out.println(in.readDouble());
	}
}
