package codestudy7;

import java.io.*;
import java.util.StringTokenizer;


public class Q11441 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int m = Integer.parseInt(br.readLine());
		int [] arr = new int [m];
		int [] sum = new int [m+1];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<m; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum[i+1] = sum[i] + arr[i];
		}
		
		int k = Integer.parseInt(br.readLine());
		
		for (int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write((sum[b]-sum[a-1]) + "\n");
		}
		bw.flush();
		bw.close();
	}
}