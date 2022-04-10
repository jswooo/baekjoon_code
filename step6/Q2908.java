package baekjoon_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		
		String s [] = br.readLine().split(" ");
		String a1 = s[0];
		String a2 = s[1];
		
		int n1 = (a1.charAt(0)-'0') + (a1.charAt(1)-'0')*10 + (a1.charAt(2)-'0')*100;
		int n2 = (a2.charAt(0)-'0') + (a2.charAt(1)-'0')*10 + (a2.charAt(2)-'0')*100;
		
		if (n1>n2) {
			bw.write(n1 + "");
		}
		else {
			bw.write(n2 + "");
		}
		
		bw.flush();
		bw.close();
	}
}
