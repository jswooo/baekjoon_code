package codestudy7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13301 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long [] square = new long [n+1];
		square[1] = 1;
		if (n>=2)  square[2] = 1; 
		for (int i=3; i<=n; i++) {
			square[i] = square[i-1] + square[i-2];
		}
		
		System.out.println(square[n]*4 + square[n-1]*2);
	}
}
