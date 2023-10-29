package su.fedin.graphs.graph;

import java.awt.*;
import java.util.Objects;

public class Node {
    int number;
    String name;
    float weight;
    Color color;

    public Node(String name, float weight, Color color) {
        this(0, name, weight, color);
    }

    public Node(String name, float weight) {
        this(0, name, weight, Color.BLACK);
    }

    public Node(String name) {
        this(0, name, 1, Color.BLACK);
    }

    Node(int number, String name, float weight, Color color) {
        this.number = number;
        this.name = name;
        this.weight = weight;
        this.color = color;
    }


    public Node(Node node) {
        this(node.number, node.name, node.weight, node.color);
    }



    public int getNumber() {
        return number;
    }

    public String getName() {
        if (name != null)
            return name;
        return String.valueOf(number);
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
        Node node = (Node) o;
        return number == node.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
