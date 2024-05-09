import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		
//		
//		s.push('a');
//		s.push('b');
//		s.push('c');
//		s.push('d');
//		s.push('e');
//		
//		while(!s.isEmpty()) {
//			System.out.println(s.pop());
//		}
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a expression : ");
		String expression = scn.nextLine();
		
		int len = expression.length();
		
		StackX s = new StackX(len);
		
		for(int i = 0; i < len ; i++) {
			if(expression.charAt(i) == '(') {
				s.push('(');
			}else if(expression.charAt(i) == ')') {
				if(s.isEmpty()) {
					System.out.println("The statement is not Correctly Parenthesized");
					return;
				}else {
					s.pop();
				}
			}
		}
		
		if(s.isEmpty()) {
			System.out.println("The statement is Correctly Parenthesized");
		}else {
			System.out.println("The statement is not Correctly Parenthesized");
		}
		
		
	}
}
