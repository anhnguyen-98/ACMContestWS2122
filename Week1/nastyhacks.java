/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Nasty Hacks

* Link: https://open.kattis.com/problems/nastyhacks

* @author Tuan Anh Nguyen

* @version 1.0, 26/10/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.11 */

import java.util.*; 

public class nastyhacks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int cases = Integer.parseInt(sc.next());
        int[] decisions = new int[cases];
        for (int i = 0; i < cases; i++) {
            decisions[i] =  Integer.parseInt(sc.next()) - Integer.parseInt(sc.next()) + Integer.parseInt(sc.next());
        }
    
        for (int decision : decisions) {
            if (decision > 0) {
                System.out.println("do not advertise");
            } else if (decision == 0) {
                System.out.println("does not matter");
            } else if (decision < 0) {
                System.out.println("advertise");
            }
        }
        sc.close();
    }
}