/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Take Two Stones

* Link: https://open.kattis.com/problems/twostones

* @author Tuan Anh Nguyen

* @version 1.0, 26/10/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.10 */

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int stones = Integer.parseInt(sc.next());
        if (stones % 2 == 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
        sc.close();
    }
}