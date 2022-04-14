package codestudy_4_14;

import java.io.*;
import java.util.StringTokenizer;

public class Q1551 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int [] a = new int [n+k];
		String [] nums = br.readLine().split(",");
		for (int i = 0; i<n; i++) {
			a[i] = Integer.parseInt(nums[i]);			
		}
		
		for (int i = 0; i<k; i++) {
			for (int j = 0; j <n-i-1 ;j++) {
				a[j] = a[j+1] - a[j];
			}
		}
		for (int i = 0; i<n-k; i++) {
			System.out.print(a[i]);
			if (i != n-k-1) {
				System.out.print(",");
			}
		}
	}
}