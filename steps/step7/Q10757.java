package baekjoon_7;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger n1 = new BigInteger(st.nextToken());
		BigInteger n2 = new BigInteger(st.nextToken());
		
		bw.write(n1.add(n2) + "");
		
		bw.flush();
		bw.close();
	}
}
