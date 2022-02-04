/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Convex Polygon Area

* Link: https://open.kattis.com/problems/convexpolygonarea

* @author Tuan Anh Nguyen

* @version 1.0, 23/01/2022

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.16 */

import java.util.*;
import java.math.*;
import java.text.*;

public class convexpolygonarea {
    public static void main(String args[]) {
        DecimalFormat df = new DecimalFormat("###.#");
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++) {
            String line = new String(sc.nextLine());
            String[] array = line.split(" ");
            
            ArrayList<Integer> x = new ArrayList<Integer>();
            ArrayList<Integer> y = new ArrayList<Integer>();
            for(int j = 1; j < array.length; j++) {
                if (j%2 == 1) x.add(Integer.parseInt(array[j]));
                else y.add(Integer.parseInt(array[j]));
            }
            System.out.println(df.format(calculateArea(x, y)));
        }
    }
    
    public static double calculateArea(ArrayList<Integer> x, ArrayList<Integer> y) {
        double sum = x.get(x.size() - 1) * y.get(0) - y.get(y.size() - 1) * x.get(0);
        for(int i = 0; i < x.size() - 1; i++) sum += x.get(i) * y.get(i + 1);
        for(int i = 0; i < y.size() - 1; i++) sum -= y.get(i) * x.get(i + 1);
        return Math.abs(sum / 2);
    }
}