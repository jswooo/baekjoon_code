package baekjoon_5;

import java.io.IOException;
import java.util.ArrayList;

public class Q4673 {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 1; i<=10000; i++) {
			numbers.add(i);
		}
		for (int i = 1; i<10000; i++) {
			int sum = i;
			String arr [] = String.valueOf(i).split("");
			for (int j = 0; j<arr.length; j++) {
				sum += Integer.parseInt(arr[j]);
			}
			numbers.remove(Integer.valueOf(sum));
		}
		for(Integer k : numbers) {
			System.out.println(k);
		}
	}
}
