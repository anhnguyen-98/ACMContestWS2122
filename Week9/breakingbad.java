/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Breaking Bad

* Link: https://open.kattis.com/problems/breakingbad

* @author Tuan Anh Nguyen

* @version 1.0, 16/01/2022

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.98 */

import java.util.*;

public class breakingbad {
    
    static List<String> list;
    static Set<String> walter, jesse;
    static HashMap<String, Set<String>> map;
    static boolean isPossible;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new HashMap<>();
        walter = new HashSet<>();
        jesse = new HashSet<>();
        
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            list.add(s);
            map.put(s, new HashSet<>());
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String item1 = sc.next();
            String item2 = sc.next();
            map.get(item1).add(item2);
            map.get(item2).add(item1);
        }
        isPossible = true;
        for (String thing : list) {
            sort(thing);
        }
       
        if (isPossible) {
            for (String item : walter) {
                System.out.print(item + " ");
            }
            System.out.println();
            for (String item : jesse) {
                System.out.print(item + " ");
            }
        } else {
            System.out.println("impossible");
        }
    }

    static void sort(String item) {
        if (!walter.contains(item) && !jesse.contains(item)) {
            walter.add(item);
        }
        for (String pair_item : map.get(item)) {
            if (walter.contains(item) && !walter.contains(pair_item) && !jesse.contains(pair_item)) {
                jesse.add(pair_item);
                sort(pair_item);
            } else if (jesse.contains(item) && !jesse.contains(pair_item) && !walter.contains(pair_item)) {
                walter.add(pair_item);
                sort(pair_item);
            } else if ((jesse.contains(item) && jesse.contains(pair_item)) || (walter.contains(item) && walter.contains(pair_item))) {
                isPossible = false;
            }
        }
    }
}