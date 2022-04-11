package baekjoon_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int [] nums = new int [9];
		
		for (int i = 0; i<9; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		int max = nums[0];
		int n = 1;
		
		for (int i = 1; i<9; i++) {
			if(max < nums[i]) {
				max = nums[i];
				n = (i+1);
			}
		}
		bw.write(max + "\n" + n);
		
		bw.flush();
		bw.close();
	}
}