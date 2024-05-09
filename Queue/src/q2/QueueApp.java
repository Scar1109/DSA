package q2;

public class QueueApp {
	public static void main(String[] args) {
        QueueX queue = new QueueX(20);
        String input = "Hello, World!";
        
        for (char c : input.toCharArray()) {
            queue.insert(c);
        }
        
        StringBuilder reversed = new StringBuilder();
        while (!queue.isEmpty()) {
            reversed.insert(0, queue.remove());
        }
        

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed.toString());
    }
}
