package baekjoon_4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Q1546_2 {
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
		double max = Arrays.stream(arr).max().getAsDouble();
		double avg = (Arrays.stream(arr).sum()*100)/(max*T);
		
		bw.write(avg + "");
		bw.flush();
		bw.close();
	}
}