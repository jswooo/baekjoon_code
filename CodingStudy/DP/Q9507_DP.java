package codestudy7;

import java.io.*;

public class Q9507_DP {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long [] k = new long [68];
		k[0] = k[1] = 1;
		k[2] = 2;
		k[3] = 4;
		for (int i=4; i<=67; i++) {
			k[i] = k[i-1] + k[i-2] + k[i-3] + k[i-4];
		}
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			int s = Integer.parseInt(br.readLine());
			System.out.println(k[s]);
		}
	}
}