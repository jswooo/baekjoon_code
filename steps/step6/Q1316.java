package baekjoon_6;

import java.io.*;
import java.util.Arrays;

public class Q1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		int T = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i<T; i++) {
			String s = br.readLine();
			int [] arr = new int [26];
			
			arr[s.charAt(0)-'a']++;
			
			for (int j = 1; j<s.length(); j++) {
				if (s.charAt(j) != s.charAt(j-1)) {
					arr[s.charAt(j)-'a']++;
				}
			}
			if (Arrays.stream(arr).max().getAsInt() <2 ) {
				cnt++;
			}
		}
		bw.write(cnt + "");
		
		bw.flush();
		bw.close();
	}
}
