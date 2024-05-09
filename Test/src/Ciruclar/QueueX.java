package Ciruclar;

public class QueueX {
	private char queueArr[];
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	public QueueX(int s) {
		this.maxSize = s;
		this.queueArr = new char[maxSize];
		this.front = 0;
		this.noItems = 0;
		this.rear = -1;
	}
	
	public boolean isEmpty() {
		return(noItems == 0);
	}
	
	public boolean isFull() {
		return(noItems == maxSize);
	}
	
	public void insert(char j) {
		if(!isFull()) {
			if(rear == maxSize-1)
				rear = -1;
			
			queueArr[++rear] = j;
			noItems++;
		}else {
			System.out.println("Queue is full!");
		}
	}
	
	public char remove() {
		if(!isEmpty()) {
			char temp = queueArr[front++];
			if(front == maxSize)
				front = 0;
			noItems--;
			return temp;
			
		}else {
			System.out.println("The queue is empty!");
			return 0;
		}
	}
	
	public char peekFront() {
		if(!isEmpty()){
			return queueArr[front];
		}
		else {
			System.out.println("Array is empty");
			return 0;
		}
	}
}
