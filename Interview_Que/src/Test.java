import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Given a list of integers, find out all the numbers starting with 1 using Stream functions?
10,15,8,49,25,98,32
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(8);
		l.add(49);
		l.add(25);
		l.add(98);
		l.add(1);
//		System.out.println(l);

		l.forEach(element -> {
			int temp = element;
			while (element >= 10) {
				element = element / 10;
			}

			if (element == 1) {
				System.out.println(" " + temp);
			}
		});

		l.stream().filter(num -> {
			while (num >= 10) {
				num = num / 10;
			}

			if (num == 1) {
		//		System.out.println(" " + temp);
				return true;
			}
			return false;
		}).forEach(num -> System.out.println(num));

	}

}
