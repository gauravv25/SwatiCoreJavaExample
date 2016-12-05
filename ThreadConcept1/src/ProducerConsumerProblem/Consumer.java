package ProducerConsumerProblem;

import java.util.List;

public class Consumer implements Runnable {

	private List<Integer> resource;

	public Consumer(List<Integer> arryList) {
		this.resource = arryList;
	}

	@Override
	public void run() {
		synchronized (resource) {

			while (true) {
				if (resource.size() == 0) {
					try {
						System.out.println("Consumer.run().wait");
						resource.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("Consumer.run().remove()" + resource.size());
					resource.remove(resource.size() - 1);
				}
				resource.notify();
			}
		}

	}

}
