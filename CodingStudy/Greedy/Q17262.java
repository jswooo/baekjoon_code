package study5_11;

import java.io.*;
import java.util.StringTokenizer;


public class Q17262 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int endTime = Integer.MAX_VALUE;
		int startTime = Integer.MIN_VALUE;
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			if (n1>startTime) startTime = n1;
			if (n2<endTime) endTime = n2;
		}
		if (startTime-endTime <= 0) {
			System.out.println(0);
		}
		else {
			System.out.println(startTime-endTime);
		}
	}
}
