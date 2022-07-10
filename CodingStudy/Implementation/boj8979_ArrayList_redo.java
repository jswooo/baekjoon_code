package practice;

import java.io.*;
import java.util.*;

public class boj8979_ArrayList_redo {
    static class Nation implements Comparable<Nation> {
        int num, gold, silver, bronze;

        public Nation(int num, int gold, int silver, int bronze) {
            this.num = num;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public int compareTo(Nation o) {
            if (this.gold == o.gold) {
                if (this.silver == o.silver) {
                    return o.bronze - this.bronze;
                }
                else return o.silver - this.silver;
            }
            else return  o.gold - this.gold;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Nation> arr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            Nation nation = new Nation(num,gold,silver,bronze);
            arr.add(nation);
        }
        Collections.sort(arr);

        int rate = 1;
        int cnt = 1;

        if (arr.get(0).num == k) {
            System.out.println(1);
            return;
        }

        for (int i=1; i<n; i++) {
            Nation prev = arr.get(i-1);
            Nation cur = arr.get(i);

            if (prev.gold != cur.gold || prev.silver != cur.silver || prev.bronze != cur.bronze) {
                rate += cnt;
                cnt = 1;
            }
            else {
                cnt++;
            }

            if (cur.num == k) {
                System.out.println(rate);
                break;
            }
        }
    }
}
