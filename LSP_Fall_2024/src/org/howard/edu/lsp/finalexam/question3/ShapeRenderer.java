package org.howard.edu.lsp.finalexam.question3;

/**
 * Class responsible for rendering shapes.
 */
public class ShapeRenderer {
    public void renderShape(String shapeType) {
        Shape shape = ShapeFactory.getInstance().getShape(shapeType);
        shape.draw();
    }
}