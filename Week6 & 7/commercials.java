/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Radio Commercials

* Link: https://open.kattis.com/problems/commercials

* @author Tuan Anh Nguyen

* @version 1.0, 06/12/2021

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.50 */

import java.util.Scanner;
import java.lang.*;

public class commercials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        int array[] = new int[n];
        
        for (int i = 0; i < array.length; i++) {
          array[i]=scan.nextInt() - p;
        }
        int currSum = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
          currSum = Math.max(0, array[i]+currSum);
          maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
        scan.close();
    }
}