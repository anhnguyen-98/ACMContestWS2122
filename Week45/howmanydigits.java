/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: How Many Digits?

* Link: https://open.kattis.com/problems/howmanydigits

* @author Tuan Anh Nguyen

* @version 1.0, 28/11/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.31 */

import java.util.Scanner;

public class howmanydigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNextInt()) {
            int x = scan.nextInt();
            System.out.println((int)(Math.log10(Math.sqrt(2 * x * Math.PI)) + x*Math.log10(x / Math.E)) + 1);
        }
        scan.close();
    }
}