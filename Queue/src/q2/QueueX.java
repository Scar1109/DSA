package q2;

public class QueueX {
	private char queueArr[];
	private int maxSize;
	private int front;
	private int rear;
	private int noItems;
	
	public QueueX(int s) {
		this.maxSize = s;
		queueArr = new char[maxSize];
		
		this.front = 0;
		this.noItems = 0;
		this.rear = -1;
	}
	
	public boolean isEmpty() {
		return(noItems==0);
	}
	
	public boolean isFull() {
		return (noItems == maxSize);
	}
	
	public void insert(char j) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			if(rear == maxSize-1) {
				rear = -1;
			}
			
			queueArr[++rear] = j;
			noItems++;
		}
	}
	
	public char remove() {
		if(isEmpty()) {
			System.out.println("Queue is emplty");
			return 0;
		}
		else {
			char temp = queueArr[front++];
			if(front == maxSize) {
				front = 0;
			}
			noItems--;
			return temp;
		}
	}
	
	public char peekFront() {
		if(isEmpty()) {
			System.out.println("Queue is emplty");
			return 0;
		}else {
			return queueArr[front];
		}
	}
}
