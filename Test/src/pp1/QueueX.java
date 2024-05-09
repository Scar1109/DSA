package pp1;

public class QueueX {
	
	private char queueArr[];
	private int maxSize;
	private int front;
	private int rear;
	private int noItemes;
	
	public QueueX(int maxSize) {
		this.maxSize = maxSize;
		this.queueArr = new char[maxSize];
		this.front = 0;
		this.rear = -1;
		this.noItemes = 0;
	}

	public boolean isFull() {
		return(noItemes == maxSize);
	}
	
	public boolean isEmplty() {
		return(noItemes == 0);
	}
	
	public void insert(char a) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			
			
			if(rear == maxSize-1) {
				rear = -1;
			}
			
			queueArr[++rear] = a;
			noItemes++;
		}
	}
	
	public char remove() {
		if(isEmplty()) {
			System.out.println("Stack is empty");
			return 0;
		}else {
			
			char temp = queueArr[front++];
			
			if(front == maxSize) {
				front = 0;
			}
			noItemes--;
			return temp;
		}
	}
	
	public char peekFront() {
		if(isEmplty()) {
			System.out.println("Stack is empty");
			return 0;
		}else {
			return queueArr[front];
		}
	}
	
	
	
}
