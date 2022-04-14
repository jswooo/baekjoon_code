package codestudy_4_14;

import java.io.*;

public class Q1977 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min = Integer.MAX_VALUE;
		int sum = 0;
		boolean check = false;
		int t = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		for (int i = t; i<=k; i++) {
			if (Math.sqrt(i) == (int)(Math.sqrt(i))) {
				sum += i; 
				check = true;
				if (i<min) {
					min = i;
				}
			}
		}
		if (!check) {
			System.out.println(-1);			
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
