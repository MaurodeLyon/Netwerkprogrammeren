package opdr1;

public class Number implements Runnable {

	private int number = 0;

	public Number() {

	}

	@Override
	public void run() {
		while (number < 100) {
			number = number + 1;
			System.out.print(number);
		}
	}

}
