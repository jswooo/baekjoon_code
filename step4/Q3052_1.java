package baekjoon_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q3052_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int [] arr = new int [10];
		int cnt = 1;
		
		for (int i = 0; i<10; i++) {
			int k = Integer.parseInt(br.readLine());
			arr[i] = k%42;
		}
		Arrays.sort(arr);
		for (int i = 0; i<arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		
		bw.flush();
		bw.close();
	}
}