package Cumulus_System;
import java.util.Arrays;
import java.util.List;

/*
 * Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?

 */
public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l2=Arrays.asList(10,15,8,49,25,98,32);
		l2.stream().map(s->s.toString()).filter(s->s.startsWith("1")).forEach(System.out::println);
		

	}

}
