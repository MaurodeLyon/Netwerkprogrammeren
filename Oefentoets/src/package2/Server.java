package package2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import package1.Persoon;
import package1.Stamboom;

public class Server implements Runnable {

	private int port = 8000;

	private ServerSocket server;
	private Socket socket;

	private DataInputStream in;
	private DataOutputStream out;

	private Stamboom stamboom;

	public Server() {
		Persoon Oma = new Persoon("Oma", 95, false);
		Persoon Opa = new Persoon("Opa", 100, true);

		Persoon Ma = new Persoon("Ma", 45, false);
		Persoon Tante = new Persoon("Tante", 48, false);
		Persoon Pa = new Persoon("Pa", 50, true);
		Persoon Oom = new Persoon("Oom", 49, true);

		Persoon Bro = new Persoon("Bro", 20, true);
		Persoon Zus = new Persoon("Zus", 19, false);
		Persoon Ik = new Persoon("Ik", 18, true);

		stamboom = new Stamboom(Opa);

		stamboom.voegKindToeAanPersoon(Opa, Pa);
		stamboom.voegKindToeAanPersoon(Opa, Oom);
		stamboom.voegKindToeAanPersoon(Opa, Tante);

		stamboom.voegKindToeAanPersoon(Pa, Bro);
		stamboom.voegKindToeAanPersoon(Pa, Ik);
		stamboom.voegKindToeAanPersoon(Pa, Zus);
		try {
			server = new ServerSocket(port);
			socket = server.accept();
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				// out.writeDouble(5.0);
				System.out.println(in.readDouble());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ServerSocket getServer() {
		return server;
	}

	public void setServer(ServerSocket server) {
		this.server = server;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public DataInputStream getIn() {
		return in;
	}

	public void setIn(DataInputStream in) {
		this.in = in;
	}

	public DataOutputStream getOut() {
		return out;
	}

	public void setOut(DataOutputStream out) {
		this.out = out;
	}

	public Stamboom getStamboom() {
		return stamboom;
	}

	public void setStamboom(Stamboom stamboom) {
		this.stamboom = stamboom;
	}
	
	
}
