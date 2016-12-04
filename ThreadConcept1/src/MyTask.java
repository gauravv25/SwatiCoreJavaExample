
public class MyTask implements Runnable{
	Integer num = 0;
	@Override
	public void run() {
		
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				num++;
			}
			System.out.println(Thread.currentThread().getName() + "-- "+num);
		}
		
	}

}
