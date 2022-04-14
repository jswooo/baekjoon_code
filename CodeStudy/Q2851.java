package codestudy_4_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2851 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for(int k = 0; k<10; k++) {
			int i = Integer.parseInt(br.readLine());
			
			sum += i;
			if (sum == 100) {
				System.out.println(100);
				return;
			}
			
			if (sum>100) {
				if (Math.abs(sum-100)> Math.abs(sum-i-100)) System.out.println(sum-i);
				else if (Math.abs(sum-100) <= Math.abs(sum-i-100)) System.out.println(sum);
				return;
			}
		}
		System.out.println(sum);
	}
}