/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Pot

* Link: https://open.kattis.com/problems/pot

* @author Tuan Anh Nguyen

* @version 1.0, 26/10/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.09 */

import java.util.Scanner; 
import java.lang.Math;

public class pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int count = Integer.parseInt(sc.next());
        int sum = 0;
         for (int i = 0; i < count; i++) {
             int number = Integer.parseInt(sc.next());
            sum += Math.pow(number/10, number - number/10 * 10);
        }
        System.out.println(sum);
        sc.close();
    }
}