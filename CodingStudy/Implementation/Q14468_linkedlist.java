package codestudy7;


import java.io.*;
import java.util.LinkedList;

public class Q14468_linkedlist {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String [] arr = s.split("");
		
		LinkedList<String> alpa = new LinkedList<>();
		int num = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(alpa.contains(arr[i])) {
				int n = alpa.indexOf(arr[i]);
				num += (alpa.size() - n -1);
				alpa.remove(n);
			} 
			else {
				alpa.add(arr[i]);
			}
		}
		System.out.println(num);
	}
}
