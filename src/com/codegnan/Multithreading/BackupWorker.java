package com.codegnan.Multithreading;

public class BackupWorker implements Runnable {
private final String workerName;

	public BackupWorker(String workerName) {
	super();
	this.workerName = workerName;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(workerName+ " starting work ");
		for(int i=1;i<=5;i++) {
			System.out.println(workerName+ "processing file back");
			if(i%2==0) {
				System.out.println(workerName+ "Yielding control..");
			}
		}
		System.out.println(workerName+ "finished its cycle");
		
	}

}
