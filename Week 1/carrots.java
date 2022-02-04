/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Solving for Carrots

* Link: https://open.kattis.com/problems/carrots

* @author Tuan Anh Nguyen

* @version 1.0, 26/10/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.09 */

import java.util.Scanner; 

public class carrots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int people = Integer.parseInt(sc.next());
        int problem = Integer.parseInt(sc.next());
        for (int i = 0; i < people; i++) {
            sc.next();
        }
        System.out.println(problem);
        sc.close();
    }
}