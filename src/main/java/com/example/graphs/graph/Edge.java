package com.example.graphs.graph;

import java.awt.*;
import java.util.Objects;

public class Edge {

    Node endNode;
    float weight;
    Color color;

    public Edge(Node endNode, float weight, Color color) {
        this.endNode = endNode;
        this.weight = weight;
        this.color = color;
    }

    public Edge(Node endNode, float weight) {
        this(endNode, weight, Color.BLACK);
    }

    public Edge(Edge edge) {
        this(edge.endNode, edge.weight, edge.color);
    }

    public Edge(Node endNode) {
        this(endNode, 1, Color.BLACK);
    }

    public Node getEndNode() {
        return new Node(endNode);
    }

    public float getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return Objects.equals(endNode, edge.endNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endNode);
    }
}
