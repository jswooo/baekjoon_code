package baekjoon_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		
		String s = br.readLine().toUpperCase();
		int [] arr = new int [26];
		
		for (int i = 0; i<s.length(); i++) {
			arr[s.charAt(i)-65]++;
		}
		
		int max = -1;
		char alpa = '?';
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
				alpa = (char)(i+65);
			}
			else if (max == arr[i]){
				alpa = '?';
			}
		}
		bw.write(String.valueOf(alpa));
		
		bw.flush();
		bw.close();
	}
}