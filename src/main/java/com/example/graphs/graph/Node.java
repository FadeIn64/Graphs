package com.example.graphs.graph;

import java.awt.*;
import java.util.Objects;

public class Node {
    int number;
    String name;
    float weight;
    Color color;

    public Node(int number, String name, float weight, Color color) {
        this.number = number;
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Node(int number) {
        this(number, null, 1, Color.BLACK);
    }

    public Node(Node node) {
        this(node.number, node.name, node.weight, node.color);
    }

    public Node(int number, String name) {
        this(number, name, 1, Color.BLACK);
    }

    void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
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
