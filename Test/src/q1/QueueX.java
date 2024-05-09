package q1;

public class QueueX {
	private int queueArr[];
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	public QueueX(int s) {
		this.maxSize = s;
		this.queueArr = new int[maxSize];
		this.front = 0;
		this.noItems = 0;
		this.rear = -1;
	}
	
	public boolean isEmpty() {
		return(noItems == 0);
	}
	
	public boolean isFull() {
		return(rear == maxSize - 1);
	}
	
	public void insert(int j) {
		if(!isFull()) {
			queueArr[++rear] = j;
			noItems++;
		}else {
			System.out.println("Queue is full!");
		}
	}
	
	public int remove() {
		if(!isEmpty()) {
			noItems--;
			return queueArr[front++];
		}else {
			System.out.println("The queue is empty!");
			return -99;
		}
	}
	
	
}
