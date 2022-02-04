/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Three Powers

* Link: https://open.kattis.com/problems/threepowers

* @author Tuan Anh Nguyen

* @version 1.0, 08/11/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.22 */

import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigInteger;

public class threepowers {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<BigInteger> powers3 = new ArrayList<>();
    powers3.add(BigInteger.ONE);

    for (int i = 1; i < 65; i++)
      powers3.add(powers3.get(i - 1).multiply(new BigInteger("3")));

    while (true) {
      BigInteger bigS = new BigInteger(scan.next());
      if (bigS.equals(BigInteger.ZERO)) break;
      bigS = bigS.subtract(BigInteger.ONE);
      String str = bigS.toString(2);
      if (bigS.equals(BigInteger.ZERO))
        System.out.println("{ }");
      else {
        System.out.print("{ ");
        for (int i = str.length() - 1; i >= 0; i--) {
          if (str.charAt(i) == '1') {
            if (i == 0) System.out.print(powers3.get(str.length() - i - 1));
            else System.out.print(powers3.get(str.length() - i - 1) + ", ");
          }
        }
        System.out.println(" }");
      }
    }
    scan.close();
  }
}