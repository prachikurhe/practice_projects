package Collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();//It specially designed class for last in first out order
		s.push("A");
		s.push("B");
		s.push("C");
		//s.pop();
		//s.peek();
		
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		

	}

}
