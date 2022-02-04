/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Polygon Area

* Link: https://open.kattis.com/problems/polygonarea

* @author Tuan Anh Nguyen

* @version 1.0, 23/01/2022

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.17 */

import java.util.*;

public class polygonarea {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = Integer.parseInt(sc.next());
            if(n == 0) break;
            ArrayList<Long> x = new ArrayList<Long>();
            ArrayList<Long> y = new ArrayList<Long>();
            for(int i = 0; i < n; i++) {
                x.add(Long.parseLong(sc.next()));
                y.add(Long.parseLong(sc.next()));
            }
            double area = calculateArea(x, y);
            boolean cw = false;
            if (area >= 0) cw = true;
            System.out.println(cw ? String.format("CW %.1f", area) : String.format("CCW %.1f", -area));
        }
    }

    private static double calculateArea(ArrayList<Long> x, ArrayList<Long> y) {
        long sum = (x.get(0) - x.get(x.size() - 1)) * (y.get(0) + y.get(y.size() - 1));
        for(int i = 1; i < x.size(); i++) {
            sum += (x.get(i) - x.get(i - 1)) * (y.get(i) + y.get(i - 1));
        }
        return (0.5 * sum);
    }
}