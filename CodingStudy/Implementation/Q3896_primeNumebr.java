package codestudy7;

import java.io.*;

public class Q3896_primeNumebr {
	static int n = 1299709;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean [] nprime = new boolean [n+1];
		nprime[0] = nprime[1] = true;
		for (int i=2; i*i<=n; i++) {
			if (!nprime[i]) {
				for (int j = i*i; j<=n; j+=i) {
					nprime[j] = true;	// prime -> false, not prime -> true
				}
			}			
		}
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			int k = Integer.parseInt(br.readLine());
			if (nprime[k]) {
				int n1 = k;
				int n2 = k;
				while(true) {
					if (!nprime[--n1]) {
						break;
					}
				}	
				while(true) {
					if (!nprime[++n2]) {
						break;
					}	
				}
				bw.write(n2-n1+"\n");
			} else bw.write(0 +" \n");	
		}
		bw.flush();
		bw.close();
	}
}
