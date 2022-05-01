package codestudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q16466 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		int T = Integer.parseInt(br.readLine());
		int [] arr = new int [T];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<T; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for (int i = 1; i<T; i++) {
			if (arr[0]>1) {
				System.out.println(1);
				return;
			}
			else {
				if ((arr[i]-arr[i-1]) != 1) {
					System.out.println(arr[i-1]+1);
					return;
				}
			}
		}
		System.out.println((arr.length)+1);
	}
}
