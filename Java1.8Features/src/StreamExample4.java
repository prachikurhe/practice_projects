import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Q4 Given the list of integers, find the first element of the list using Stream functions?

 */
public class StreamExample4 {

	public static void main(String[] args) {
		List<Integer> l4=Arrays.asList(10,15,8,49,25,98,98,15,25,32);
		l4.stream().findFirst().
		ifPresent(System.out::println);
		
		System.out.println();
//Q5 Given a list of integers, find the total number of elements present in the list using Stream functions?
        long count=l4.stream().count();
        System.out.println(count);
        
 //Q6 Given a list of integers, find the maximum value element present in it using Stream functions?   
        int max=l4.stream().max(Integer::compare).get();
        System.out.println(max);
        System.out.println();
        
//Q9 Given a list of integers, sort all the values present in it using Stream functions?
        l4.stream().sorted().forEach(System.out::println);
        
        System.out.println();

 //Q10 Given a list of integers, sort all the values present in it in descending order using Stream functions?
       l4.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
