/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Mixed Fractions

* Link: https://open.kattis.com/problems/mixedfractions

* @author Tuan Anh Nguyen

* @version 1.0, 08/11/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.30 */

import java.util.Scanner;
import java.math.BigInteger;

public class mixedfractions {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while (true) {
      BigInteger num = new BigInteger(scan.next());
      BigInteger den = new BigInteger(scan.next());
      if (num.equals(BigInteger.ZERO) || den.equals(BigInteger.ZERO)) break;

      BigInteger number = num.divide(den);
      BigInteger num1 = num.subtract(number.multiply(den));

      System.out.println(number + " " + num1 + " / " + den);
    }
    scan.close();
  }
}