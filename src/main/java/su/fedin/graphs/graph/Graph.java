package su.fedin.graphs.graph;

import java.awt.*;
import java.util.*;

public class Graph {
    Map<Node, Set<Edge>> matrix = new HashMap<>();
    private int sequence = 0;

    public void addNode(Node node){
        if(node.number == 0){
            node.number = ++sequence;
            matrix.put(node, new HashSet<>());
        }
    }

    public void addEdge(Node startNode, Edge edge){
        Optional<Node> end = matrix.keySet().stream()
                .filter(x->x==edge.endNode)
                .findFirst();
        if (end.isEmpty())
            throw new RuntimeException("Такой вершины еще нет");
        matrix.get(startNode).add(edge);
    }

    public Graph(Graph graph){
        graph.matrix.keySet().stream()
                .map(x->this.matrix.put(x, new HashSet<>(graph.matrix.get(x))))
                .count();
    }

    public void setNodeColor(Node node, Color color){
        matrix.keySet().stream()
                .filter((x->x == node))
                .findFirst()
                .ifPresent(x->x.color = color);
    }

    public void setNodeWeight(Node node, float weight){
        matrix.keySet().stream()
                .filter((x->x == node))
                .findFirst()
                .ifPresent(x->x.weight = weight);
    }

    public void setNodeName(Node node, String name){
        matrix.keySet().stream()
                .filter((x->x == node))
                .findFirst()
                .ifPresent(x->x.name = name);
    }
}
