/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Jumbo Javelin

* Link: https://open.kattis.com/problems/jumbojavelin

* @author Tuan Anh Nguyen

* @version 1.0, 26/10/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.10 */

import java.util.*; 

public class jumbojavelin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int steel = Integer.parseInt(sc.next());
        int total = 0;
        for (int i = 0; i < steel; i++) {
            total += (Integer.parseInt(sc.next()) - 1);
        }
        System.out.println(total+1);
        sc.close();
    }
}