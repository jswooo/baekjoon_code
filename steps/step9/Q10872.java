package baekjoon_9;

import java.io.*;

public class Q10872 {
	static int factorial(int n) {
		if (n==0)
			return 1;
		else {
			return n*factorial(n-1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(t));
	}
}
