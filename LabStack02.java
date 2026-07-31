import java.util.Stack;
public class LabStack02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stacks = new Stack<>();
		
		for (int i=0; i<5; i++) {
			System.out.println("Push in track : " +(i+1));
			stacks.push(i+1);
		}
		
		System.out.println("Train car after into dead-end track : " + stacks.toString());
		
		while(!stacks.isEmpty()) {
			System.out.println("Pop from track : " + stacks.peek());
			stacks.pop();
		}
		System.out.println("Train car after into dead-end track : " + stacks.toString());


	}

}
