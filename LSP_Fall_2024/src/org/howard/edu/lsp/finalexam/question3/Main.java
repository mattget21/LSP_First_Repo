package org.howard.edu.lsp.finalexam.question3;

/**
 * Main class for demonstrating shape rendering.
 */
public class Main {
    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");
        renderer.renderShape("rectangle");
        renderer.renderShape("triangle");
    }
}