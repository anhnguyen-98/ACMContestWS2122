/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Tarifa

* Link: https://open.kattis.com/problems/tarifa

* @author Tuan Anh Nguyen

* @version 1.0, 26/10/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.10 */

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int dataPerMonth = Integer.parseInt(sc.next());
        int months = Integer.parseInt(sc.next());
        int rest = dataPerMonth*(months +1);
        for (int i = 0; i < months; i++) {
            rest -= Integer.parseInt(sc.next());
        }
        System.out.println(rest);
        sc.close();
    }
}