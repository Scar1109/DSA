package Ciruclar;

public class QueueApp {

	public static void main(String[] args) {
		
		QueueX myQueue = new QueueX(4);
		
		myQueue.insert('l');
		myQueue.insert('m');
		myQueue.insert('n');
		myQueue.insert('o');
		
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.remove());
		}

	}

}
