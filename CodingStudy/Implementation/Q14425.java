package codestudy7;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Q14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String [] arr = new String[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		int cnt = 0;
		for (int i=0; i<m; i++) {
			if (Arrays.asList(arr).contains(br.readLine())) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}