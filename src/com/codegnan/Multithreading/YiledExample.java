package com.codegnan.Multithreading;

public class YiledExample {

	public static void main(String[] args) {
		BackupWorker backupTask1=new BackupWorker("Backup-worker-A");
		BackupWorker backupTask2=new BackupWorker("Backup-worker-B");
		Thread workerA=new Thread(backupTask1);
		Thread workerB=new Thread(backupTask2);
		workerA.setPriority(Thread.NORM_PRIORITY);
		workerB.setPriority(Thread.NORM_PRIORITY);
		System.out.println("Starting backup wokers");
		workerA.start();
		workerB.start();
		

	}

}
