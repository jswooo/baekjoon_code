package baekjoon_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Q3052_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i<10; i++) {
			set.add(Integer.parseInt(br.readLine())%42);
		}
		bw.write(set.size()+ "");
		
		bw.flush();
		bw.close();
	}
}