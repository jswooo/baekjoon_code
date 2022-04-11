package baekjoon_4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Q1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		double [] arr = new double [T];
		for (int i = 0; i<T; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		double max = arr[T-1];
		double total = 0 ;
		
		for (int i = 0; i < T; i++) {
			total += (arr[i]/max*100);
		}
		bw.write((total/T) + "");
		
		bw.flush();
		bw.close();
	}
}