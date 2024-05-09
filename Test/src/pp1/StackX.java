package pp1;

public class StackX <T> {
	
	private int Top;
	private T stackArr[];
	private int maxSize;
	
	public StackX(int maxSize) {
		this.maxSize = maxSize;
		this.stackArr = (T[]) new Object[maxSize];
		this.Top = -1;
	}

	public boolean isFull() {
		return(Top == maxSize-1);
	}
	
	public boolean isEmpty() {
		return (Top == 0);
	}
	
	public void push(T a) {
		if(isFull()) {
			System.out.println("Stack is full!");
		}else {
			stackArr[++Top] = a;
		}
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return null;
		}else {
			return stackArr[Top--];
		}
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return null;
		}else {
			return stackArr[Top];
		}
	}

}
