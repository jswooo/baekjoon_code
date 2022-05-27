package binarySearch;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
 * Using binarySearch library in Arrays
 */

public class Q10815_useLibrary {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n1 = Integer.parseInt(br.readLine());
		int nums [] = new int [n1];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n1; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		int n2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int j=0; j<n2; j++) {
			int d = Integer.parseInt(st.nextToken());
			if (Arrays.binarySearch(nums, d)>=0) {
				bw.write(1+ " ");
			}
			else {
				bw.write(0+ " ");
			}
		}
		bw.flush();
		bw.close();
	}
}