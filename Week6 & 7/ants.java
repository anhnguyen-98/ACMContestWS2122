/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Ants

* Link: https://open.kattis.com/problems/ants

* @author Tuan Anh Nguyen

* @version 1.0, 06/12/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.82 */

import java.util.*;

public class ants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- > 0) {
            int len = sc.nextInt(), n = sc.nextInt(), min = 0;
            int[] ants = new int[n];
            for (int i = 0; i < n; i++) {
                ants[i] = sc.nextInt();
                min = Math.max(Math.min(ants[i], len - ants[i]), min);
            }
            Arrays.sort(ants);
            int[] max = {ants[0], ants[n - 1], len - ants[0], len - ants[n - 1]};

            Arrays.sort(max);
            System.out.println(min + " " + max[3]);
        }
    }
}