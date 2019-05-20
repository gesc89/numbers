package numbers.calculator;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(5);
		numbers.add(3);
		numbers.add(11);
		numbers.add(20);
		numbers.add(4);

		int sum = 0;

		for (int number : numbers) {

			if (number % 2 == 0) {

				sum += number;

			}

		}
		
		System.out.println(sum);
	}
}
