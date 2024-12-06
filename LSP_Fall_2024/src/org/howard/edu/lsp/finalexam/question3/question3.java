package org.howard.edu.lsp.finalexam.question3;

// Shape Interface
public interface Shape {
    void draw();
}

// Circle Class
public class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle Class
public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Triangle Class
public class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// ShapeFactory Singleton
public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {}

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        throw new IllegalArgumentException("Unknown shape type: " + shapeType);
    }
}

// ShapeRenderer
public class ShapeRenderer {
    public void renderShape(String shapeType) {
        Shape shape = ShapeFactory.getInstance().getShape(shapeType);
        shape.draw();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();
        renderer.renderShape("circle");
        renderer.renderShape("rectangle");
        renderer.renderShape("triangle");
    }
}