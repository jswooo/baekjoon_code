package baekjoon_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		
		String s = br.readLine();
		int cnt = 0;
		
		for (int i =0; i<s.length(); i++) {
			if (s.charAt(i)=='=' || s.charAt(i) == '-') {
				cnt ++;
			}
		}
		for (int i = 0; i<s.length()-1; i++) {
			if (s.substring(i, i+2).contains("lj") || s.substring(i, i+2).contains("nj")) {
				cnt ++;
			}
		}
		for (int i = 0; i<s.length()-2; i++) {
			if (s.substring(i, i+3).contains("dz=")) {
				cnt++;
			}
		}
		bw.write((s.length()-cnt)+ "");
		bw.flush();
		bw.close();
	}
}
