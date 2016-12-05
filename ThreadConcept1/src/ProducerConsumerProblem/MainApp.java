package ProducerConsumerProblem;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {

		List<Integer> arryList = new ArrayList<>();
		
		Thread producer = new Thread(new Producer(arryList));
		Thread consumer = new Thread(new Consumer(arryList));
		
		producer.start();
		consumer.start();
	}

}
