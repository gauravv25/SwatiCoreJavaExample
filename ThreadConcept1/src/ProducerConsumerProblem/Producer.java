package ProducerConsumerProblem;

import java.util.List;

public class Producer implements Runnable {

	private List<Integer> resource;

	public Producer(List<Integer> arryList) {
		this.resource = arryList;
	}

	@Override
	public void run() {
		synchronized (resource) {

			while (true) {
				if (resource.size() < 10) {
					System.out.println("Producer.run().add");
					resource.add((int) Math.random());
				} else {
					try {
						System.out.println("Producer.run().wait");
						resource.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					resource.notify();
				}
			}
		}
	}

}
