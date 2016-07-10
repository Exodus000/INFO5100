
public class TwoThread {

	public static int count = 1;

	public static void main(String[] args) {

		Object obj = new Object();

		ThreadNumber a = new ThreadNumber(obj);
		ThreadLetter b = new ThreadLetter(obj);
		a.start();
		b.start();
	}

	static class ThreadNumber extends Thread {
		private Object obj;

		public ThreadNumber(Object obj) {
			this.obj = obj;
		}

		public void run() {
			synchronized (obj) {  
				for (int i = 1; i < 53;) {
					if (count % 3 != 0) {
						System.out.print(i + " ");
						count++;
						i++;
					} else {
						obj.notify();	// notify the printletter function
						try {
							obj.wait();	// wait for notification
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	static class ThreadLetter extends Thread {
		private Object obj;

		public ThreadLetter(Object obj) {
			this.obj = obj;
		}

		public void run() {
			synchronized (obj) {
				for (int i = 0; i < 26;) {
					if (count % 3 == 0) {
						System.out.print((char) ('A' + i) + " ");	// print letter
						count++;
						i++;
					} else {
						obj.notify();
						try {
							obj.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}