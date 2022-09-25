package optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(8);
			
		System.out.println(list);
		list.forEach(i->System.out.print(i+","));
		System.out.println();
		System.out.println("===============");
		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::print);
		String[] names = new String[] {"k","l","c","p","j"};
		Stream<String> stream2 = Arrays.stream(names);
		System.out.println();
		System.out.println("=======================");
		stream2.forEach(elem ->System.out.print(elem+"\t"));
		System.out.println();
		System.out.println("=======================");
		Stream<String> stream3 = Arrays.stream(names, 1,4);
		stream3.forEach(elem ->System.out.print(elem+"\t"));
		
	}

}
