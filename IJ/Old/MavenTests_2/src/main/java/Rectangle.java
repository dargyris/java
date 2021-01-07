import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Rectangle implements Shape {
    int sides;
    String name;

    public Rectangle() {
        this.sides = 4;
        this.name = "Rectangle";
    }

    public Rectangle(int sides) throws IllegalArgumentException {
        if (sides != 4) {
            throw new IllegalArgumentException("Bad input of sides.");
        }
        this.sides = sides;
        this.name = "Rectangle";
    }

    public Rectangle(int sides, String name) {
        this.sides = sides;
        this.name = name;
    }

    public int getSides() {
        return sides;
    }

    public String getName() {
        return name;
    }

    @Override
    public java.awt.Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }
}
