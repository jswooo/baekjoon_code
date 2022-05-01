package codestudy;

import java.io.*;
import java.util.StringTokenizer;

public class Q2979 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		int sum = 0;
		String [] pay = br.readLine().split(" ");
		int a = Integer.parseInt(pay[0]);
		int b = Integer.parseInt(pay[1]);
		int c = Integer.parseInt(pay[2]);
		int [] cnt = new int [101];
		int max = 0;
		int min = 0;
		
		for (int i = 0; i<3; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			max = Math.max(max, end);
			min = Math.min(min, start);
			
			for (int j = start; j < end; j++) {
				cnt[j]++;
			}
		}
		for (int i = min; i<max; i++) {
			if (cnt[i]==1) {
				sum += a;
			}
			else if (cnt[i]==2) {
				sum += b*2; 
			}
			else if (cnt[i]==3) {
				sum += c*3;
			}
		}
		System.out.println(sum);
	}
}
