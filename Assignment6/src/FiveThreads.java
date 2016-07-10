
public class FiveThreads {
	public static class MyThread extends Thread {  // create mythread from thread
		private String name;

		public MyThread(String name) {
			this.name = name;
		}

		public void Print() {
			System.out.print(name); // print name as letter
		}

		@Override
		public void run() {
			Print();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			Thread A = new MyThread("A"); // define new thread
			Thread B = new MyThread("B");
			Thread C = new MyThread("C");
			Thread D = new MyThread("D");
			Thread E = new MyThread("E");
			A.start();	//run a thread
			A.join();	//wait for B finish
			Thread.sleep(500);
			B.start();
			B.join();	//wait for C finish
			Thread.sleep(500);
			C.start();
			C.join();
			Thread.sleep(500);
			D.start();
			D.join();
			Thread.sleep(500);
			E.start();
			E.join();
			Thread.sleep(500);
		}
	}
}
