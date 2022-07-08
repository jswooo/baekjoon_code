package codestudy7;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2548 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int [] arr = new int [n];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		if (n%2==0) {
			System.out.println(arr[n/2-1]);
		}
		else {
			System.out.println(arr[n/2]);
		}
	}
}
