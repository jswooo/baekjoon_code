package practice;

import java.io.*;
import java.util.*;
// 참고: https://github.com/GLLSLP/Algorithm/blob/main/%EB%B0%B1%EC%A4%80_20920_%EC%98%81%EB%8B%A8%EC%96%B4%EC%95%94%EA%B8%B0%EB%8A%94%EA%B4%B4%EB%A1%9C%EC%9B%8C.java

public class Q20920_SortOverride_Hashmap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<String> words = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            String s = br.readLine();
            if (s.length() < m) {
                continue;
            }
            if (!map.containsKey(s)) {
                words.add(s);
                map.put(s, 1);
            } else {
                map.replace(s, map.get(s)+1);
            }
        }

        // 정렬 오버라이드
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = map.get(o1);
                int n2 = map.get(o2);

                if (n1==n2) {
                    if (o1.length()==o2.length()) {
                        return o1.compareTo(o2);
                    }
                    if (o1.length() > o2.length()) {
                        return -1; // 내림차순
                    }
                    else {
                        return 1;
                    }
                }

                if (n1>n2) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });

        for (int i=0; i<words.size(); i++) {
            bw.write(words.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
