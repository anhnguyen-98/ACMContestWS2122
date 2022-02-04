/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Hitting the Targets

* Link: https://open.kattis.com/problems/hittingtargets

* @author Tuan Anh Nguyen

* @version 1.0, 23/01/2022

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.12 */

import java.util.*;

public class hittingtargets {
    public static void main(String args[]) {
       
        ArrayList<Rectangle> rectangleArray = new ArrayList<Rectangle>();
        ArrayList<Circle> circleArray = new ArrayList<Circle>();
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < m; i++) {
            String line = new String(sc.nextLine());
            String[] array = line.split(" ");
            if (array[0].equals("rectangle")) {
                rectangleArray.add(new Rectangle(Integer.parseInt(array[1]),Integer.parseInt(array[2]),
                Integer.parseInt(array[3]),Integer.parseInt(array[4])));
            } else {
                circleArray.add(new Circle(Integer.parseInt(array[1]),Integer.parseInt(array[2]),
                Integer.parseInt(array[3])));
            }
        }
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            int count = 0;
            String line = new String(sc.nextLine());
            String[] array = line.split(" ");
            int x = Integer.parseInt(array[0]);
            int y = Integer.parseInt(array[1]);
            System.out.println(inRectangle(rectangleArray, x, y) + inCircle(circleArray, x, y));
        }
    }
    
    static class Rectangle {
        public int x1, y1, x2, y2;
        public Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
    
    static class Circle {
        public int x, y, r;
        public Circle(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
    }
    
    static int inRectangle(ArrayList<Rectangle> array, int x, int y) {
        int count = 0;
        for (Rectangle rect : array) {            
            if (x >= rect.x1 && x <= rect.x2 && y >= rect.y1 && y <= rect.y2) count++;
        }
        return count;
    }
    
    static int inCircle(ArrayList<Circle> array, int x, int y) {
        int count = 0;
        for (Circle cir : array) {            
            int dX = x - cir.x;
            int dY = y - cir.y;
            if (dX * dX + dY * dY <= cir.r * cir.r) count++;
        }
        return count;
    }
}