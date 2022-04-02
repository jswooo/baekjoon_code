package baekjoon_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		n -= (2541-1998);
		System.out.println(n);
	}
}