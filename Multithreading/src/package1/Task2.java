package package1;

public class Task2 implements Runnable {

	public void run() {
		int amount = 0;
		while (amount < 100) {
			System.out.print("2");
			amount++;
		}
	}

}
