/** * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2021-2022 

* Problem: Torn To Pieces

* Link: https://open.kattis.com/problems/torn2pieces

* @author Tuan Anh Nguyen

* @version 1.0, 16/01/2022

* Method : Ad-Hoc 

* Status : Accepted 

* Runtime: 0.13 */

import java.io.*;
import java.util.*;

public class torn2pieces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Graph graph = new Graph();
        ArrayList<String> exists = new ArrayList<String>();
        for(int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] lineArray = line.split(" ");
            String station = lineArray[0];
            boolean contains = exists.contains(station);
            Node node;
            if(!contains) {
                exists.add(station);
                node = new Node(station);
            }
            else node = graph.getNode(station);
            
            for(int j = 1; j < lineArray.length; j++) {
                if(exists.contains(lineArray[j])) {
                    node.connections.add(graph.getNode(lineArray[j]));
                    graph.getNode(lineArray[j]).connections.add(node);
                }
                else {
                    exists.add(lineArray[j]);
                    graph.addNode(lineArray[j], new Node(lineArray[j]));
                    node.connections.add(graph.getNode(lineArray[j]));
                    graph.getNode(lineArray[j]).connections.add(node);                    
                }
            }
            graph.addNode(station, node);
        }
        String lastLine[] = sc.nextLine().split(" ");
        String start_station = lastLine[0];
        String end_station = lastLine[1];
        
        if(graph.graph.get(start_station) == null && graph.graph.get(end_station) == null)
            System.out.println("no route found");
        else {
            List<Node> route = bfs(graph.getNode(start_station), graph.getNode(end_station));
            if (route.size() > 1) {
                for (int i = 0; i < route.size(); i++) {
                    System.out.print(route.get(i) + " ");
                }
            } else {
                System.out.println("no route found");
            }
        }
        sc.close();
        
    }
    
    static class Graph {
        Map<String, Node> graph;
        public Graph() {
            graph = new HashMap<String, Node>();
        }
        public void addNode(String name, Node n) {
            graph.put(name, n);
        } 
        public Node getNode(String name) {
            return graph.get(name);
        }
    }

    static class Node {
        public ArrayList<Node> connections;
        String name;
        boolean visited;
        public Node(String name) {
            this.name = name;
            this.visited = false;
            connections = new ArrayList<Node>();
        }
        public String toString() {
            return name;
        }
        public boolean equals(Object o) {
            return ((Node) o).name.equals(name);
        }
    }
    
    static List<Node> bfs(Node start_node, Node end_node) {
        List<Node> route = new ArrayList<Node>();
        Queue<Node> queue = new LinkedList<Node>();
        Map<Node, Node> pairs = new HashMap<Node, Node>(); 
        start_node.visited = true;
        queue.add(start_node);
        while(!queue.isEmpty()) {
            Node v = queue.remove();
            if(v.equals(end_node)) break;
            else {
                for(Node w : v.connections) {
                    if(!w.visited) {
                        queue.add(w);
                        w.visited = true;
                        pairs.put(w, v);
                    }
                }
            }
        }
        Node node = end_node;
        while (node != null) {
            route.add(node);
            node = pairs.get(node);
        }
        Collections.reverse(route);
        return route;
    }

}