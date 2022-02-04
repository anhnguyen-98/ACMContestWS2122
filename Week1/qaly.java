/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Quality-Adjusted Life-Year 

* Link: https://open.kattis.com/problems/qaly

* @author Tuan Anh Nguyen

* @version 1.0, 26/10/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.11 */

import java.util.Scanner; 

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int period = Integer.parseInt(sc.next());
    float QALY = 0;
    for (int i = 0; i < period; i++) {
        QALY += Float.parseFloat(sc.next()) * Float.parseFloat(sc.next());
    }
    System.out.printf("%.3f", QALY);
  }
}
