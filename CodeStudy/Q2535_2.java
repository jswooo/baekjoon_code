package codestudy;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q2535_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		int [][] arr = new int [T][3];
		
		for (int i = 0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j<3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o2[2] - o1[2];
			}
		});
		for (int i = 0; i<2; i++) {
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		}
		if (arr[0][0] == arr[1][0]) {
			for (int i = 2; i<arr.length; i++) {
				if (arr[0][0] != arr[i][0]) {
					bw.write(arr[i][0] + " " + arr[i][1] + "\n");
                    break;
				}
			}
		}
		else {
			bw.write(arr[2][0] + " " + arr[2][1] + "\n");
		}
        bw.flush();
        bw.close();
	}
}