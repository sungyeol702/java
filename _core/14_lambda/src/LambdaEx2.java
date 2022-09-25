import java.util.ArrayList;

public class LambdaEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.forEach(i-> System.out.print(i+", "));
		System.out.println();
		System.out.println(list);
		
		list.removeIf(x-> x%2==0||x%3==0);
		System.out.println(list);

		list.replaceAll(y -> y*5);
		System.out.println(list);
		
	}

}
