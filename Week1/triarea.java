/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Triangle Area

* Link: https://open.kattis.com/problems/triarea

* @author Tuan Anh Nguyen

* @version 1.0, 26/10/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.10 */

import java.util.Scanner; 

public class triarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        float height = Float.parseFloat(sc.next());
        float base = Float.parseFloat(sc.next());
        System.out.println((height*base/2));
        sc.close();
    }
}