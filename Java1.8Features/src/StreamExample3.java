import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l3=Arrays.asList(10,15,8,49,25,98,98,15,25,32);
		Set<Integer> set=new HashSet<>();
	
//		for(Integer num:l3) {
//			if(set.add(num)==false) {
//				System.out.println("duplicate elements in array:"+num );
//			}
//		}
		l3.stream().filter(num->!set.add(num)).forEach(System.out::println);
		
// * Q4 Given the list of integers, find the first element of the list using Stream functions?
		
		l3.stream().findFirst().ifPresent(System.out::println);
		



	}

}
