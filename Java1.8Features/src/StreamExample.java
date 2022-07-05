import java.util.Arrays;
import java.util.List;

/*
 * Q1 Given a list of integers, find out all the even numbers exist in the list using Stream functions?

 */
public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList=Arrays.asList(10,15,8,49,25,98,32);
		myList.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		

	}

}
