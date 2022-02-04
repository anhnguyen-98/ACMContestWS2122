/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Goldbach's Conjecture

* Link: https://open.kattis.com/problems/goldbach2

* @author Tuan Anh Nguyen

* @version 1.0, 01/11/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.57 */

import java.util.*; 
import java.lang.Math;

public class goldbach2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); 
    int cases = Integer.parseInt(sc.next());
    for (int i = 0; i < cases; i++) {
      int number = Integer.parseInt(sc.next());
      int count = 0;
      for (int j = 2; j <= number/2; j++) {
        if (isPrime(j) && isPrime(number - j) ) {
          count++;
        }
      }
      System.out.println(number + " has " + count + " representation(s)");
      for (int j = 2; j <= number/2; j++) {
        if (isPrime(j) && isPrime(number - j) ) {
          System.out.println(j + "+" + (number - j));
        }
      }
      count = 0;
    }
    sc.close();
  }

  public static boolean isPrime(int n) {
    if (n == 2) return true;
    if (n == 1) return false;
    else if (n % 2 == 0) return false;
    for (int i = 3; i <= Math.sqrt(n); i=i+2) {
      if (n % i ==0) return false;
    }
    return true;
  }
}