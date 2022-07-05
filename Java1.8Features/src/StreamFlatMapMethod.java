import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>even=Arrays.asList(2,4,6);
		List<Integer>odd=Arrays.asList(3,5,7);
		List<Integer>prime=Arrays.asList(2,3,5,7,11);
		List<Integer>numbers =Stream.of(even,odd,prime).flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println(numbers);

	}

}
