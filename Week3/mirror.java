/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Mirror Images

* Link: https://open.kattis.com/problems/mirror

* @author Tuan Anh Nguyen

* @version 1.0, 08/11/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.21 */

import java.util.Scanner;

public class mirror {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cases = sc.nextInt();

    for (int i = 0; i < cases; i++) {
      System.out.println("Test " + (i + 1));
      int row_length = sc.nextInt();
      String rows[] = new String[row_length];
      int column_length = sc.nextInt();
      for (int j = 0; j < row_length; j++) {
        rows[j] = sc.next();
        if (rows[j].length() != column_length) {
          sc.close();
          break;
        }
      }
      for (int j = row_length -1; j >= 0; j--) {
        System.out.println(new StringBuilder(rows[j]).reverse().toString());
      }
    }
    sc.close();
  }
}