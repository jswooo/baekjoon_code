package baekjoon_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10870 {
	static int fibo(int n) {
		if (n==0) return 0;
		else if (n==1) return 1;
		else {
			return fibo(n-1) + fibo(n-2);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		System.out.println(fibo(t));
	}
}
