/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Billiard

* Link: https://open.kattis.com/problems/billiard

* @author Tuan Anh Nguyen

* @version 1.0, 23/01/2022

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.16 */

import java.util.*;
import java.math.*;

public class billiard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, s, m, n;
        do {
            a = sc.nextInt(); 
            b = sc.nextInt(); 
            s = sc.nextInt(); 
            m = sc.nextInt(); 
            n = sc.nextInt();
            double angle, totalD;
            if (a > 0 && b > 0 && s > 0 && m > 0 && n > 0) {
                if(m == 0){
                    angle = Math.PI / 2;
                    totalD = b * n;
                }
                else{
                    angle = Math.atan((n*1.0 / a) / (m*1.0 / b));
                    double x = b * n;
                    double y = a * m;
                    totalD = Math.sqrt((x * x) + (y * y));
                }
                System.out.printf("%.2f %.2f%n", (angle*180/Math.PI), (totalD*1.0 / s));
            }
        } while(a > 0 && b > 0 && s > 0 && m > 0 && n > 0);
    }
}