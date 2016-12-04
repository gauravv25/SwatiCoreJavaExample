
public class MyThread extends Thread {

	
	Integer num = 0;
	public MyThread(String string) {
		this.setName(string);
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			num++;
			System.out.println(Thread.currentThread().getName() + "-- "+num);
		}
	}

}
