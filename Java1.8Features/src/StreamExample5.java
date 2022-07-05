import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>fruit=Arrays.asList("Banana","Apple","mango","orange");
		
		fruit.stream().filter(line->!"Apple".equals(line)).forEach(System.out::println);
		System.out.println();

	}

}
