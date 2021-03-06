package test2;

import java.util.concurrent.locks.ReentrantLock;

public class PerformanSystemCheck implements Runnable{

	private String checkWhat;
	ReentrantLock lock = new ReentrantLock();
	
	public PerformanSystemCheck(String checkWhat){
		this.checkWhat = checkWhat;
	}

	public void run() {
		
		lock.lock();
		
		System.out.println("Checking " + this.checkWhat);
		
		lock.unlock();
	}
}
