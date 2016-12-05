
public class MainClass {

	public static void main(String[] args) {
		MyTask task = new MyTask();
		
		//git demo
		Thread thread1 = new Thread(task,"thred1");
		Thread thread2 = new Thread(task,"thred2");
		
		thread2.start();
		thread1.start();
	}
}
