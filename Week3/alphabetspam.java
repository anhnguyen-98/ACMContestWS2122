/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Alphabet Spam

* Link: https://open.kattis.com/problems/alphabetspam

* @author Tuan Anh Nguyen

* @version 1.0, 09/11/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.22 */

import java.util.Scanner;

public class alphabetspam {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String inputString = scan.nextLine();
    double stringLength = inputString.length();

    System.out.println(String.format("%.6f", countUnderscore(inputString) / stringLength));
    System.out.println(String.format("%.6f", countLowerCase(inputString)  / stringLength));
    System.out.println(String.format("%.6f", countUpperCase(inputString)  / stringLength));
    System.out.println(String.format("%.6f", countSymbol(inputString)  / stringLength));
    
    scan.close();
  }
  private static long countUpperCase(String inputString) {
    return inputString.chars().filter((s)->Character.isUpperCase(s)).count();
  }
  private static long countLowerCase(String inputString) {
    return inputString.chars().filter((s)->Character.isLowerCase(s)).count();
  }
  private static long countUnderscore(String inputString) {
    return inputString.chars().filter((s)-> s == '_').count();
  }
  private static long countSymbol(String inputString) {
    return inputString.chars().filter((s)-> (s >= '!' && s <= '@') || (s >= '[' && s <= '^') || s == '`' || (s >= '{' && s <= '~')).count();
  }
}