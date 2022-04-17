package stack;

import java.io.*;
import java.util.Stack;


public class Q3986 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i=0; i<t; i++) {
			String s = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			stack.push(s.charAt(0));
			
			for (int j=1; j<s.length(); j++) {
				if(!stack.isEmpty()) {
					if(stack.peek() == s.charAt(j)) {
						stack.pop();
						continue;
					}
				}
				stack.push(s.charAt(j));
			}
			if(stack.isEmpty()) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
