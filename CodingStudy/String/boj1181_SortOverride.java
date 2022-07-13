package practice;

import java.io.*;
import java.util.*;

public class boj1181_SortOverride {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> words = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String s = br.readLine();
            if (!words.contains(s)) {
                words.add(s);
            }
        }

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = o1.length();
                int n2 = o2.length();

                if (n1==n2) {
                    return o1.compareTo(o2);
                }
                else if (n1>n2) {
                    return 1;
                }
                else return -1;
            }
        });
        for (int i=0; i< words.size(); i++) {
            bw.write(words.get(i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}

