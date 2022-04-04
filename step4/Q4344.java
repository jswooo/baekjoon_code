package baekjoon_4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q4344 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i<T ; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int [] arr = new int [n];
			for (int j = 0; j<n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			double cnt = 0;
			double avg = Arrays.stream(arr).sum()/n;
			for (int j = 0; j<arr.length; j++) {
				if (arr[j]>avg) {
					cnt++;
				}
			}
			bw.write(String.format("%.3f", cnt/n*100) + "%" +"\n");
		}
		bw.flush();
		bw.close();
	}
}
