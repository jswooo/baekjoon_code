package binarySearch;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815 {
	public static int binarySearch(int k, int arr[]) {
		int mid;
		int min = 0;
		int max = arr.length-1;
		
		while(max>=min) { 
			mid = (min+max)/2;
			if (k == arr[mid]) return 1;
			else if (arr[mid] < k) {
				min = mid + 1;
			}
			else if (arr[mid] > k) {
				max = mid -1;
			}
		}
		return 0;
	}
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
			int k = binarySearch(d, nums);
			bw.write(k+" ");
		}
		bw.flush();
		bw.close();
	}
}
