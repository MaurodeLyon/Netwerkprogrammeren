package package1;

public class Task1 implements Runnable {

	public void run() {
		int amount = 0;
		while (amount < 100) {
			System.out.print("1");
			amount++;
		}
	}

}
