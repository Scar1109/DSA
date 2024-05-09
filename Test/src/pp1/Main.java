package pp1;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
//		Question 01
		
//		Scanner scn = new Scanner(System.in);
//		
//		QueueX charQueue = new QueueX(10);
//		StackX charStack = new StackX(5);
//		char temp;
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Enter a char :");
//			temp = scn.nextLine().charAt(0);
//			charQueue.insert(temp);
//			charStack.push(temp);
//		}
//		
//		while(!charStack.isEmpty()) {
//			charQueue.insert(charStack.pop());
//		}
//		
//		while(!charQueue.isEmplty()) {
//			System.out.print(" " + charQueue.remove() + " ");
//		}
		
		
//		Question 02
		
//		Scanner scn = new Scanner(System.in);
//		
//		QueueX charQueue = new QueueX(5);
//		StackX charStack = new StackX(5);
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Enter a char :");
//			charQueue.insert(scn.nextLine().charAt(0));
//		}
//		
//		while(!charQueue.isEmplty()) {
//			charStack.push(charQueue.remove());
//		}
//		
//		while(!charStack.isEmpty()) {
//			charQueue.insert(charStack.pop());
//		}
//		
//		while(!charQueue.isEmplty()) {
//			System.out.println(" " + charQueue.remove() + " ");
//		}
		
		StackX<Integer> integerStack = new StackX<>(10);
		StackX<Character> characterStack = new StackX<>(10);
		
		printX('a');


	}
	
	public static <E> void printX(E a) {
		System.out.println(a);
	}

}
