/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Magic Trick

* Link: https://open.kattis.com/problems/magictrick

* @author Tuan Anh Nguyen

* @version 1.0, 26/10/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.10 */

import java.util.*; 

public class magictrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();
        boolean isOk = true;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.lastIndexOf(s.charAt(i))) {
                isOk = false;
                break;
            }
        }
        if(isOk) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        sc.close();
    }
}