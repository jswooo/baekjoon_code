package baekjoon_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double t = Double.parseDouble(br.readLine());
		double n1 = Math.PI * Math.pow(t, 2);
		double n2 = 2 * Math.pow(t, 2);
		
		bw.write(String.format("%.6f", n1) + "\n");
		bw.write(String.format("%.6f", n2));
		
		bw.flush();
		bw.close();
	}		
}