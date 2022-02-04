/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Rational Arithmetic

* Link: https://open.kattis.com/problems/rationalarithmetic

* @author Tuan Anh Nguyen

* @version 1.0, 08/11/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.48 */

import java.util.*; 
import java.math.BigInteger;

public class rationalarithmetic {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); 
    int cases = sc.nextInt();
    
    
    for (int i = 0; i < cases; i++) {
        
        BigInteger num1 = new BigInteger(sc.next());
        BigInteger den1 = new BigInteger(sc.next());
    
        String operand = sc.next();
        
        BigInteger num2 = new BigInteger(sc.next());
        BigInteger den2 = new BigInteger(sc.next());
        
        BigInteger num3;
        BigInteger den3;
        
        if (operand.equals("+")){
            num3 = (num1.multiply(den2)).add( num2.multiply(den1));
            den3 = den1.multiply(den2);
        } else if (operand.equals("-")) {
            num3 = (num1.multiply(den2)).subtract(num2.multiply(den1));
            den3 = den1.multiply(den2);
        } else if (operand.equals("*")) {
            num3 = num1.multiply(num2);
            den3 = den1.multiply(den2);
        } else {
            num3 = num1.multiply(den2);
            den3 = den1.multiply(num2);
        }
        
        BigInteger GCF = num3.gcd(den3);
        num3 = num3.divide(GCF);
        den3 = den3.divide(GCF);
        
        if (den3.compareTo(BigInteger.ZERO) < 0) {
            den3 = den3.negate();
            num3 = num3.negate();
        }
        
        System.out.println(num3 + " / " + den3);
    }
    sc.close();
  }
}