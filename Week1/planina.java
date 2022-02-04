/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Planina

* Link: https://open.kattis.com/problems/planina

* @author Tuan Anh Nguyen

* @version 1.0, 26/10/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.09 */

import java.util.*; 
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int iterations = Integer.parseInt(sc.next());
        int pointsInARow = 2;
        for (int i = 0; i < iterations; i++) {
            pointsInARow +=  Math.pow(2, i);
        }
        System.out.println(pointsInARow*pointsInARow);
        sc.close();
    }
}